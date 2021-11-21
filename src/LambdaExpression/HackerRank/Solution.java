package LambdaExpression.HackerRank;
// problem link: https://www.hackerrank.com/challenges/java-lambda-expressions/problem


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (number)-> number%2 != 0;
//        PerformOperation obj = (number)-> number%2 != 0;
//        return obj;
    }

    public PerformOperation isPrime() {

        return (number) -> {
            if(number==0||number==1) return false;
            for(int j = 2 ; j <= number/2 ; j++){
                if(number%j == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (number)->{
            String numberConverted = String.valueOf(number);
            for (int j = 0 ; j < numberConverted.length()/2 ; j++){
                if(numberConverted.charAt(j) != numberConverted.charAt(numberConverted.length() - 1 - j))
                    return false;
            }
            return true;
        };
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath math = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation performOperation;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                performOperation = math.isOdd();
                ret = math.checker(performOperation, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                performOperation = math.isPrime();
                ret = math.checker(performOperation, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                performOperation = math.isPalindrome();
                ret = math.checker(performOperation, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

