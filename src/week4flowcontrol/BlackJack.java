package week4flowcontrol;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialise a scanner object
        // let user input first integer
        String num1Strin = sc.nextLine();// let user input an integer
        int num1 = Integer.parseInt(num1Strin); //convert from string to integer

        String num2Strin = sc.nextLine();// let user input an integer
        int num2 = Integer.parseInt(num2Strin); //convert from string to integer

        // find out numerical relation
        int min, max; // initialise two integer variables to store minimum and maximum number
        if (num1 < num2) {
            // num1 is smaller than num2
            min = num1;
            max = num2;
        } else {
            // num2 is smaller than or equal to num1
            // when two numbers are equal, two variables are equal.
            min = num2;
            max = num1;
        }
        // solve whether bust according to each scenario
        if (min <= 21 && max <= 21) {
            //scenario 1
            System.out.println(max);
        }
        if (min <= 21 && max >= 21) {
            //scenario 2
            System.out.println(min);
        }
        if (min >= 21 && max >= 21) {
            //scenario 3
            System.out.println(-1);
        }



//         //optimized code
//         Scanner sc = new Scanner(System.in); // initialise a scanner object
//         // the meaning of name not matter   for now
//         int min = Integer.parseInt(sc.nextLine()); //let user input an integer and convert from string to integer
//         int max = Integer.parseInt(sc.nextLine()); // let user input an integer and convert from string to integer
//         // find out numerical relation by swap their value
//         if (min>max){
//         int temp=max;
//         max=min;
//         min=temp;
//         }
//         if(max<=21) {
//         //scenario 1
//         System.out.println(max);
//         }else if(min<=21){ // implicit condition max >21
//         //scenario 2
//         System.out.println(min);
//         }else {// implicit condition max >21 and min >21
//         //scenario 3
//         System.out.println(-1);
//         }



    }
}
