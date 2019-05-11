package com.company;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //
        Socket s=new Socket(InetAddress.getByName("23b90x1505.qicp.vip"),50293);
        final BufferedReader in1 =new BufferedReader(new InputStreamReader(s.getInputStream()));
        final PrintWriter out1=new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        rec(in1,out1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        while (true) {
            send(in1, out1);
        }
    }
    public static void send(BufferedReader in1,PrintWriter out1){
        Scanner in=new Scanner(System.in);
        out1.println(in.nextLine());
    }
    public static void rec(BufferedReader in1,PrintWriter out1) throws IOException {
        System.out.println(in1.readLine());
    }
}