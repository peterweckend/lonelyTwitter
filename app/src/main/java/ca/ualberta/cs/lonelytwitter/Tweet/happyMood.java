package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public class happyMood extends mood {
    public happyMood() {
        super();
    }

    public happyMood(Date date) {
        super(date);
    }

    public void moodmessage(){
        System.out.println("I am feeling happy!");
    }
}
