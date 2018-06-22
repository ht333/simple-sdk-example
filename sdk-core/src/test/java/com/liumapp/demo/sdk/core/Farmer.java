package com.liumapp.demo.sdk.core;

class Farmer{
    public void bringWater(String destination){
        System.out.println("Farmer bring water to " + destination + ".");
    }

    public void bringAnimal(Animal a,String destination){
        System.out.println("Farmer bring " + a.getName() + " to " + destination + ".");
    }

    public void feedWater(Animal a){
        this.bringWater("Feeding Room");
        a.move("Feeding Room");
        a.drink();
    }

    public void feedAnimal(Huntable hab, Animal a){
        this.bringAnimal(a,"Feeding Room");
        Animal ht = (Animal)hab;
        ht.move("Feeding Room");
        hab.hunt(a);
    }

}