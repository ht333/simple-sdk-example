package com.liumapp.demo.sdk.core;

class Snake extends Reptile implements Huntable<Animal> {
    private static String name = "Snake";
    public String getName(){
        return this.name;
    }

    public void move(String destination){
        System.out.println("Snake crawled to " + destination + ".");
    }

    public void drink(){
        System.out.println("Snake dived into water and drink.");
    }

    public void hunt(Animal a) {
        System.out.println("Snake coiled " + a.getName() + " and eated it");
    }
}