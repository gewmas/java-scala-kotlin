package com.example.hydra

import com.example.hydra.dto.{JavaPerson, ScalaPerson}

object ScalaExample {
  def main(args: Array[String]): Unit = {
    println("Hello Scala!")

    println(new JavaPerson("Yuhua", 28))
//    println(new KotlinPerson("Yuhua", "Mai", 28))
    println(ScalaPerson("Yuhua", "Mai", 28))
  }
}