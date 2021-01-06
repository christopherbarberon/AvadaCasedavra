package com.company;

import java.util.Scanner;

public class  menu {
   public void displayMenu() {
      Scanner enter = new Scanner(System.in);
      System.out.println("S= Start the game");
      System.out.println("H= View the HighScore");
      System.out.println("R= view the rules");
      System.out.println("E= Exit the programme");
      String choice;
      choice = enter.nextLine();
      if (choice.equals("S") || choice.equals("s")) {
      } else if (choice.equals("H") || choice.equals("h")) {

      } else if (choice.equals("R") || choice.equals("r")) {
         System.out.println("- A player cannot destroy a busy case. \n" +
                 "- A player cannot occupy a destroyed case or an already occupied case. \n " +
                 "- A player blocked during a round is declared loser. \n" +
                 "- A player always move before destroying a square.");
         System.out.println("press Q to return menu");
         String choices= enter.nextLine();
         if (choices.equals("Q") || choices.equals("q")){
            displayMenu();
         }
      } else if (choice.equals("E") || choice.equals("e")) {

      }
   }


   }



