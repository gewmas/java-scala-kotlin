#### Overview
This project demos that Java, Kotlin and Scala code living in the same package in the same project with maven build file to build them in a sequence that produce different .jar files.

#### Maven pom.xml
Assume only Java project depends on Kotlin and Scala, thus compile Scala first, then Kotlin, and finally Java.
Hack to put Scala build in generate-resources, Kotlin in process-resources and finally Java in compile.

#### Build sequence
1. Building Scala first, can't access Kotlin. But the plugin supports Java.
2. Kotlin plugin builds after Scala but before Java. The plugin must support Java.
3. Building Java last. After Scala and Kotlin is built.

#### Try command
```
mvn clean install
java -jar target/java-example-jar-with-dependencies.jar
java -jar target/kotlin-example-jar-with-dependencies.jar
java -jar target/scala-example-jar-with-dependencies.jar
```

#### Result
```
Yuhuas-iMac:java-scala-kotlin yuhuamai$ java -jar target/kotlin-example-jar-with-dependencies.jar
============Kotlin============
[1, 2, 3]
ScalaPerson(Yuhua,Mai,28)
KotlinPerson(firstName='Yuhua', lastName='Mai', age=28)
JavaPerson{name='Yuhua', age=23}

Yuhuas-iMac:java-scala-kotlin yuhuamai$ java -jar target/java-example-jar-with-dependencies.jar
============Java============
JavaPerson{name='Yuhua', age=28}
KotlinPerson(firstName='Yuhua', lastName='Mai', age=28)
ScalaPerson(Yuhua,Mai,28)
ScalaPersonInJava(Yuhua,Mai,28)

Yuhuas-iMac:java-scala-kotlin yuhuamai$ java -jar target/scala-example-jar-with-dependencies.jar
============Scala============
JavaPerson{name='Yuhua', age=28}
ScalaPerson(Yuhua,Mai,28)
```
