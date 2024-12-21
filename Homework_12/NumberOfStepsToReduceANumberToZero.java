package Homework_12;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }

    private static int numberOfSteps(int num){
        int index = 0;
        while (num!=0){
            if (num%2==0){
                num=num/2;
            }else {
                num=num-1;
            }
            index++;
        }
        return index;
    }
}
