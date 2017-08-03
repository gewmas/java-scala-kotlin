package com.example.hydra.dto;

public class JavaPerson {

    private String name;
    private Integer age;

    public JavaPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "JavaPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
