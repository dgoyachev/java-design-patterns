package pw.goryachev.dp.patterns.creational.factory_simple;

/**
 * Created by morgan on 24.06.2020
 */

public class PostFactory {

    public static Post createPost(String type) {
        switch(type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
