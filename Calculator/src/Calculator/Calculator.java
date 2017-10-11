package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double x , y;

        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        y = input.nextDouble();

        Substraction sub = new Substraction(x,y);
        System.out.println(sub.displaysub());

        Addition sum = new Addition(x,y);
        System.out.println(sum.displaySum());

        Div div = new Div(x , y);
        System.out.println(div.displayDiv());

        Mul mul = new Mul(x ,y);
        System.out.println(mul.displayM());


    }
}