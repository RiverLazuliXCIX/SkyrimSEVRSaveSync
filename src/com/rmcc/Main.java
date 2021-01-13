package com.rmcc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String version = "";

        while (checkString(version)) {
            System.out.println("Choose the version you would like to sync your saves from (se/vr): ");
            Scanner sc = new Scanner(System.in);
            version = sc.nextLine();
            if(checkString(version))
                System.out.println("Invalid input, try again");
        }
        System.out.println("Version selected was: " + version);
    }

    public static boolean checkString(String version) {
        return !version.equalsIgnoreCase("SE") && !version.equalsIgnoreCase("VR");
    }
}
