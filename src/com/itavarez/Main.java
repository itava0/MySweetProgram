package com.itavarez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("When is your birthday?");

        Scanner scanner = new Scanner(System.in);
        int birthday = scanner.nextInt();

        System.out.println("My birthday is " + birthday);

    }
}
