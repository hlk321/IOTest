package com.oaec.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\demo\\text.txt");
        FileWriter writer = new FileWriter(file);
        String str = "嘎嘎嘎嘎";
        writer.write(str);
        writer.close();
    }
}
