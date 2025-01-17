package com.munna.www;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
private String name;
private int age;

public Person(String name, int age)
{
this.name = name;
this.age = age;
}
public String toString()
{
return "Person: {name='" + name + "', age=" + age + "}";
}
}

public class Test
{
public static void main(String[] args)
{

Person person = new Person("Alan", 30);


// Serialize the object
//try with resource
try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("suman.txt")))
{
out.writeObject(person);
System.out.println("Object serialized: " + person);
}
catch (IOException e)
{
e.printStackTrace();
}

//Deserialize the object
//try with resources
try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("suman.txt")))
{
Person deserializedPerson = (Person) in.readObject();
System.out.println("Object deserialized: " + deserializedPerson);
}
catch (IOException | ClassNotFoundException e)
{
e.printStackTrace();
}

}
}

