package com.example.hydra;

import com.example.hydra.dto.JavaPerson;
import com.example.hydra.dto.KotlinPerson;
import com.example.hydra.dto.ScalaPersonInJava;
import com.example.hydra.dto.ScalaPerson;

public class JavaExample {

    public static void main(String[] args) {
        System.out.println("Hello World");

        JavaPerson javaPerson = new JavaPerson("Yuhua", 28);
        System.out.println(javaPerson);

        KotlinPerson kotlinPerson = new KotlinPerson("Yuhua", "Mai", 28);
        System.out.println(kotlinPerson);

        ScalaPerson scalaPerson = new ScalaPerson("Yuhua", "Mai", 28);
        System.out.println(scalaPerson);

        ScalaPersonInJava scalaPersonInJava = new ScalaPersonInJava("Yuhua", "Mai", 28);
        System.out.println(scalaPersonInJava);
    }
}
