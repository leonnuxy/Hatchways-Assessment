package com.Hatchways.repositories;

import com.Hatchways.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("PostRepository")
public class PostRepositoryImplementation implements PostRepository {

    private static List<Post> postList = new ArrayList<>();

    @Override
    public Post[] findAll() {
        return null;
    }

    @Override
    public void addPost(Post post) {
        postList.add(post);
    }
}
