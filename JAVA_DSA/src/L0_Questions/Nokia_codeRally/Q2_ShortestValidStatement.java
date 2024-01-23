package L0_Questions.Nokia_codeRally;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Q2_ShortestValidStatement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_nums = br.readLine().split(" ");
        int[] nums = new int[N];
        for(int i_nums = 0; i_nums < arr_nums.length; i_nums++) {
            nums[i_nums] = Integer.parseInt(arr_nums[i_nums]);
        }
        int K = Integer.parseInt(br.readLine().trim());

        int out_ = solve(nums, K);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solve(int[] nums, int K) {
        int result = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int start = 0; start < nums.length; start++) {
            int end = start + 1;
            while (end <= nums.length && end - start < result) {
                if (prefixSum[end] - prefixSum[start] >= K) {
                    result = Math.min(result, end - start);
                    break;
                }
                end++;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

}