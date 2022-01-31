package com.Hatchways.domain;

import java.util.List;

public class Post {

    public int id;
    public int authorId;
    public String author;
    public int likes;
    public float popularity;
    public int reads;
    private List<String> tags ;

    public int getId() {
        return id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public float getPopularity() {
        return popularity;
    }

    public int getReads() {
        return reads;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String[] strings) {
    }

    public void setBody(String string) {
    }

    public void setAuthor(String string) {
    }

    public Object getTitle() {
        return null;
    }

    public Object getBody() {
        return null;
    }

    public void setTitle(String string) {
    }

    public void setTags(String[] strings) {
    }
}
