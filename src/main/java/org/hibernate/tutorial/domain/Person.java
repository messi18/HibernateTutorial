package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by malance on 14-1-17.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    private Set<Event> events = new HashSet<Event>();

    private void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Event> getEvents() {
        return this.events;
    }
}
