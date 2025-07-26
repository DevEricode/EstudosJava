package OO.Composicao;

public class Motor {
    
    // Relação unidirecional não precisa criar um atributo na classe.
    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro) {
        this.carro =  carro;
    }


    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }

}
