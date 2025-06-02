package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        int c = 8;

        System.out.println(a + " " + b);
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data();
        Data d2 = d1;

        d2.dia = 11;
        d2.mes = 7;
        d1.ano= 1997;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        ajustarData(d2);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(c);
        ajustarValor(c);
        System.out.println(c);


    }

    static void ajustarData(Data novaData) {
        novaData.dia = 1;
        novaData.mes = 1;
        novaData.ano = 1970;
    }

    static void ajustarValor(int c) {
        c++;
    }


}
