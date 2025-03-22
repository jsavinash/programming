package com.io;

import java.io.*;

class JavaFilterInputOutputStream implements IFileOperation {
    public void readFile() {
        try {
            File data = new File("C:\\Users\\avnishad\\Documents\\js_avinash\\programming\\programming\\intermediate\\java\\oops-concepts\\src\\main\\java\\com\\io\\note.txt");
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream ffout = new FilterOutputStream(file);
            String str = "Welcome to java tutorial";
            byte[] writeData = str.getBytes();
            ffout.write(writeData);
            ffout.flush();
            ffout.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeFile() {
        try {

            File data = new File("C:\\Users\\avnishad\\Documents\\js_avinash\\programming\\programming\\intermediate\\java\\oops-concepts\\src\\main\\java\\com\\io\\note.txt");
            FileInputStream file = new FileInputStream(data);
            FilterInputStream ffout = new BufferedInputStream(file);
            int i = 0;
            while ((i = ffout.read()) != -1) {
                System.out.print((char) i);
            }
            ffout.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        JavaFilterInputOutputStream instance = new JavaFilterInputOutputStream();
        instance.readFile();
        instance.writeFile();
    }
}