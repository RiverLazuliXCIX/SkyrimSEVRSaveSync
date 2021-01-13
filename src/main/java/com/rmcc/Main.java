package com.rmcc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String version = "";

        while (checkString(version)) {
            System.out.println("Choose the version you would like to sync your saves from (se/vr): ");
            Scanner sc = new Scanner(System.in);
            version = sc.nextLine();
            if(checkString(version))
                System.out.println("Invalid input, try again");
        }

        String srcFolder = "", destFolder = "";
        switch(version.toUpperCase()) {
            case "SE":
                srcFolder = "Special Edition";
                destFolder = "VR";
                break;
            case "VR":
                srcFolder = "VR";
                destFolder = "Special Edition";
                break;
        }

        System.out.println("Version selected was: " + srcFolder + ". Copying saves to Skyrim " + destFolder + " folder...");

        File src = new File("D:\\River\\Documents\\My Games\\Skyrim " + srcFolder + "\\Saves");
        File dest = new File("D:\\River\\Documents\\My Games\\Skyrim " + destFolder + "\\Saves");

        FileUtils.copyDirectory(src, dest);
    }

    public static boolean checkString(String version) {
        return !version.equalsIgnoreCase("SE") && !version.equalsIgnoreCase("VR");
    }
}
