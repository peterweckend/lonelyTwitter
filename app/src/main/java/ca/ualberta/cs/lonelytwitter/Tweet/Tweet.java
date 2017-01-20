package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.ArrayList;
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

    public void addMood(String currentmood){
        if (currentmood == "Happy"){
            mood mymood = new happyMood();
            this.moodList.add(mymood);
        }

        else if (currentmood == "Sad"){
            mood mymood = new sadMood();
            this.moodList.add(mymood);
        }
          
    }

    private Date date;
    private String message;
    private ArrayList<mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moodList = new ArrayList<mood>();
    }

    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
        this.moodList = new ArrayList<mood>();
    }

    public Tweet() {
        this.moodList = new ArrayList<mood>();
        this.date = new Date();

    }

    public abstract Boolean isImportant();
}
