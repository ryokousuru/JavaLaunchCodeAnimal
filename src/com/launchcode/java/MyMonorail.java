package com.launchcode.java;

 class MyMonorail extends Monorail {
     int length;

    public MyMonorail(String configuration, String manufacturer,int length){
        super(configuration, manufacturer);
        this.length = length;
    }
    void display(){
        System.out.println("Watch me go high above traffic like a bird in flight!");
        System.out.println("Configuration: " + this.configuration);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Length: " + this.length);
    }
}
