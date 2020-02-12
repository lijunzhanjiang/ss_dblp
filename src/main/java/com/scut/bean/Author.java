package com.scut.bean;/**
 * @author yejh
 * @create 2020-02_07 13:23
 */

import java.util.List;

/**
 * @description: TODO
 **/
public class Author {
    private String name;

    private List<Article> articles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
