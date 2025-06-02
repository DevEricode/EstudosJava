package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(5.5);

        Double raio2 = AreaCirc.area(5.8);

        System.out.println(a1.area());

        System.out.println(raio2);

        System.out.println(AreaCirc.area(9.5));

    }
}
