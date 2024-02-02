package com.dc.oop;
import com.dc.oop.Animal;

    public class Dog implements Animal {

        private int legs;

        public Dog() {
            System.out.println("this is a dog");
        }

        public Dog(int legs) {
            this.legs = legs;
            System.out.println("this dog has " + legs);
        }

        public void animalSound() {
            System.out.println("this dog makes woof");
        }

        public void animalName() {
            System.out.println("this dog name is jack");
        }
    }