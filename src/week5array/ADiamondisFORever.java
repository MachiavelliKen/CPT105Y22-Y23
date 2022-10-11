package week5array;

public class ADiamondisFORever {
    public static void main(String[] args) {
        diamond(3);
    }

    public static void diamond(int n) {
        for (int i = 0; i < n; i++) {
            // calculate the number of * in this row
            int starCount;
            if (i < (n - 1) / 2) {
                starCount = 2 * i + 1;
            } else {
                starCount = 2 * (n - i) - 1;
            }

            int dotCount = (n - starCount) / 2;// calculate the number of dot
            // print first part of dots
            for (int j = 0; j < dotCount; j++) {
                System.out.print(". ");// use print() not println()
            }
            //print stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("* ");// use print() not println()
            }
            // print second part of dots
            for (int j = 0; j < dotCount; j++) {
                System.out.print(". ");// use print() not println()
            }
            System.out.println();// dont forget to change line

        }

    }

    public static void diamondOpt(int n) {
        for (int i = 0; i < n; i++) {
            // calculate the number of * in this row
            int distance=Math.abs((n-1)/2-i);//distance from current row to middle row
            int starCount=n-2*distance; // star number

            int dotCount = (n - starCount) / 2;// calculate the number of dot
            // print first part of dots
            printSymbol(".",dotCount);//print dot
            //print stars
            printSymbol("*",starCount);
            // print second part of dots
            printSymbol(".",dotCount);
            System.out.println();// dont forget to change line

        }

    }
    public static void printSymbol(String symbol,int num){
        for (int j = 0; j < num; j++) {
            System.out.print(symbol+" ");// use print() not println()
        }
    }
}
