package com.example.articleapp;
public class Article {
    private String ArticleID;  // Make sure to match the exact field names
    private String Title;
    private String ImageURL;
    private String Category;  // Not used in your UI, but included if needed
    private String PublicationDate;  // Not used in your UI, but included if needed

    // Getters
    public String getArticleID() {
        return ArticleID;
    }

    public String getTitle() {
        return Title;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public String getCategory() {
        return Category;
    }

    public String getPublicationDate() {
        return PublicationDate;
    }

    // Setters
    public void setArticleID(String ArticleID) {
        this.ArticleID = ArticleID;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setImageURL(String ImageURL) {
        this.ImageURL = ImageURL;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setPublicationDate(String PublicationDate) {
        this.PublicationDate = PublicationDate;
    }
}
