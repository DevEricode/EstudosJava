package OO.Composicao.Desafio;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eric");
        Compra compra1 = new Compra();

        compra1.adicionarItem(new Produto(1.00, "Caneta Preta"), 2);
        compra1.adicionarItem("Lapis", 0.50 , 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem(new Produto(2.00, "Lapizeira"), 2);
        compra2.adicionarItem(new Produto(2.50, "Apontador"), 3);

        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
