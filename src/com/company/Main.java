package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heat ;
        System.out.print("Sıcaklık Giriniz : ");
        heat = scanner.nextInt();
        if (heat<5)
        {
            System.out.print("Kayak Yapabilirsiniz !");

        }
        else if(heat<10){
            System.out.print("Sinemaya gidebilirsiniz !");
        }
        else if (heat<=25){
            System.out.println("Sinemaya ve Pikniğe Gidebilirsin !");
        }
        else  {
            System.out.println("Yüzmeye Gidebilirsin !");
        }
    }
}