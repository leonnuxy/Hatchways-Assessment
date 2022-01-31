package com.Hatchways.controller;

import com.Hatchways.domain.Post;
import com.Hatchways.exception.OrderInvalidException;
import com.Hatchways.exception.SortByInvalidException;
import com.Hatchways.exception.TagsNotFoundException;
import com.Hatchways.services.PostService;
import com.Hatchways.services.PostServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.net.URISyntaxException;
import java.util.*;

@RequestMapping
@RestController
public class PostController {

    final private PostService postService;
    private final String ID = "id";
    private final String AUTHORID = "authorId";
    private final String LIKES = "likes";
    private final String POPULARITY = "popularity";
    private final String READS = "reads";
    private final String ASC = "asc";
    private final String DESC = "desc";

    @Autowired
    public
    PostController(@Qualifier("PostServiceImplementation") PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/api/ping")
    @ResponseBody
    public ResponseEntity sendViaResponseEntity() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/api/posts")
    @Cacheable("Posts")
    public List<Post> getPosts(@RequestParam String tags,@RequestParam(required = false) String sortBy, @RequestParam(required = false) String order) throws IOException, URISyntaxException {
        if(!sortBy.equals(ID) && !sortBy.equals(AUTHORID) && !sortBy.equals(POPULARITY) && !sortBy.equals(LIKES) && !sortBy.equals(READS))
            throw new SortByInvalidException(sortBy);
        if(order != null && !order.equals(ASC) && !order.equals(DESC))
            throw new OrderInvalidException(order);
        if(tags == null)
            throw  new TagsNotFoundException();
        return postService.getPosts(tags,sortBy,order);
    }
    public void addPost(Post post) {
    }
    public void setPostService(PostServiceImplementation postService2) {
    }
    public List<Post> getAllPosts() {
        return null;
    }

}
