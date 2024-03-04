package org.example;

public class Cliente {
    private String nome;
    private int dataDeNascimento;

    public Cliente(String nome, int dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Cliente() {
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String letra) {
        this.nome = letra;
    }

    public int idade(){
        return 2024 - this.dataDeNascimento;
    }

    public String classificacaoEtaria(){
        int idade = idade();
        if(idade <= 17){return "ADOLESCENTE";}
        if(idade >= 18 && idade <=29) {return "JOVEM";}
        if(idade >= 30 && idade <=59) {return "ADULTO";}
        if(idade >= 60) {return "IDOSO";}
       return "";
    }
}

//    Classificação etária
//    Se idade <= 17 então "ADOLESCENTE"
//        Se idade >= 18 E idade <=29 então "JOVEM"
//        Se idade >=30 E idade <=59 então "ADULTO"
//        Se idade >= 60 então "IDOSO"