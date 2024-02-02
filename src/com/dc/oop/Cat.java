package com.dc.oop;
import com.dc.oop.Animal;

public class Cat implements Animal {


        private int legs;

        public Cat() {
            System.out.println("this is a cat");
        }

        public Cat(int legs) {
            this.legs = legs;
            System.out.println("this cat has " + legs);
        }

        public void animalSound() {
            System.out.println("this cat makes meow");
        }

        public void animalName() {
            System.out.println("this cat name is joe");
        }
    }