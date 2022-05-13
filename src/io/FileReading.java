package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        readWithBufferedReader();

        readWithScanner();

        readWithPath();
    }

    //doar pentru fisiere mici
    public static void readWithPath() {
        Path path = Paths.get("write_buffer.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Line " + i + " content: " + lines.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //pentru fisiere mari
    public static void readWithPathBigFile() {
        Path path = Paths.get("write_buffer.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readWithScanner() {
        try (Scanner scanner = new Scanner(new File("write_buffer.txt"))) {
            scanner.useDelimiter("\n");
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found, please enter a valid filename.");
        }
    }

    public static void readWithBufferedReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader("write_buffer.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found, please enter a valid filename.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
