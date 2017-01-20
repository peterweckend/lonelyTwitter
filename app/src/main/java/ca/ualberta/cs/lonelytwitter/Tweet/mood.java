package ca.ualberta.cs.lonelytwitter.Tweet;

import java.util.Date;

/**
 * Created by PeterWeckend on 2017-01-19.
 */

public abstract class mood {
    private Date date;

    public mood(Date date) {
        this.date = date;
    }

    public mood(){
        this.date = new Date();
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void moodmessage (){
        System.out.println("I feel a mood");
    }
}
