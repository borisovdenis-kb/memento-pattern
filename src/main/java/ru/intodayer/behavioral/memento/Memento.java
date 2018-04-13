package ru.intodayer.behavioral.memento;

import java.util.List;

public class Memento {
    private String name;
    private Integer age;
    private List<String> girlFriendsNames;
    private String secretKey;

    public Memento() {}

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getAge() {
        return age;
    }

    void setAge(Integer age) {
        this.age = age;
    }

    List<String> getGirlFriendsNames() {
        return girlFriendsNames;
    }

    void setGirlFriendsNames(List<String> girlFriendsNames) {
        this.girlFriendsNames = girlFriendsNames;
    }

    String getSecretKey() {
        return secretKey;
    }

    void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
