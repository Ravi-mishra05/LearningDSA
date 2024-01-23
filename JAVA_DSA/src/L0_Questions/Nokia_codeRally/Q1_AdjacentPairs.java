package L0_Questions.Nokia_codeRally;

import java.io.*;
import java.util.*;

public class Q1_AdjacentPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] custom_input_1 = br.readLine().split(" ");
        int N = Integer.parseInt(custom_input_1[0]);
        int Q = Integer.parseInt(custom_input_1[1]);
        String S = br.readLine();
        String[] Queries = br.readLine().split(" ");

        int[] out_ = solve(N, Q, S, Queries);
        for (int i_out_ = 0; i_out_ < out_.length; i_out_++) {
            wr.print(out_[i_out_]);
            if (i_out_ < out_.length - 1)
                wr.print(" ");
        }

        wr.close();
        br.close();
    }

    static int[] solve(int N, int Q, String S, String[] Queries) {
        Map<String, Integer> pairFrequency = new HashMap<>();
        List<String> pairs;

        // Initial frequency of adjacent pairs in the string
        pairs = getPairs(S);
        updateFrequency(pairFrequency, pairs);

        // Continue until no adjacent pairs are left
        while (!pairs.isEmpty()) {
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < S.length(); i += 2) {
                newString.append(S.charAt(i));
            }

            S = newString.toString();
            pairs = getPairs(S);
            updateFrequency(pairFrequency, pairs);
        }

        int[] result = new int[Q];

        // Process queries
        for (int i = 0; i < Q; i++) {
            result[i] = pairFrequency.getOrDefault(Queries[i], 0);
        }

        return result;
    }

    // Function to extract pairs from a string
    static List<String> getPairs(String str) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            pairs.add(str.substring(i, i + 2));
        }
        return pairs;
    }

    // Function to update pair frequency
    static void updateFrequency(Map<String, Integer> frequency, List<String> pairs) {
        for (String pair : pairs) {
            frequency.put(pair, frequency.getOrDefault(pair, 0) + 1);
        }
    }
}
