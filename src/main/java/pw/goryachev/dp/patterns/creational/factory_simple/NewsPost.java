package pw.goryachev.dp.patterns.creational.factory_simple;

import java.time.LocalDate;

/**
 * Created by morgan on 24.06.2020
 */

public class NewsPost extends Post{

    private String headline;

    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}