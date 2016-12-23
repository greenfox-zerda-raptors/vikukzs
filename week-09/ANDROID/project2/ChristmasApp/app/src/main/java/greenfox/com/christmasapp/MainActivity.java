package greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sendButton;
    ListView listView;
    ArrayList<Message> messagesList;
    MessagesAdapter msgAdapter;
    EditText textField;
    String textMesage;
    Retrofit retrofit;
    MessageService service;

    public void refreshMessages(){
        service = retrofit.create(MessageService.class);
        service.getMessages().enqueue(new Callback<ArrayList<Message>>() {
            @Override
            public void onResponse(Call<ArrayList<Message>> call, Response<ArrayList<Message>> response) {
                msgAdapter.clear();
                msgAdapter.addAll(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<Message>> call, Throwable t) {

            }
        });
    }

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

        retrofit = new Retrofit.Builder()
                .baseUrl("http://zerda-raptor.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        refreshMessages();
    }

    @Override
    public void onClick(View v) {
        if (v == sendButton){
            Message m = new Message("Zsuzska", textField.getText().toString());
            msgAdapter.add(m);
            service.postMessages(new Wrapper(m)).enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {

                }
            });
            
            refreshMessages();

            textField.setText("");
        }
    }
}
