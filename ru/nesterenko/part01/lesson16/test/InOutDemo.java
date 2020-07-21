package ru.nesterenko.part01.lesson16.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InOutDemo {
    public static void main(String[] args) {
        String path = "/Users/NII/Desktop/Development/src/ru/nesterenko/part01/lesson16/lecture/test/";
       try (FileInputStream fis = new FileInputStream(new File(path + "f.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(System.out);
            FileOutputStream fos = new FileOutputStream(new File(path + "reverse.txt"))) {
           int symbol;
           List<Byte> byteList = new ArrayList<>();
           while ((symbol = fis.read()) != -1) {
               byteList.add((byte)symbol);
           }
           for (int i = (byteList.size() - 1); i != -1; i--) {
               fos.write(byteList.get(i));
           }
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }

    }
}
