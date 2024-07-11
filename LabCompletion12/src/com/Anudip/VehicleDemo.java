package com.Anudip;
class Vehicle {
 public void startEngine() {
     System.out.println("Generic engine start sequence.");
 }

 public void stopEngine() {
     System.out.println("Generic engine stop sequence.");
 }
}

class Car extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Starting car engine: Insert key and turn ignition.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping car engine: Turn off ignition and remove key.");
 }
}

class Motorcycle extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Starting motorcycle engine: Pull choke and press starter button.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Stopping motorcycle engine: Turn off ignition switch.");
 }
}

public class VehicleDemo {
 public static void main(String[] args) {
     Car myCar = new Car();
     Motorcycle myMotorcycle = new Motorcycle();

     System.out.println("Car actions:");
     myCar.startEngine();
     myCar.stopEngine();
     System.out.println();

     System.out.println("Motorcycle actions:");
     myMotorcycle.startEngine();
     myMotorcycle.stopEngine();
 }
}

/*
Car actions:
Starting car engine: Insert key and turn ignition.
Stopping car engine: Turn off ignition and remove key.

Motorcycle actions:
Starting motorcycle engine: Pull choke and press starter button.
Stopping motorcycle engine: Turn off ignition switch.
*/