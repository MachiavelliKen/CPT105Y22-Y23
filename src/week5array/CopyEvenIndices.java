package week5array;

public class CopyEvenIndices {
    public static void main(String[] args) {

    }

    public static int[] copyEven(int[] nums) {
        int[] result = new int[(nums.length + 1) / 2];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[j] = nums[i];// assign value
                j++;// increment pointer for result
            }
        }
//        // optimisation 1
//        for (int i = 0; i < nums.length; i++) {
//            if (i % 2 == 0) {
//                result[i / 2] = nums[i];
//            }
//        }
//          // optimisation2
//        for (int i = 0; i < nums.length; i = i + 2) {
//            result[i / 2] = nums[i];
//        }
//          // Optimisation 3
//        for (int j=0;j< result.length;j++){
//            result[j]=nums[2*j];
//        }

        return result;
    }
}
