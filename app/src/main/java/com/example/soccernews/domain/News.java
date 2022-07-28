package com.example.soccernews.domain;

public class News {
    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
