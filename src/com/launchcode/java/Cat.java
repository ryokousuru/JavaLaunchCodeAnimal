package com.launchcode.java;
public class Cat extends Animal {
    public Cat(){
        super(7);                            //references the superclasses 'animal' constructor
        System.out.println("Here is a nice little cat!!");
    }
    public void meow(){
        System.out.println("It's a little meower kitten!!  :-D");
    }
    public void jump(){
        System.out.println("The kitten leaps onto the tree limb.");
    }
    public void lick(){
        System.out.println("The kitten licks itself in order to take a bath.");
    }
    public void bite(){
        System.out.println("The kitty jumps up on the table and began eating his TV dinner!");
    }
    public void eat(){
        System.out.println("Ouch!!  It bit my nose!!");
    }
    public void sleep(){                        //renaming this method will prevent method overriding
        System.out.println("Making a purring noise while asleep!");
    }
}