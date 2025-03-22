package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class JavaFileInputAndOutputStream implements IFileOperation {
    public void readFile() {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\avnishad\\Documents\\js_avinash\\programming\\programming\\intermediate\\java\\oops-concepts\\src\\main\\java\\com\\io\\note.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (IOException e) {

        }
    }

    public void writeFile() {
        try {
            FileInputStream fin = new FileInputStream("C:\\\\Users\\\\avnishad\\\\Documents\\\\js_avinash\\\\programming\\\\programming\\\\intermediate\\\\java\\\\oops-concepts\\\\src\\\\main\\\\java\\\\com\\\\io\\\\note.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        JavaFileInputAndOutputStream instance = new JavaFileInputAndOutputStream();
        instance.readFile();
        instance.writeFile();
    }
}