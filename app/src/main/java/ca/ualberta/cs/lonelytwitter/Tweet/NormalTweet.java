package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.Tweet.Tweet;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
