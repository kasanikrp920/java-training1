package com.trimindtech.training.day6;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        String name="Kasni Raghupathi";
        String name1="TrimindTech";
        FileWriter fw=new FileWriter("raghu.txt");
        fw.write(name);
        BufferedWriter bw=new BufferedWriter(fw);



        fw.close();

        FileReader fr=new FileReader("raghu.txt");
        BufferedReader b = new BufferedReader(fr);
        System.out.println(b.readLine());
        b.close();

    }
}