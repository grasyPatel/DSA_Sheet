public class KadansAlgo {
    public int solution(int []arr, int n){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;

    }
}
