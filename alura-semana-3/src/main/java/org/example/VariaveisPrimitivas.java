package org.example;

import java.util.ArrayList;
import java.util.List;

public class VariaveisPrimitivas {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("Fulano", 1980);

        Cliente sicrano = new Cliente("Sicrano", 2000);

        System.out.println("Listagem dos Clientes");
        System.out.println("Ano atual: 2024");
        System.out.println("__________________________");


        System.out.println("Nome: "+ fulano.getNome());
        System.out.println("Data de Nascimento: "+ fulano.getDataDeNascimento());
        System.out.println("Idade: " + fulano.idade());
        System.out.println("Classificação etária: " + fulano.classificacaoEtaria());

        System.out.println("__________________________");

        System.out.println("Nome: "+ sicrano.getNome());
        System.out.println("Data de Nascimento: "+ sicrano.getDataDeNascimento());
        System.out.println("Idade: " + sicrano.idade());
        System.out.println("Classificação etária: " + sicrano.classificacaoEtaria());

    }


}
