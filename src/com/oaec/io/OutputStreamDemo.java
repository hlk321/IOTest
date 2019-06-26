package com.oaec.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String s = " HelloWorld";
        File file = new File("F:\\demo\\text.txt");
        FileOutputStream os = new FileOutputStream(file,true);
        byte[] bytes = s.getBytes();
        os.write(bytes);
        os.close();
    }
}
