package com.liumapp.demo.sdk.core;

class Rabbit extends Mammal{
    private static String name = "Rabbit";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Rabbit moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Rabbit put out it's tongue and drink.");
    }
}