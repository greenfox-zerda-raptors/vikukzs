package greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sendButton;
    ListView listView;
    ArrayList<Message> messagesList;
    MessagesAdapter msgAdapter;
    EditText textField;
    String textMesage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button) findViewById(R.id.button2);
        sendButton.setOnClickListener(MainActivity.this);

        messagesList = new ArrayList<>(Arrays.asList(new Message("Zsuzska", "Logging on")));
        listView = (ListView) findViewById(R.id.listViewID);

        msgAdapter = new MessagesAdapter(this, messagesList);

        listView.setAdapter(msgAdapter);

        textField = (EditText) findViewById(R.id.editText2);

        textMesage = textField.getText().toString();

    }

    @Override
    public void onClick(View v) {
        if (v == sendButton){
            msgAdapter.add(new Message("Zsuzska", textField.getText().toString()));
            textField.setText("");
        }
    }
}
