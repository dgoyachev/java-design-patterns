package pw.goryachev.dp.patterns.creational.factory_simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFactoryTest {

    @Test
    void createPost() {
        Post newsPost = PostFactory.createPost("news");
        assertEquals(newsPost.getClass(), NewsPost.class);

        Post blogPost = PostFactory.createPost("blog");
        assertEquals(blogPost.getClass(), BlogPost.class);

        Post productPost = PostFactory.createPost("product");
        assertEquals(productPost.getClass(), ProductPost.class);
    }
}