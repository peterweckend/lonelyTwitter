package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.Tweet.Tweet;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
