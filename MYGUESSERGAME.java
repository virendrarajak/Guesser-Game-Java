package Guessergame;   // Core java project

import java.util.Scanner;

class Guesser {
    int GuesserNum;
    public int GuesserNum(Scanner scan) {
        System.out.println("Guesser kindly guess a number");
        GuesserNum = scan.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;
    public int PlayerNum(Scanner scan) {
        PlayerNum = scan.nextInt();
        return PlayerNum;
    }
}

class Umpire {

    private final Scanner scan = new Scanner(System.in);

    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectnumFromGuesser() {
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNum(scan);
    }

    public void CollectnumFromPlayers() {
   	    System.out.println("Player1 kindly guess your number");
        Player P1 = new Player();
        Playernum1 = P1.PlayerNum(scan);
        
        System.out.println("Player2 kindly guess your number");
        Player P2 = new Player();
        Playernum2 = P2.PlayerNum(scan);
        
        System.out.println("Player3 kindly guess your number"); 
        Player P3 = new Player();   
        Playernum3 = P3.PlayerNum(scan);
        
    }
    public void Compare() {
    	if(Guessernum== Playernum1) {
    		if(Guessernum== Playernum2 && Guessernum== Playernum3) {
    			System.out.println("All Player won the game");
    		}
    		else if (Guessernum== Playernum2) {
    			System.out.println(" Player 1 and player 2 won the game");
    		}
    		else if (Guessernum== Playernum3) {
    			System.out.println(" Player 1 and player 3 won the game");
    		}
    		else {
    			System.out.println("only player 1 won the game");
    		}  		
    	}
    	else if (Guessernum== Playernum2) {
    		if(Guessernum==Playernum3) {
    			System.out.println("Player 2 and Player 3");
    		}
    		else {
    			System.out.println("Player 2");
    		}
    			
    		}
    	else if (Guessernum== Playernum3) {
    	      System.out.println("only player 3 won the game");
    		
    	}
    	else {
    		System.out.println("All player lost the game");
    	}
    		
    }
    
    }

public class MYGUESSERGAME {

    public static void main(String[] args) {
    	
    	System.out.println(".............Game Started.........");
    	Umpire UM = new Umpire() ;	
    		UM.CollectnumFromGuesser();
    		UM.CollectnumFromPlayers();
    		UM.Compare();
    		System.out.println("..........Game Over.....");
    		
    	

    }
}

















