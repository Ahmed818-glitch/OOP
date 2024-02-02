package com.dc.oop;
import com.dc.oop.Animal;

    public class Sheep implements Animal {

        private int legs;
        public Sheep() {
            System.out.println("this is a sheep");
        }

        public Sheep(int legs){
            this.legs=legs;
            System.out.println("this sheep has " + legs);
        }

        public void animalSound() {
            System.out.println("this sheep makes baa");
        }
        public void animalName()
        {
            System.out.println("this sheeps name is john");
        }

}