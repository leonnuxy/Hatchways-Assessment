package com.hatchways.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.Hatchways.controller.PostController;
import com.Hatchways.domain.Post;
import com.Hatchways.repositories.PostRepositoryImplementation;
import com.Hatchways.services.PostServiceImplementation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class PostContollerTest {

    @Test
    public void testPostContoller() throws Exception {
        Post post = new Post();
        post.setId(1);
        post.setTitle("Test title");
        post.setBody("Test body");
        post.setAuthor("Test author");
        post.setTags(new String[] {"tag1", "tag2"});
        PostRepositoryImplementation postRepository = new PostRepositoryImplementation();
        PostServiceImplementation postService = new PostServiceImplementation(postRepository);
        PostController postController = new PostController(postService);
        postController.setPostService(postService);
        postController.addPost(post);
        List<Post> posts = postController.getAllPosts();
        assertEquals(1, posts.get(0).getId());
        assertEquals("Test title", posts.get(0).getTitle());
        assertEquals("Test body", posts.get(0).getBody());
        assertEquals("Test author", posts.get(0).getAuthor());
    }
    
}
