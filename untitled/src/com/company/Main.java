package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int a = 1;
                int m = 3;
                int x;
                System.out.print(a+" "+m+" ");
                for(int i = 1; i<38;i++){
                    x=a+m;
                    System.out.print(x+" ");
                    a=m;
                    m=x;
                }
                System.out.println();

    }
}
