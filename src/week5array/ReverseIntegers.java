package week5array;

public class ReverseIntegers {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 11);
        }
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        reverseInts(nums);
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static void reverseInts(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i]; // new temporary variable to store nums[i]
            nums[i] = nums[nums.length - 1 - i]; // assign the value of nums[nums.length-1-i] to num[i]
            // notice that the old value of num[i] will be replaced after
            // we assign a new value to it. Dont worry, because we have already store the
            // old value of num[i] in temp
            nums[nums.length - 1 - i] = temp;// assign the value of temp( which is the old value of num[i]) to nums[nums.length-1-i]

            // now we finish a swap
        }
    }

}
