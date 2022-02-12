package com.company;

import com.Animal;
import com.Eage;
import com.Shark;
import com.Turtle;

import java.util.Stack;



        public class Main {

            public static void main(String[] args) {

                Turtle turtle = new Turtle();
                Eage eage = new Eage();
                Shark shark = new Shark();

                Animal[] animals = {new Turtle(), new Eage(), new Shark()};

                for (Animal a : animals) {
           if(a instanceof Turtle) {
                   ( (Turtle)a).swim();

                    if(a instanceof Eage)(
                            (Eage)a).fly();
                    if(a instanceof Shark) (
                            (Shark)a).attack();
                }}}
    }

