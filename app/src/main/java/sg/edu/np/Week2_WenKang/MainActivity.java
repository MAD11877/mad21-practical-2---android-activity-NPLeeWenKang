package sg.edu.np.Week2_WenKang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Debug","OnCreate");

        Button followBtn = (Button) findViewById(R.id.followBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (followBtn.getText() == "Follow"){
                    followBtn.setText("Unfollow");
                }else{
                    followBtn.setText("Follow");
                }

            }
        });
    }
    @Override
    protected void onStart( ) {
        super.onStart();
        User u1 = new User("John", "Super User", 101, false);
        Log.i("Debug",u1.getName());
        Log.i("Debug",u1.toString());
        Log.i("Debug","onStart");
//        String id = 1010
//        TextView textView = findViewById(R.id.);
//        textView.setText(view)
    }
    @Override
    protected void onResume( ) {
        super.onResume();
        Log.i("Debug","onResume");
    }
    @Override
    protected void onPause( ) {
        super.onPause();
        Log.i("Debug","onPaused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Debug","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Debug","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Debug","onRestart");
    }
}