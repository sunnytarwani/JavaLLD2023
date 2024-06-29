package DSA.SlidingWindow;

public class MinimumSizeSubarraySum209 {
    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};

        int i = 0 ;
        int j = 0;

        int checkSum = 0;
        int maxLength = Integer.MAX_VALUE;

        while(j < nums.length ){
            checkSum += nums[j];
            j++;

            while(checkSum>=target){
                int size = j - i;
                maxLength = Math.min(maxLength , size);

                checkSum -= nums[i];
                i++;
            }
        }
        System.out.println(maxLength);
    }
}
