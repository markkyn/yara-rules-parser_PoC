package com.politec.markkyn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        File yaraExecutable = new File("./bin/yara64.exe");
        File malwareFolder =  new File("./malwares");
        File rulesFolder = new File("./rules");

        //listAllFiles(malwareFolder);

        ProcessBuilder builder = new ProcessBuilder(yaraExecutable.getPath());

        try {
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }


    }

    public static void listAllFiles(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listAllFiles(fileEntry);
            }
        }
    }
}