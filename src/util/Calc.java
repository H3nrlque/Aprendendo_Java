package util;

public class Calc {
    private String nome;
    private int idade;
    private double altura;

    public Calc(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double Verificacao(double id) {
        id = (id + id) * 10;
        return id;
    }

}
