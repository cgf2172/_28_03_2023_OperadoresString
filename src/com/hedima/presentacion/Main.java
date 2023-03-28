package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Asignacion de variables
        int a = 10;
      //  a=a+5;
        a+=5;
        System.out.println(a);
        int b = 10;
        //b=b-5;
        b-=5;
        System.out.println(b);
        //Resto
        int c = 10;
        System.out.println(c%3);
        //Imcremento
        int e=10;
        //e+=1;
        e++;
        System.out.println(e);
        //Pre-incremento
        //int d=10;
        //int f=5;
        //d+=f++;
        //Post incremento
        int d=10;
        int f=5;
        d+=++f;
        System.out.println(d);
        System.out.println(f);
        int i=10;
        int j=5;
        i-=j--;
        System.out.println(i);
        System.out.println(j);

    }
}