package week4flowcontrol;

import java.util.Scanner;

public class Pandamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialise a scanner object
        // let user input first integer
        String num1Strin = sc.nextLine();// let user input an integer
        int init = Integer.parseInt(num1Strin); //convert from string to integer

        String num2Strin = sc.nextLine();// let user input an integer
        int infectRate = Integer.parseInt(num2Strin); //convert from string to integer

        String num3Strin = sc.nextLine();// let user input an integer
        int population = Integer.parseInt(num3Strin); //convert from string to integer


        int totalNum=init;// total cases is init at the first day

        int day=1; //day tracker starts from day1
        // while loop
        while(totalNum<population){
            day++; //a new day begin!
            totalNum=totalNum*(infectRate+1);// update total cases

        }

//        // for loop
//        // notice that the initial condition is null
//        // if we set for(int day=1;totalNum<population;day++)
//        // then variable "day" is only accessible during loop
//        // once loop is over, variable "day" is out of the scope
//        for(;totalNum<population;day++){
//            totalNum=totalNum*(infectRate+1);
//        }

        //optimised code
//        int day=(int)(Math.ceil(Math.log10(population/init)/Math.log10(infectRate+1))+1);

        System.out.println(day);

    }
}
