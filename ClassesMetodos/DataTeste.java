package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data(6,2,1960);
        Data d3 = new Data();

        d3.dia = 9;
        d3.mes = 7;
        d3.ano = 1931;


        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());

    }
}
