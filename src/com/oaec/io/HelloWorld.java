package com.oaec.io;

import java.io.File;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\demo\\a\\b\\c\\text.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if(!file.exists()){
            file.createNewFile();
        }else {
            file.delete();
        }

    }
}
