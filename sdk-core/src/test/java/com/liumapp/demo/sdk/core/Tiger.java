package com.liumapp.demo.sdk.core;

class Tiger extends Mammal implements Huntable<Animal> {
    private static String name = "Tiger";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Tiger moved to " + destination + ".");
    }

    public void drink(){
        System.out.println("Tiger lower it's head and drink.");
    }

    public void hunt(Animal a) {
        System.out.println("Tiger catched " + a.getName() + " and eated it");
    }
}