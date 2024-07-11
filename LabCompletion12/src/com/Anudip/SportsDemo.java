package com.Anudip;

class Sports {
 public void play() {
     System.out.println("Playing generic sports...");
 }
}

class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing football: Kick off!");
 }
}

class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing basketball: Dribble and shoot!");
 }
}

class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing rugby: Scrum and pass!");
 }
}

public class SportsDemo {
 public static void main(String[] args) {
     Football football = new Football();
     Basketball basketball = new Basketball();
     Rugby rugby = new Rugby();

     football.play();
     basketball.play();
     rugby.play();
 }
}

/*
Playing football: Kick off!
Playing basketball: Dribble and shoot!
Playing rugby: Scrum and pass!
*/
