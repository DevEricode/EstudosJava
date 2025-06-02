package classe.desafio;

public class Pessoa {
    String nome;
    double peso;
    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    public void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + this.nome + "e tenho " + this.peso + ".";
    }

}
