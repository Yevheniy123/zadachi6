
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b,c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int chislo = in.nextInt();
        a=Math.round(chislo/1%10);
        b=Math.round(chislo/10%10);
        c=Math.round(chislo/100%10);

        if(a>c) {
            System.out.println("Первая цифра больше третей. ");
        }
        else System.out.println("Третья цифра больше первой. ");
        if(a>b) {
            System.out.println("Первая цифра больше второй. ");
        }
        else System.out.println("Вторая цифра больше первой. ");
        if(b>c) {
            System.out.println("Вторая цифра больше третей. ");
        }
        else System.out.println("Третья цифра больше второй. ");


    }
}

