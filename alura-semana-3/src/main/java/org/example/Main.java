package org.example;

public class Main {
    public static void main(String[] args) {
        print(40);
        System.out.println("Seja bem vindo ao COMEX!");
        print(40);
    }

    public static void print(int valor){
        int valorAux = valor - 1;

        for(int x = 0; x < valor; x++) {

            if (valorAux == x) {
                System.out.println("*");
            } else {
                System.out.print("*");
            }
        }
    }
}