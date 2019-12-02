package FromSomeWhere;

public class KnapSack {
    public static void main(String[] args) {
        int weightLimit = 15;
        int[] weightArr = {1,2,8,4,5};
        int[] valueArr = {2,3,17,5,6};
        System.out.println(solution(weightArr,valueArr,weightLimit));
    }
    public static int solution(int[] weightArr, int[] valueArr, int weightLimit){
        int[][] dp = new int[weightArr.length][weightLimit + 1];
        // initialize the first line
        for (int i = 0; i < weightLimit+1; i++) {
            if(weightArr[0] > i){
                dp[0][i] = 0;
            }
            else{
                dp[0][i] = valueArr[0];
            }
        }
        for (int i = 1; i < weightArr.length; i++) {
            for (int j = 0; j < weightLimit+1; j++) {
                if(weightArr[i] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weightArr[i]] + valueArr[i]);
                }

            }
        }
        return dp[weightArr.length - 1][weightLimit];
    }

}
