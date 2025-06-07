package Collections;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Paulo Amorim";
        u1.email = "pepa@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Paulo Amorim";
        u2.email = "pepa@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
