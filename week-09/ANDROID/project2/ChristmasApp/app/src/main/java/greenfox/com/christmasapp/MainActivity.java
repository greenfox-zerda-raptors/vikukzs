package greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static greenfox.com.christmasapp.R.id.button2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button) findViewById(R.id.button2);
        sendButton.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        

    }
}
