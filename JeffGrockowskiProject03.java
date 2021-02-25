import java.util.Scanner;
/**
 * Write a description of class JeffGrockowskiProject03 here.
 *
 * @author Jeff Grockowski
 * @version 09/11/2019
 */
public class JeffGrockowskiProject03
{
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        char grade = 'E';
        
        System.out.println("This program tells you your lettergrade.");
        System.out.print("Enter your raw score(0 - 100): ");
        int userScore = input.nextInt();
        int first_int = userScore / 10;
        
        switch (first_int){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                grade = 'F';
                break;
            case 6:
                grade = 'D';
                break;
            case 7:
                grade = 'C';
                break;
            case 8:
                grade = 'B';
                break;
            case 9:
            case 10:
                grade = 'A';
                break;
            default:
                System.out.println("Invalid Input.");
                System.exit(0);
        }
        
        /* solution using if statment
         
        if ((userScore <= 0) || (userScore > 100)){
            System.out.println("invalid entry.");
            System.exit(0);
        }
        else if (userScore < 60){
            grade = 'F';
        }
        else if (userScore < 70){
            grade = 'D';
        }
        else if (userScore < 80){
            grade = 'C';
        }
        else if (userScore < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        };
        */
        
        System.out.println("Your score of " + userScore + " = " + grade);
    }
}

/* sample output using "if" statment:
 * 
 * This program tells you your lettergrade.
 * Enter your raw score(0 - 100): 100
 * Your score of 100 = A
 * This program tells you your lettergrade.
 * Enter your raw score(0 - 100): 76
 * Your score of 76 = C
 * 
 * ----------------------------------------------
 *  sample output using "switch" statment:
 *  
 *  This program tells you your lettergrade.
 *  Enter your raw score(0 - 100): -1
 *  Invalid Input.
 *  This program tells you your lettergrade.
 *  Enter your raw score(0 - 100): 91
 *  Your score of 91 = A
 *  This program tells you your lettergrade.
 *  Enter your raw score(0 - 100): 85
 *  Your score of 85 = B
 */