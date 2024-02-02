package com.dc.oop;
import com.dc.oop.Animal;

    public class Cow implements Animal {

        private int legs;
    public Cow() {
        System.out.println("this is a cow");
    }

    public Cow(int legs){
        this.legs=legs;
        System.out.println("this cow has " + legs);
    }

        public void animalSound() {
            System.out.println("this cow makes moo");
        }
        public void animalName() {
            System.out.println("this cows name is bob");
        }
    }
