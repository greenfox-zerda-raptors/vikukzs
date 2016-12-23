package greenfox.com.christmasapp;

import java.util.Date;


/**
 * Created by Zsuzska on 2016. 12. 23..
 */

public class Message {
    String username;
    String body;
    Date time;

    public Message(){}

    public Message(String username, String body) {
        this.username = username;
        this.body = body;
        this.time = new Date();
    }

}
