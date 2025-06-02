package classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Eric Sampaio", 71.5);
        Comida batataFrita = new Comida("Batata frita", 0.200);
        Comida feijoada = new Comida("Feijoada", 0.500);

        System.out.println(p1.apresentar());
        p1.comer(batataFrita);
        System.out.println(p1.apresentar());
        p1.comer(feijoada);
        System.out.println(p1.apresentar());

    }
}
