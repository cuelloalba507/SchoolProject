package com.yourcompany.schoolproject;

import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNum = rand.nextInt(10);
    System.out.println("Your random number is: " + randomNum);
  }
}
