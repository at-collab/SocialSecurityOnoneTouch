package safeyourself.socialsecurityononetouch;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import safeyourself.socialsecurityononetouch.Common.Common;

public class MainActivity extends AppCompatActivity {
Button btnlogin,btnsignup;
EditText email,password;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText)findViewById(R.id.em);
        password = (EditText)findViewById(R.id.pass);
        mAuth = FirebaseAuth.getInstance();
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener()
                {
            @Override
            public void onClick(View view) {
             signin();
            }



        });


        btnsignup=(Button)findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });

    }
    public void signin(){
        mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //   Log.d(TAG, "signInWithEmail:success");
                            String s = email.getText().toString();
                            Common.setCurrentUser(s);
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            // Log.w(TAG, "signInWithEmail:failure", task.getException());
                            String s = "Sign up Failed" + task.getException();
                            Toast.makeText(MainActivity.this, s,
                                    Toast.LENGTH_SHORT).show();
                            //  updateUI();
                        }

                        // ...
                    }
                });

    }
    public void updateUI(FirebaseUser user){



        Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);

    }
}
