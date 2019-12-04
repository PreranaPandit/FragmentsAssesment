package com.example.fragmentsassesment;

public class MathematicActions {

    //for sum calculation
    private int firstNum, secondNum;

    //generating constructors
    public MathematicActions(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }


    public int sumNumbers()
    {

        return (int) (firstNum + secondNum);
    }

    public static float areaOfCircle( float radius){
        return (float) (Math.PI*radius*radius);
    }

    public static int reverseNumber(int number){
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}
