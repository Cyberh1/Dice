package game;

import java.util.Scanner;

/**
 * Created by RAIHAN on 3/7/2017.
 */
public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1, dice2, sum, score, count = 1;
        System.out.println("Enter The Value of Dice 1-6");
        dice1 = scanner.nextInt();
        dice2 = scanner.nextInt();

        if(dice1 > 0 && dice1 <= 6 && dice2 > 0 && dice2 <=6){
            sum = dice1 + dice2;
            if (sum == 7 || sum == 11){
                System.out.println("Congratulation!You Win.");
            }else if (sum == 2 || sum == 3 || sum == 12){
                System.out.println("You Lost!");
            }else {
                if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
                    score = sum;
                    System.out.println("You Scored = " + score + " .Again Roll the Dice to match the score.");
                    dice1 = scanner.nextInt();
                    dice2 = scanner.nextInt();
                    sum = dice1 + dice2;
                    if (sum != 7) {
                        while (sum != score) {
                            count++;
                            System.out.println("Again Roll the Dice to match the score.");
                            dice1 = scanner.nextInt();
                            dice2 = scanner.nextInt();
                            sum = dice1 + dice2;
                            if (sum == 7)
                                break;
                        }
                        System.out.println("Congratulation! You Win. You Tried " + count + " Times.");
                    } else {
                        System.out.println("You Lost!");
                    }
                }
            }
        }else {
            System.out.println("Wrong Dice! Please enter the value between 1-6 into two dice");
        }

    }
}
