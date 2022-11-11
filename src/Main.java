import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {5.5,-8.7,3.3,9.0,88.5,1.5};

        sort(nums);


    }
    public static void sort (double[]nums){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if(nums [j] < nums[minIndex])
                    minIndex = j;

            double temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}