/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csci455lottery;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author canvi
 */
public class LotteryTicketNumbersGenerator {
     
    static void GeneratePowerballTicketNumbers(){
        //generating white powerball numbers
        ArrayList WhitePB = new ArrayList(); //white powerbal numbers are 1-69, five distinct numbers are drawn
        for (int i = 0; i<69; i++){ // there are 69  numbers and adding to WhitePB array
            WhitePB.add(i+1); //index starts with 0 so adding 1 to the number from for loop starts numbers from one and end with 69
        }
        Collections.shuffle(WhitePB); //using collections to randomly shuffle numbers from WhitePB array
        System.out.print("Your white powerball numbers are: ");
        for (int j = 0; j < 5; j++){ //loop for first 5 integers from WhitePB array
            System.out.print(WhitePB.get(j) + " ");//printing the first 5 integers from WhitePB array
        }
        //generating Red powerball number
        int RedPB; //Red powerball number are 1-26, only one is drawn
        Random rand = new Random(); //creating new random number generator
        RedPB = rand.nextInt(26+1); // generating random number between 1-26
        
        System.out.print("and your red powerball number is " + RedPB + "\n");
     
    }
    
    static void GenerateMegaMillionsTicketNumbers (){
        
        //generating white megamillions numbers
        ArrayList WhiteMM = new ArrayList(); //white  megamillions numbers are 1-70, five distinct numbers are drawn
        for (int i = 0; i<70; i++){ // there are 70  numbers and adding to WhiteMM array
            WhiteMM.add(i+1); //index starts with 0 so adding 1 to the number from for loop starts numbers from 1 and end with 70
        }
        Collections.shuffle(WhiteMM); //using collections to randomly shuffle numbers from WhiteMM array
        System.out.print("Your white Mega Millions numbers are: ");
        for (int j = 0; j < 5; j++){ //loop for first 5 integers from WhiteMM array
            System.out.print(WhiteMM.get(j) + " ");//printing the first 5 integers from WhiteMM array
        }
        //generating Red powerball number
        int YellowMM; //Yellow multiplier numbers are 1-26, only one is drawn
        Random rand = new Random(); //creating new random number generator
        YellowMM = rand.nextInt(26+1); // generating random number between 1-25
        
        System.out.print(" and m"
                + "your yellow megaplier number is " + YellowMM + "x" + "\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        String gameChoice; 
        System.out.print("Which game would you like to play Powerball or Megamillions?"
                + "Please enter 'P' for Powerball or 'M' for Megamillions: ");
        //gameChoice = game.nextLine();
        
        while(true){ 
            gameChoice = game.nextLine();

            if (gameChoice.equalsIgnoreCase("P")){
                GeneratePowerballTicketNumbers();
            }else if(gameChoice.equalsIgnoreCase("M")){
                GenerateMegaMillionsTicketNumbers();
            }else{
                System.out.println("Invalid choice, please enter 'M' or 'P': ");
                continue;
            }
            break;
        }
    }
}
