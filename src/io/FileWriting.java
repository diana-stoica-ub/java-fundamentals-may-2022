package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriting {

    public static void main(String[] args) {
        writeUsingBufferWriter();
    }


    public static void fileWriter() throws IOException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("write_file_writer.txt");
        } catch (IOException e) {
            //TODO: handle exception
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("A string");
        printWriter.printf("A string %s and a int %d", "string", 10);

        printWriter.close();
        try {
            fileWriter.close();
        } catch (IOException e) {
            //TODO: handle exception accordingly
            throw new RuntimeException(e);
        }
    }
    public static void writeUsingBufferWriter() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write_buffer.txt"));
            bufferedWriter.write("This is a string");       //todo:append
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeUsingBufferWriterTryWithResources() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("write_buffer.txt"))) {
            bufferedWriter.write("This is a string");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
