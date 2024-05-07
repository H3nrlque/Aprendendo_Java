package entities;

public class Data {
    public int dia, mes, ano;
    String verificacao;

    public String verificacao() {
        if (dia > 31 || dia < 1) {
            verificacao = "Dia inválido";
        } else if (mes > 12 || mes < 1) {
            verificacao = "Mês inválido";
        } else {
            verificacao = "Data válida";
        }
        return verificacao;
    }

    public String toString() {
        return "DATA: "+dia+"/"+mes+"/"+ano;
    }
}
