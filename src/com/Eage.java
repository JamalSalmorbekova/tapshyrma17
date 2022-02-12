package com;

public class Eage extends Animal{

    @Override
    public void eat(){
        System.out.println("Eage is eating");

    }

    public void fly(){
        System.out.println("Eage is flying");
    }

    @Override
    public String toString() {
        fly();
        return super.toString();
    }
}
