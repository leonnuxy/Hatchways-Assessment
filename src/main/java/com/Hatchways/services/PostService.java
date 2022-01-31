package com.Hatchways.services;

import com.Hatchways.domain.Post;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface PostService {

    void addPosts(Post[] posts);
    void addPost(Post post);
    List<Post> getPosts(String content,String sortBy, String order) throws IOException, URISyntaxException;

}
