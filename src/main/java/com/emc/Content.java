package com.emc;

public class Content {

    private String content;

    public Content of(String content){
        this.content = content;
        return this;
    }

    public String getContent() {
        return content;
    }
}
