package lesson6_hw.part4;

import java.sql.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts post;
    private String title;
    private Date date;

    public ForumPollsOptions(long id, ForumPosts post, String title, Date date) {
        this.id = id;
        this.post = post;
        this.title = title;
        this.date = date;
    }
}
