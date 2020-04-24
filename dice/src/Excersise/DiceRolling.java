package Excersise;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class DiceRolling {
   static  boolean isRolling = true;
    public static void main(String[] args) throws ParseException {
        // write your code here
        System.out.println("Enter Your name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Enter date in dd-mm-yyyy");
        String date = scanner.nextLine();
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
        System.out.println("Welcome" + " " + userName + " " + date1);
        calculate();
    }

    public static void calculate() {
        System.out.println("How many dice would you like to roll in between 1-4");
        Scanner scanner = new Scanner(System.in);
        int diceQuantity = scanner.nextInt();
        int i = 0;
        int total=0;
        Random rn = new Random();
        if(diceQuantity<=4&&diceQuantity>=1) {//Validate input value
            while (i < diceQuantity) {
                int answer = rn.nextInt(6) + 1;//Generate random number
                if(answer==1)//To check if rolling value is 1
                {
                    System.out.println("value was 1 we are rolling again");
                    int answer1 = rn.nextInt(6) + 1;
                    answer=answer1;
                }
                System.out.println(answer);
                total = total + answer;
                System.out.println("Total="+total);
                i++;

            }
            playAgain();
        }
     else
         System.out.println("Please enter between 1-4");
        }

    public static void playAgain(){
        System.out.println("Would you like to play again? Y/N");
        Scanner scanner = new Scanner(System.in);
        String playAgain = scanner.next();
        if(playAgain.equals("N")){
            isRolling = false;
        }
        if(playAgain.equals("Y")){
            calculate();
        }

    }


    }

