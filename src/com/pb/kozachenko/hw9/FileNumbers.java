package com.pb.kozachenko.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNumbers {
    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();
    }

    private static void createNumbersFile() {
        Path path = Paths.get("numbers.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

            int[] num = new int[100];
            for (int i = 0; i < num.length; i++) {
                num[i] = (int) (Math.random() * 100);
            }

            for (int i = 0; i < num.length; i++) {
                if (i % 10 == 0) {
                    writer.newLine();
                    writer.write(num[i] + " ");
                } else writer.write(num[i] + " ");
            }


        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
    }

    public static void createOddNumbersFile() {
        Path path = Paths.get("numbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String str;
            while ((str = reader.readLine()) != null) {
                Path pathNew = Paths.get("odd-numbers.txt");
                try (BufferedWriter writerNew = Files.newBufferedWriter(pathNew, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                    String[] numNew;
                    String delimeter = " ";
                    numNew = str.split(delimeter);
                    try {
                        for (int i = 0; i < numNew.length; i++) {
                            int a = Integer.valueOf(numNew[i]);
                            if (a % 2 == 0) {
                                writerNew.append(0 + " ");
                                System.out.println(0);
                            } else {
                                writerNew.append(a + " ");
                                System.out.println(a);
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("неправильный формат строки");
                    }

                } catch (Exception ex) {
                    System.out.println("Error with file write: " + ex);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
