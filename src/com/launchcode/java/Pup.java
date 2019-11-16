package com.launchcode.java;
public class Pup extends Animal {
    public Pup(){
        super(8);           //references the superclasses 'animal' constructor
        System.out.println("A brand new baby puppy!");
    }
    public void woof(){
        System.out.println("It's a woofer pup!");
    }
    public void playAround(){
        System.out.println("The pup plays around with the ball.");
    }
    public void fetch(){
        System.out.println("Run over there and fetch the stick.");
    }
    public void jump(){
        System.out.println("The puppy jumps up to catch a kibble in his mouth.");
    }
    public void chews(){
        System.out.println("The pup is chewing on my homework.");
    }
    public void eat(){
        System.out.println("The puppy is biting into something");
    }
    public void sleep(){                //renaming this method will prevent method overriding
        System.out.println("Sleeping in the puppy bed!!");
    }
}