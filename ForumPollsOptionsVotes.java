package lesson6_hw.part4;

import java.sql.Date;

public class ForumPollsOptionsVotes {
    private long id;
    private ForumPollsOptions pollOptions;
    private Users user;
    private Date date;
    private String ip;

    public ForumPollsOptionsVotes(long id, ForumPollsOptions pollOptions, Users user, Date date, String ip) {
        this.id = id;
        this.pollOptions = pollOptions;
        this.user = user;
        this.date = date;
        this.ip = ip;
    }
}
