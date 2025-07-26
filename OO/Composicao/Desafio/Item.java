package OO.Composicao.Desafio;

public class Item {
    final int qtde;
    final Produto produto;

    Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.qtde = quantidade;
    }

}
