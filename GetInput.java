package reverse.hack;

import java.util.Scanner;

public class GetInput {
    public void game(int a,int b,int c,int d, int r) {
        // Manual Calculation

            if (a + b + c + d == r) {
                System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + r);
            } else if (a + b + c - d == r) {
                System.out.println(a + "+" + b + "+" + c + "-" + d + "=" + r);
            } else if (a + b - c - d == r) {
                System.out.println(a + "+" + b + "-" + c + "-" + d + "=" + r);
            } else if (a - b - c - d == r) {
                System.out.println(a + "-" + b + "-" + c + "-" + d + "=" + r);
            } else if (a - b + c - d == r) {
                System.out.println(a + "-" + b + "+" + c + "-" + d + "=" + r);
            } else if (a - b + c + d == r) {
                System.out.println(a + "-" + b + "+" + c + "+" + d + "=" + r);
            } else if (a * b * c + d == r) {
                System.out.println(a + "*" + b + "*" + c + "*" + d + "=" + r);
            } else if (a * b + c + d == r) {
                System.out.println(a + "*" + b + "+" + c + "+" + d + "=" + r);
            } else if (a + b * c + d == r) {
                System.out.println(a + "+" + b + "*" + c + "+" + d + "=" + r);
            } else if (a + b + c * d == r) {
                System.out.println(a + "+" + b + "+" + c + "*" + d + "=" + r);
            } else if (a * b * c * d == r) {
                System.out.println(a + "*" + b + "*" + c + "*" + d + "=" + r);
            } else if (a / b / c / d == r) {
                System.out.println(a + "/" + b + "/" + c + "/" + d + "=" + r);
            } else if (a / b / c + d == r) {
                System.out.println(a + "/" + b + "/" + c + "+" + d + "=" + r);
            } else if (a / b + c + d == r) {
                System.out.println(a + "/" + b + "+" + c + "+" + d + "=" + r);
            } else if (a + b / c / d == r) {
                System.out.println(a + "+" + b + "/" + c + "/" + d + "=" + r);
            } else if (a + b + c / d == r) {
                System.out.println(a + "+" + b + "+" + c + "/" + d + "=" + r);
            } else if (a / b + c / d == r) {
                System.out.println(a + "/" + b + "+" + c + "/" + d + "=" + r);
            } else if (a * b * c - d == r) {
                System.out.println(a + "*" + b + "*" + c + "-" + d + "=" + r);
            } else if (a * b - c - d == r) {
                System.out.println(a + "*" + b + "-" + c + "-" + d + "=" + r);
            } else if (a - b * c - d == r) {
                System.out.println(a + "-" + b + "*" + c + "-" + d + "=" + r);
            } else if (a - b - c * d == r) {
                System.out.println(a + "-" + b + "-" + c + "*" + d + "=" + r);
            } else if (a * b - c * d == r) {
                System.out.println(a + "*" + b + "-" + c + "*" + d + "=" + r);
            } else if (a / b / c - d == r) {
                System.out.println(a + "/" + b + "/" + c + "-" + d + "=" + r);
            } else if (a / b - c - d == r) {
                System.out.println(a + "/" + b + "-" + c + "-" + d + "=" + r);
            } else if (a - b / c - d == r) {
                System.out.println(a + "-" + b + "/" + c + "-" + d + "=" + r);
            } else if (a - b - c / d == r) {
                System.out.println(a + "-" + b + "-" + c + "/" + d + "=" + r);
            } else if (a / b - c / d == r) {
                System.out.println(a + "/" + b + "-" + c + "/" + d + "=" + r);
            } else if (a / b / c * d == r) {
                System.out.println(a + "/" + b + "/" + c + "-" + d + "=" + r);
            } else if (a / b * c * d == r) {
                System.out.println(a + "/" + b + "-" + c + "-" + d + "=" + r);
            } else if (a * b / c * d == r) {
                System.out.println(a + "-" + b + "/" + c + "-" + d + "=" + r);
            } else if (a * b * c / d == r) {
                System.out.println(a + "-" + b + "-" + c + "/" + d + "=" + r);
            } else if (a / b * c / d == r) {
                System.out.println(a + "/" + b + "*" + c + "/" + d + "=" + r);
            } else if ((a + b) * (c + d) == r) {
                System.out.println("(" + a + "+" + b + ")" + "*" + "(" + c + "+" + d + ")" + "=" + r);
            } else if ((a - b) * (c - d) == r) {
                System.out.println("(" + a + "-" + b + ")" + "*" + "(" + c + "-" + d + ")" + "=" + r);
            } else if ((a + b) * (c - d) == r) {
                System.out.println("(" + a + "-" + b + ")" + "*" + "(" + c + "+" + d + ")" + "=" + r);
            } else if ((a - b) * (c + d) == r) {
                System.out.println("(" + a + "-" + b + ")" + "*" + "(" + c + "+" + d + ")" + "=" + r);
            } else if ((a / b) * (c / d) == r) {
                System.out.println("(" + a + "/" + b + ")" + "*" + "(" + c + "/" + d + ")" + "=" + r);
            } else if ((a * b) * (c / d) == r) {
                System.out.println("(" + a + "*" + b + ")" + "*" + "(" + c + "/" + d + ")" + "=" + r);
            } else if ((a / b) * (c * d) == r) {
                System.out.println("(" + a + "/" + b + ")" + "*" + "(" + c + "*" + d + ")" + "=" + r);
            }
    }
}

