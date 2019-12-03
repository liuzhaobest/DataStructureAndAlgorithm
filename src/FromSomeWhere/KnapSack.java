package FromSomeWhere;

import java.util.Arrays;
import java.util.Collections;

public class KnapSack {
    public static void main(String[] args) {
        int weightLimit = 8;
        int[] weightArr = {1,3,4,5};
        int[] valueArr = {10,40,50,70};
        System.out.println(unbounded(weightArr,valueArr,weightLimit));
    }

    public static int unbounded(int[] weightArr, int[] valueArr, int weightLimit){
        if(weightArr == null || valueArr == null || valueArr.length == 0 || weightArr.length == 0 || weightLimit == 0){
            return 0;
        }
        int numberOfItem = weightArr.length;
        int[] dp = new int[weightLimit+1];
        dp[0] = 0;
        for (int i = 0; i <= weightLimit; i++) {
            for (int j = 0; j < numberOfItem; j++) {
                if(weightArr[j] <= i){
                    dp[i] = Math.max(dp[i],dp[i - weightArr[j]] + valueArr[j]);
                }
            }
        }
        return dp[weightLimit];
    }

    private static int unboundedKnapsack(int[] wt,int[] val, int W){

        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int n = val.length;
        int dp[] = new int[W + 1];

        // Fill dp[] using above recursive formula
        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (wt[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
                }
            }
        }
        return dp[W];
    }


        public static int solutionUnbounded(int[] weightArr, int[] valueArr, int weightLimit){
        if(weightArr == null || valueArr == null || valueArr.length == 0 || weightArr.length == 0 || weightLimit == 0){
            return 0;
        }
        int[][] dp = new int[weightArr.length][weightLimit + 1];
        for (int i = 0; i < weightLimit+1; i++) {
            dp[0][i] = (i / weightArr[0] ) * valueArr[0];
            //System.out.print(dp[0][i] + " ");

        }
        //System.out.println(" ");
        for (int i = 1; i < weightArr.length; i++) {
            for (int j = 0; j < weightLimit+1; j++) {
                if(weightArr[i] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = unboundedHelper(dp,i,j,weightArr,valueArr);
                }
                //System.out.print(dp[i][j] + " ");
            }
        }
        return dp[weightArr.length - 1][weightLimit];
    }

    public static int unboundedHelper(int[][] dp, int curItem, int curLimit, int[] weightArr, int[] valueArr){
        // i need to have the maximum number among 1. 0 to curLimit / weightArr[curItem] number of curItem
        int length = curLimit / weightArr[curItem] + 1;
        Integer[] result = new Integer[length];
        for (int i = 0; i < length; i++) {
            result[i] = dp[curItem - 1][curLimit - weightArr[curItem] * i] + valueArr[curItem] * i;
        }
        return Collections.max(Arrays.asList(result));

    }


    public static int solution(int[] weightArr, int[] valueArr, int weightLimit){
        if(weightArr == null || valueArr == null || valueArr.length == 0 || weightArr.length == 0 || weightLimit == 0){
            return 0;
        }
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
