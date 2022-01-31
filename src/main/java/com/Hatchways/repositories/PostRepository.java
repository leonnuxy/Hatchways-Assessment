package com.Hatchways.repositories;

import com.Hatchways.domain.Post;

public interface PostRepository {

    Post[] findAll();
    void addPost(Post post);
}
