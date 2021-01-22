package com.example.BLOGGO.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class blogInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sno;

    private String topic;
    private String description;
    private String body;

    public blogInfo() {
    }

    public blogInfo(String topic, String description, String body) {
        this.topic = topic;
        this.description = description;
        this.body = body;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
