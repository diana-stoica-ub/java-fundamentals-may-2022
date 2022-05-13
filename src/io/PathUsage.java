package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class PathUsage {

    public static void main(String[] args) {
        Optional<Path> directoryOpt = createDirectory("./src/io/io_demo_path");
        if (!directoryOpt.isPresent()) {
            System.out.println("Cannot create directory");
        } else {
            Path path = directoryOpt.get();
        }

        //create file
        Path file = Paths.get("./src/io/io_demo_path/createdByPath10");
        try {
            Path nioFile = Files.createFile(file);

            //convert
            File ioFile = nioFile.toFile();
            Path pathFromIOFile = ioFile.toPath();

            //move
            Path movedFilePath = Files.move(nioFile, Paths.get("./io_demo_path/movedPathFile"));

            boolean fileExists = Files.exists(movedFilePath);
            boolean isDirectory = Files.isDirectory(movedFilePath);
            boolean canRead = Files.isReadable(movedFilePath);
            boolean isHidden = Files.isHidden(movedFilePath);

            //delete
            Files.delete(movedFilePath);

        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exitsts");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Optional<Path> createDirectory(String name) {
        Path directory = Paths.get(name);
        try {
            Path newDirectoryPath = Files.createDirectory(directory);

            //Path missingDirectories = Paths.get("./src/io/this/folder/does/not/exist");
            //Files.createDirectories(missingDirectories);
            return Optional.of(newDirectoryPath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Directory already exists - not creating...");
            return Optional.empty();
        } catch (IOException e) {
            System.out.println("Cannot create directory");
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
