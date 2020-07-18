package ru.nesterenko.part01.lesson15.task01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileManager {

    private static int recursionDepth = 0;

    public static void createFolder(StringBuilder path) {
        System.out.print("Enter folder name: ");
        Scanner enterFolderName = new Scanner(System.in);
        String fileName  = enterFolderName.nextLine();
        File dir = new File(path
                + String.valueOf(fileName));
        dir.mkdir();
        if(dir.isDirectory()) {
            System.out.printf("%s created ...\n", dir.getName());
        }
    }

    public static void deleteFolder(StringBuilder path) {
        System.out.print("Enter removable folder name: ");
        Scanner enterFolderName = new Scanner(System.in);
        String folderName  = enterFolderName.nextLine();
        File folder = new File(path + folderName);
        if (!folder.isDirectory()) {
            System.out.println("<It's not a folder>");
            return;
        } else if (!folder.exists()) {
            System.out.println("File not found");
            return;
        } else if (folder.listFiles().length == 0) {
            System.out.printf("%s deleted ...\n", folder.getName());
            folder.delete();
        } else {
            System.out.println("<There are some files in this folder>");
        }
    }

    public static void renameFolder (StringBuilder path) {
        System.out.print("Enter the name of file for rename: ");
        Scanner enterFolderName = new Scanner(System.in);
        String FolderName = enterFolderName.nextLine();
        File folder = new File(path + FolderName);
        if (!folder.exists()) {
            System.out.println("File not found");
            return;
        }
        System.out.print("Enter a new name of file: ");
        String newFolderName = enterFolderName.nextLine();
        folder.renameTo(new File(path + newFolderName));
    }

    public static void copyFile(StringBuilder path) throws IOException {
        Scanner enterString = new Scanner(System.in);

        System.out.print("Enter the name of file for copy: ");
        String sampleFileName = enterString.nextLine();
        File sampleFile = new File(path + sampleFileName);

        System.out.print("Enter a new name of file: ");
        String newFileName = enterString.nextLine();
        File newFile = new File(path + newFileName);

        if (sampleFile.exists() && sampleFile.isFile() && !newFile.exists()) {
            Files.copy(sampleFile.toPath(), newFile.toPath());
        } else System.out.println("File not found");
    }

    public static void copyFolder(StringBuilder path) throws IOException {
        Scanner enterString = new Scanner(System.in);

        System.out.print("Enter the name of folder for copy: ");
        String sampleFileName = enterString.nextLine();
        File sampleFolder = new File(path + sampleFileName);

        System.out.print("Enter a new name of folder: ");
        String newFileName = enterString.nextLine();
        File newFolder = new File(path + newFileName);
        newFolder.mkdir();

        recursionDirLook(sampleFolder.getAbsolutePath(),newFolder.getAbsolutePath());
    }

    public static void recursionDirLook (String fromDir, String toDir) throws IOException {
        File from = new File(fromDir);
        File to = new File(toDir);

        if (from.exists() && from.isDirectory() && !to.exists()) {
            from.mkdir();

            String innerSampleFolderName;
            String innerNewFolderName;

            File swapFile;
            for (File file: from.listFiles()) {
                recursionDepth++;
                innerSampleFolderName = file.getAbsolutePath() + "/" + file.getName();
                innerNewFolderName = to.getAbsolutePath() + "/" + file.getName();
                swapFile = new File(to.getAbsolutePath() + "/" + file.getName());
                for (int i = 0; i < recursionDepth; i++) {
                    System.out.print(" ");
                }
                System.out.printf("%s%n", file.getName());


                if(file.isDirectory()) {
                    recursionDirLook(file.getAbsolutePath(), to.getAbsolutePath());
                } else {
                    Files.copy(from.toPath(), to.toPath());
                }
            }
        } else System.out.println("File not found");

    }

    public static void createFile(StringBuilder path) throws IOException {
        System.out.print("Enter file name: ");
        Scanner enterFolderName = new Scanner(System.in);
        String fileName  = enterFolderName.nextLine();
        File file = new File(path.toString(), fileName);
        file.createNewFile();
        if (file.isFile()) {
            System.out.printf("%s created ...\n", file.getName());
        }
    }

    public static void deleteFile(StringBuilder path) {
        System.out.print("Enter removable file name: ");
        Scanner enterFolderName = new Scanner(System.in);
        String fileName = enterFolderName.nextLine();
        File file = new File(path + "/" + fileName);
        if(file.isFile()) {
            System.out.printf("%s deleted ...\n", file.getName());
            file.delete();
        } else {
            System.out.println("<It is not a file> or <File not exists>");
        }
    }

    public static StringBuilder changeDir(StringBuilder defDir) {
        System.out.print("Enter directory: ");
        Scanner enterFolderName = new Scanner(System.in);
        String directory  = enterFolderName.nextLine();
        File dir = new File(defDir.append(directory).toString());
        if (dir.isDirectory()) {
            return new StringBuilder(dir.getPath() + "/");
        } else {
            System.out.println("Such folder does not exist");
            return defDir.append("/");
        }
    }

    public static StringBuilder previousDir(StringBuilder defDir) {
                defDir.delete(defDir.length() - 1, defDir.length());
                defDir.setLength(defDir.lastIndexOf("/"));
            return defDir.append("/");
    }

    public static void dirList(StringBuilder path) {
        File folder = new File(path.toString());
        if (folder.listFiles().length > 0) {
            System.out.print("***\n");
            for (File file : folder.listFiles()) {
                System.out.println(file.getName());
            }
            System.out.println("***\n");
        } else System.out.print("***\n" +
                                "Folder is empty\n" +
                                "***\n");
    }

    public static void fileManagerMenu() {
        System.out.println("Enter action:\n" +
                "1 - create folder\n" +
                "2 - create file\n" +
                "3 - delete folder\n" +
                "4 - delete file\n" +
                "5 - change directory\n" +
                "6 - previous directory\n" +
                "7 - directory list\n" +
                "8 - rename file\n" +
                "9 - copy file\n" +
                "10 - copy folder\n" +
                "0 - exit");
    }
}
