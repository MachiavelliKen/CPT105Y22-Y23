package week5array;

public class ArithmeticSeries {
    public static void main(String[] args) {
        int[] a = arithSeriesOpt(4);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] arithSeries(int n) {
        int resultLength = n * (n + 1) / 2; // length of result array
        int[] result = new int[resultLength]; // initialise array
        int pointer = 0; // the position of array
        for (int i = 1; i <= n; i++) { // if i start from 1 then the end condition should be <=n
            for (int j = 1; j <= i; j++) {// assign value from 1 to i
                result[pointer] = j;
                pointer++;// move to next pointer
            }
        }
        return result;
    }

    public static int[] arithSeriesOpt(int n) {
        int resultLength = n * (n + 1) / 2; // length of result array
        int[] result = new int[resultLength]; // initialise array
        for (int i = 1; i <= n; i++) { // if i start from 1 then the end condition should be <=n
            for (int j = 1; j <= i; j++) {// assign value from 1 to i
                result[i * (i - 1) / 2 + j - 1] = j;
            }
        }
        return result;
    }
}
