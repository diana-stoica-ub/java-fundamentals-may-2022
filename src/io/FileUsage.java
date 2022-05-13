package io;

import java.io.File;
import java.io.IOException;

public class FileUsage {

    public static void main(String[] args) {
        createDirectory("io_demo");
        File directory = createDirectory("./src/io/io_demo");
        try {
            createFile(directory, "fileCreatedByFile.txt");
            createFile(directory, "fileCreatedByFile2.txt");
            File file = createFile(directory, "fileCreatedByFile3.txt");

            boolean fileExists = file.exists();
            boolean isFile = file.isFile();
            boolean isDirectory = file.isDirectory();
            boolean canRead = file.canRead();
            boolean canWrite = file.canWrite();
            boolean isHidden = file.isHidden();

            deleteFile(file);

        } catch (IOException e) {
            System.out.println("Cannot create file");
        }
        listDirectory(directory);

    }

    public static void deleteFile(File file) {
        boolean success = file.delete();
        if (success) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }

    public static void listDirectory(File directory) {
        System.out.println("Listing files from directory:");
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getPath());
            try {
                System.out.println(files[i].getCanonicalPath());
            } catch (IOException e) {
                System.out.println("Cannot print cannonical path");
            }
            System.out.println(files[i].getAbsolutePath());
        }
    }

    public static File createFile(File directory, String fileName) throws IOException {
        String filePath = directory.getPath() + File.separator + fileName;
        File file = new File(filePath);

        if (!file.exists()) {
            boolean success = file.createNewFile();
            if (success) {
                System.out.println("File created successful: " + filePath);
            } else {
                System.out.println("File cannot be created: " + filePath);
            }
        } else {
            System.out.println("File already exists");
        }
        return file;

    }

    public static File createDirectory(String directoryName) {
        File directoryFile = new File(directoryName);
        boolean success = directoryFile.mkdir();
        if (success) {
            System.out.println("Directory successful created: " + directoryName);
        } else {
            System.out.println("Directory creation failed: " + directoryName);
        }

        return directoryFile;
    }
}
