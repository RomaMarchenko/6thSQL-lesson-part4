package lesson6_hw.part4;

import java.sql.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategories forumCategory;
    private String title;
    private String description;
    private Date date;
    private String ip;

    public ForumSubcategories(long id, ForumCategories forumCategory, String title, String description, Date date, String ip) {
        this.id = id;
        this.forumCategory = forumCategory;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }
}
