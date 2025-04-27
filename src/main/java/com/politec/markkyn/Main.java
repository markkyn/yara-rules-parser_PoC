package com.politec.markkyn;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        File malwareFolder =  new File("/malwares");

        ProcessBuilder builder = new ProcessBuilder("./bin/yara.exe");

        try {
            builder.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }


    private void listAllFiles(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listAllFiles(fileEntry);
            }


        }
    }
}