package com.launchcode.java;

import java.util.Scanner;

public abstract class Animal {
    public int age;
    public Animal(int age){
        this.age = age;     //gets the age parameters from subclasses; otherwise returns zip
        System.out.println("The creation of an animal.");
    }
    public void goAround() {
        System.out.println("Going all around from one place to another.");
    }
    //public void eat() {
    //  System.out.println("Munching on an ice pop from the freezer.");     replaced with abstract method
    //}

    public abstract void eat();

    public void sleep(){
        System.out.println("It's time to go sleepy!");
    }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        //Animal ananimal = new Animal(4);      //can no longer make object with the Animal
        Cat ct = new Cat();                     //class since I made it an abstract class
        Pup p = new Pup();
        p.woof();
        System.out.println(p.getAge());
        ct.meow();
        System.out.println(ct.getAge());
        //ananimal.goAround();
        ct.jump();
        p.playAround();
        ct.lick();
        p.fetch();
        ///ananimal.eat();
        ct.eat();
        p.eat();
        p.chews();
        ct.bite();
        ct.sleep(); //override the animal sleep method
        p.sleep();  //override the animal sleep method

        //what if.....
        Animal b = new Pup(); //subclass generalize to a superclass

        //casting

        Object pup = new Pup();
        Pup realPup = (Pup) pup;    //these 2 lines allow access to methods in Pup class
        realPup.fetch();

        Object ob = "west";
        String realD = (String) ob;
        realD.getBytes();                      //reald.xxxx gives access to string methods

        Pup wup = new Pup();                    //creating a new Pup
        if (wup instanceof Animal) {
            Animal animal = (Animal) wup;  //casting operation preserves dog methods
            animal.sleep();
        }
        wup.sleep();
        Scanner scanit = new Scanner(System.in);
        System.out.println("Enter the monorail configuration: ");
        String configuration = scanit.nextLine();
        System.out.println("Enter the monorail manufacturer: ");
        String manufacturer = scanit.nextLine();
        System.out.println("Enter the length of the monorail in feet: ");
        int length = scanit.nextInt();
        scanit.close();

        Monorail mono = new MyMonorail(configuration, manufacturer, length);
        mono.display();
    }

}