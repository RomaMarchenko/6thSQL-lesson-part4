package lesson6_hw.part4;

import java.sql.Date;

public class ForumPosts {
    private long id;
    private ForumSubcategories subcategory;
    private Users user;
    private long parentPost;
    private String title;
    private String content;
    private boolean isPoll;
    private Date date;
    private String ip;

    public ForumPosts(long id, ForumSubcategories subcategory, Users user, long parentPost, String title, String content, boolean isPoll, Date date, String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }
}
