package com.hatchways.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Hatchways.domain.Post;
import com.Hatchways.repositories.PostRepository;
import com.Hatchways.repositories.PostRepositoryImplementation;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostTest {
    @Test
    public void testPost() {
        Post post = new Post();
        post.setId(1);
        post.setTitle("Test title");
        post.setBody("Test body");
        post.setAuthor("Test author");
        post.setTitle(new String[] {"tag1", "tag2"});
        assertEquals(1, post.getId());
        assertEquals("Test title", post.getTitle());
        assertEquals("Test body", post.getBody());
        assertEquals("Test author", post.getAuthor());
    }

    @Test
    public void testPostRepository() {
        PostRepository postRepository = new PostRepositoryImplementation();
        Post post = new Post();
        post.setId(1);
        post.setTitle("Test title");
        post.setBody("Test body");
        post.setAuthor("Test author");
        post.setTitle(new String[] {"tag1", "tag2"});
        postRepository.addPost(post);
        Post[] posts = postRepository.findAll();
        assertEquals(1, posts[0].getId());
        assertEquals("Test title", posts[0].getTitle());
        assertEquals("Test body", posts[0].getBody());
        assertEquals("Test author", posts[0].getAuthor());
    }

}
