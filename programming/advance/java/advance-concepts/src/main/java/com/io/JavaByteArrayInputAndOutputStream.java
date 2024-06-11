package com.io;

import java.io.*;

class JavaByteArrayInputAndOutputStream implements IFileOperation {
    public void readFile() {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\avnishad\\Documents\\js_avinash\\programming\\programming\\intermediate\\java\\oops-concepts\\src\\main\\java\\com\\io\\note.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout);
            bout.flush();
            bout.close();
            System.out.println("success...");
        } catch (IOException e) {

        }
    }

    public void writeFile() {
        try {
            FileInputStream fin = new FileInputStream("C:\\\\Users\\\\avnishad\\\\Documents\\\\js_avinash\\\\programming\\\\programming\\\\intermediate\\\\java\\\\oops-concepts\\\\src\\\\main\\\\java\\\\com\\\\io\\\\note.txt");
            ByteArrayInputStream bin = new ByteArrayInputStream(fin.readAllBytes());
            int i = 0;
            while ((i = bin.read()) != -1) {
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
        JavaByteArrayInputAndOutputStream instance = new JavaByteArrayInputAndOutputStream();
        instance.readFile();
        instance.writeFile();
    }
}