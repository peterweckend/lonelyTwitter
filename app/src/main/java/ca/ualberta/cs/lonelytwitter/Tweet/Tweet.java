package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public abstract class Tweet implements Tweetable {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    private Date date;
    private String message;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
    }

    public Tweet() {
        super();
        this.date = new Date();

    }

    public abstract Boolean isImportant();
}
