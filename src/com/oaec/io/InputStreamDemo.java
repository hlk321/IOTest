package com.oaec.io;

import java.io.*;
import java.util.Arrays;

public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\demo\\text.txt");
        FileInputStream is = new FileInputStream(file);
        byte[] bytes = new byte[6];
        int len = -1;
        StringBuffer sb = new StringBuffer();
        while ((len = is.read(bytes)) != -1){
            String s = new String(bytes,0,len);
            sb.append(s);
        }
        System.out.println("sb = " + sb);
        is.close();
    }
}
