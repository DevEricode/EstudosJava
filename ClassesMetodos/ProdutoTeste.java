package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado Gamer", 250.00);

        var p2 = new Produto();
        p2.nome = "Mouse Gamer";
        p2.preco = 120.00;
        Produto.desconto = 0.30;

//        double precoComDesconto1 = p1.precoComDesconto();
//        double precoComDesconto2 = p2.precoComDesconto(0.10);

        System.out.println(p1.nome + " " + p2.nome);
        System.out.printf("O preço do produto é %.2f.", p1.precoComDesconto());
        System.out.println();
        System.out.printf("O preço do produto é %.2f.", p2.precoComDesconto());
    }
}
