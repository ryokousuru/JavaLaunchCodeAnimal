package com.launchcode.java;

 abstract class Monorail {
     String configuration;
     String manufacturer;

     Monorail(String configuration, String manufacturer){
         this.configuration = configuration;
         this.manufacturer = manufacturer;
     }

    abstract void display();
}
