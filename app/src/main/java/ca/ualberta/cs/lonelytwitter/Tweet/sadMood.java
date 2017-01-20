package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public class sadMood extends mood {
    public sadMood(Date date) {
        super(date);
    }

    public sadMood() {
        super();
    }

    public void moodmessage(){
        System.out.println("I am feeling sad.");
    }
}
