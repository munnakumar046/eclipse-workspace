package com.annum.www;

//package Java Constructor;

//public class Dog {
public class Dog {
 // intialize the instance variable
 private String name;
 private String color;

 public Dog(String name, String color) {
     this.name = name;
     this.color = color;
 }

 public static void main(String[] args) {
     Dog myDog = new Dog("Rocky", "white");
     System.out.println("dog name: " + myDog.name);

     System.out.println("dog color: " + myDog.color);

 }

}

