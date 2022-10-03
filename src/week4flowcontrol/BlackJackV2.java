package week4flowcontrol;

import java.util.Scanner;

public class BlackJackV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialise a scanner object
        // naming is not relevant for now
        int min = Integer.parseInt(sc.nextLine()); //let user input an integer and convert from string to integer

        int max = Integer.parseInt(sc.nextLine()); // let user input an integer and convert from string to integer

        // find out numerical relation by swap their value
        if (min>max){
            int temp=max;
            max=min;
            min=temp;
        }

        if(max<1||min>21||(min<1&&max>21)){
            //invalid cases
            // max<1 indicates two input are smaller than 1 and locate at left side of [1,21]
            //               ----------------------
            //               |                    |
            //-min--max------1--------------------21-------->

            // min>21 indicates two input are larger than 21 and locate at right side of [1,21]

            //       ----------------------
            //       |                    |
            //-------1--------------------21-------min--max->

            // min<1&&max>21  indicate two input are outside of boundary
            //            ----------------------
            //            |                    |
            //---min------1--------------------21-------max->

            System.out.println(-1);
        }else if(max<=21){
            // valid case always print max if max <=21

            //            --------------------------
            //            |                        |
            //---min------1-----------max---------21------->

            //         -----------------------------
            //         |                           |
            //---------1----min-------max---------21------->

            System.out.println(max);
        }else {
            // valid case print min otherwise

            //         -------------------------
            //         |                       |
            //---------1----min---------------21-------max->

            System.out.println(min);
        }


    }
}
