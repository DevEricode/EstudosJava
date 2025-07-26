package OO.Composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "Eric";
        compra1.itens.add(new Item("Mouse Gamer", 248.00, 2));
        compra1.adicionarItem(new Item("Teclado Gamer", 550.00, 1));
        compra1.adicionarItem("Headset Gamer", 854.44, 5);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.ObterValorTotal());
    }
}
