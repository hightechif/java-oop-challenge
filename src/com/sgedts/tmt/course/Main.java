package com.sgedts.tmt.course;

public class Main {

    private static void interfaceChallenge() {
        Rectangle square = new Rectangle();
        square.getSides();
        square.getArea(40, 40);
        System.out.println();
    }

    private static void abstractChallenge() {
        Dog bulldog = new Dog();
        bulldog.makeSound();
        bulldog.eat();
        System.out.println();
    }

    private static void polymorphismChallenge() {
        Java java = new Java();
        java.displayInfo();
        Golang go = new Golang();
        go.displayInfo();
        Language english = new Language();
        english.displayInfo();
        React react = new React();
        react.displayInfo();
        System.out.println();
    }

    public static void main(String[] args) {
	    System.out.println("TMT Challenge Week 1\n");
        // Challenge No. 1
        interfaceChallenge();
        // Challenge No. 2
        abstractChallenge();
        // Challenge No. 3
        polymorphismChallenge();
    }
}
