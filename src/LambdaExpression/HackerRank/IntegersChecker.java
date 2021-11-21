package LambdaExpression.HackerRank;
// problem link: https://www.hackerrank.com/challenges/java-lambda-expressions/problem

import java.util.ArrayList;
import java.util.Scanner;

public class IntegersChecker {
    public static void main(String[] args) {
        // read input and store it in inputObjects ArrayList
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<InputObject> inputObjects = new ArrayList<>();
        for(int i = 0 ; i < num ; i++){
            InputObject tmp = new InputObject();
            tmp.checkNum = scanner.nextInt();
            tmp.num = scanner.nextInt();
            inputObjects.add(tmp);
        }

        // checking each line separately
        for(int i = 0 ; i < inputObjects.size() ; i++){
            InputObject currentObject = inputObjects.get(i);
            PerformMultipleOperation pmo;
            if(currentObject.checkNum == 1){ // check for ODD/EVEN
                pmo = (number)-> number%2 != 0;
                System.out.println(pmo.check(currentObject.num) ? "ODD" : "EVEN");
            }
            else if(currentObject.checkNum == 2){// check for PRIME/COMPOSITE
                pmo = (number) -> {
                    if(number==0||number==1) return false;
                    for(int j = 2 ; j <= number/2 ; j++){
                        if(number%j == 0) return false;
                    }
                    return true;
                };
                System.out.println(pmo.check(currentObject.num) ? "PRIME" : "COMPOSITE");
            }
            else {// check for PALINDROME/NOT PALINDROME
                pmo = (number)->{
                    String numberConverted = String.valueOf(number);
                    for (int j = 0 ; j < numberConverted.length()/2 ; j++){
                        if(numberConverted.charAt(j) != numberConverted.charAt(numberConverted.length() - 1 - j))
                            return false;
                    }
                    return true;
                };
                System.out.println(pmo.check(currentObject.num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}

@FunctionalInterface
interface PerformMultipleOperation {
    boolean check(int a);
}


//  check numbers
//  (1 for ODD/EVEN, 2 for PRIME/COMPOSITE,3 or for PALINDROME/NOT PALINDROME).
class InputObject{
    int checkNum;
    int num;

    @Override
    public String toString() {
        return "InputObject{" +
                "checkNum=" + checkNum +
                ", num=" + num +
                "}\n";
    }
}
