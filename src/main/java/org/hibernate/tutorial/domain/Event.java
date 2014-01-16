package org.hibernate.tutorial.domain;

import java.util.Date;

/**
 * Created by malance on 14-1-15.
 */
public class Event {
    private Long id;
    private String title;
    private Date date;

    public Event() {}

    public Long getId(){
        return id;
    }

    private void SetId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}