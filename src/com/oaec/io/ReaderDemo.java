package com.oaec.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\demo\\text.txt");
        FileReader reader = new FileReader(file);
        char[] chars = new char[8];
        int len = -1;
        StringBuffer sb = new StringBuffer();
        while ((len = reader.read(chars)) != -1){
            String s = new String(chars, 0, len);
            sb.append(s);
        }
        System.out.println("sb = " + sb);
        reader.close();
    }
}
