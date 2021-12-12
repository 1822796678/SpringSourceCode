package com.entites;

public class Person {
    private String name ;
    private Integer age ;

    public String getName() {
        name = "myname";
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
}
