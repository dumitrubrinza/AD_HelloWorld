package ie.wit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

    public void showGreeting(View v) {
        String greetingText = getString(R.string.greeting_text);
        Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show();
    }

    public void showGreeting2(View v) {
        String greetingText = getString(R.string.greeting_text2);
        Toast.makeText(this, greetingText, Toast.LENGTH_LONG).show();
    }

}
