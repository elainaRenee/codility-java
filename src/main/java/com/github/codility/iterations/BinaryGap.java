package com.github.codility.iterations;

public class BinaryGap {

    public static int solution(int N) {
        int maxGap = 0;
        int currGap = -1;

        while (N > 0) {
            if (N % 2 == 0 && currGap != -1)
                currGap++;
            else if (N % 2 == 1) {
                maxGap = Math.max(currGap, maxGap);
                currGap = 0;
            }

            // divide by 2 and assign to N
            N /= 2;
        }

        return maxGap;
    }

}
