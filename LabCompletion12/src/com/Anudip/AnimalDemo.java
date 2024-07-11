package com.Anudip;

class Animal {
 public void move() {
     System.out.println("Animals move in various ways.");
 }
 
 public void makeSound() {
     System.out.println("Animals make different sounds.");
 }
}

class Bird extends Animal {
 @Override
 public void move() {
     System.out.println("Birds fly in the sky.");
 }
 
 @Override
 public void makeSound() {
     System.out.println("Birds chirp and tweet.");
 }
}

class Panthera extends Animal {
 @Override
 public void move() {
     System.out.println("Panthera species move gracefully on land.");
 }

 @Override
 public void makeSound() {
     System.out.println("Panthera species roar loudly.");
 }
}

public class AnimalDemo {
 public static void main(String[] args) {
     Bird sparrow = new Bird();
     Panthera lion = new Panthera();

     System.out.println("Bird actions:");
     sparrow.move();
     sparrow.makeSound();
     
     System.out.println("\nPanthera actions:");
     lion.move();
     lion.makeSound();
 }
}

/*
Bird actions:
Birds fly in the sky.
Birds chirp and tweet.

Panthera actions:
Panthera species move gracefully on land.
Panthera species roar loudly.
*/