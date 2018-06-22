package com.liumapp.demo.sdk.core;

public class Main {

    public static void main(String args[]){
        Farmer fm = new Farmer();
        Snake sn = new Snake();
        Goat gt = new Goat();
        Tiger tg = new Tiger();
        Rabbit rb = new Rabbit();

        fm.feedWater(sn);
        fm.feedWater(gt);
        fm.feedWater(tg);

        fm.feedAnimal(tg, rb);
        fm.feedAnimal(sn, rb);
    }

}
