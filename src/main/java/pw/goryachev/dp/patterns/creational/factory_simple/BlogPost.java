package pw.goryachev.dp.patterns.creational.factory_simple;

/**
 * Created by morgan on 24.06.2020
 */

public class BlogPost extends Post {

    private String author;

    private String[] tags;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}