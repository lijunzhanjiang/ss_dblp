package com.scut.bean;/**
 * @author yejh
 * @create 2020-02_07 13:24
 */

import java.util.List;

/**
 * @description: TODO
 **/
public class Article {
    private String title;

    private List<String> keyWords;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }
}
