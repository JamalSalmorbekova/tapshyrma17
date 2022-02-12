package com;

public class Turtle extends Animal{
    @Override
    public void eat(){
        System.out.println("Turtle is eating");

    }

    public boolean swim(){
        System.out.println("Turtle is swimming");

        return true;
    }

    @Override
    public String toString() {
        swim();
        return super.toString();

    }
}
