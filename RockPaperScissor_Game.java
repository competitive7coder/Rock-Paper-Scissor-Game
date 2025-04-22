package com.conditionals;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("0 for Rock, 1 for Paper, 2 for Scissor");
        System.out.println("Enter Your Choice: ");
        int UserChoice = sc.nextInt();
        int ComputerChoice = random.nextInt( 3);
        if( UserChoice == ComputerChoice){
            System.out.println("Draw!!");
        }
        else if( UserChoice == 0 && ComputerChoice == 2 || UserChoice == 1 && ComputerChoice == 0 ||
                UserChoice == 2 && ComputerChoice == 1){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!!");
        }
    if(ComputerChoice == 0){
        System.out.println("Computer Choice Rock");
    }
       else if(ComputerChoice == 1){
            System.out.println("Computer Choice Paper");
        }
       else if (ComputerChoice == 2){
            System.out.println("Computer Choice Scissor");
        }
    }
}
