package com.telran.berlin;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Edward\\Desktop\\maven-demo\\file.txt";
//        String fileContent = IOUtils.toString(new FileInputStream(path));
//        String fileContent = IOUtils.toString(IOUtils.toInputStream(path, "UTF-8"));
        String fileContent = FileUtils.readFileToString(new File(path));
        System.out.println(fileContent);

        List<String> words = new ArrayList<String>();
        while (true) {
            Scanner scanner = new Scanner(System.in);

            String data = scanner.nextLine();
            if ("exit".equals(data)) {
                break;
            }

            words.add(data);
        }

        FileUtils.writeLines(new File(path), words);
    }
}
