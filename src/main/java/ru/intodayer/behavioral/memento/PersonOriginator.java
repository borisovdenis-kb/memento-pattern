package ru.intodayer.behavioral.memento;

import java.util.List;

public class PersonOriginator {
    private String name;
    private Integer age;
    private List<String> girlFriendsNames;
    private String secretKey = "67867687d@udyfu";

    public PersonOriginator() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getGirlFriendsNames() {
        return girlFriendsNames;
    }

    public void setGirlFriendsNames(List<String> girlFriendsNames) {
        this.girlFriendsNames = girlFriendsNames;
    }

    public Memento saveState() {
        Memento memento = new Memento();
        memento.setName(this.name);
        memento.setAge(this.age);
        memento.setGirlFriendsNames(this.girlFriendsNames);
        memento.setSecretKey(this.secretKey);

        return memento;
    }

    public void restoreState(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.girlFriendsNames = memento.getGirlFriendsNames();
        this.secretKey = memento.getSecretKey();
    }

    @Override
    public String toString() {
        return "PersonOriginator{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", girlFriendsNames=" + girlFriendsNames +
                '}';
    }
}
