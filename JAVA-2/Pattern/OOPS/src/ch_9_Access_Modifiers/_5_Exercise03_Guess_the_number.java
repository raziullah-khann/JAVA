/*
Create a class Game,which allow a user to play "Guess the number" game once.
Game should have The following methods:
1. Constructor to generate the random number
2. takeUserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getter and setter for noOfGuesses
use properties such as noOfGuesses(int), etc to get this task is done!

 */
package ch_9_Access_Modifiers;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public  int inputNumber;
    public int noOfGusses;

    public  Game(){
        System.out.println("Hello Constructor");
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        if(inputNumber==number){
            return true;
        } else if (inputNumber>number) {
            System.out.println("Too High...");
        } else if (inputNumber<number) {
            System.out.println("Too Low...");
        }
        return true;
    }

    public void setNoOfGusses(int noOfGusses){
        this.noOfGusses=noOfGusses;
    }
    public int getNoOfGusses(){
        return noOfGusses;
    }
}

public class _5_Exercise03_Guess_the_number {
    public static void main(String[] args) {
        Game gm=new Game();
        boolean b =false;
        while(!b) {
            gm.takeUserInput();
            b = gm.isCorrectNumber();
            System.out.println(b);
            //String sc = "2A2B3C";
            //output "AABBCCC"
            //LOOP POOL     // Earth //thare

//        System.out.println(gm.getNoOfGusses());
        }
    }
}
