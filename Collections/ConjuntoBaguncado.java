package Collections;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto =  new HashSet();

        conjunto.add(true);
        conjunto.add(1.589);
        conjunto.add(5);
        conjunto.add('E');
        conjunto.add("Eric");

        System.out.println("O tamanho do conjunto é " + conjunto.size());

        conjunto.add(18.8);
        conjunto.add("Ana");
        conjunto.add("ana");

        System.out.println("O tamanho do conjunto é " + conjunto.size());

        System.out.println(conjunto.contains("Ana"));
        System.out.println(conjunto.contains("Tereza"));
        System.out.println(conjunto.contains(5));
        conjunto.remove("ana");

        System.out.println("O tamanho do conjunto é " + conjunto.size());

        Set nums = new HashSet();

        nums.add(2);
        nums.add(4);
        nums.add(8);
        nums.add(16);

        System.out.println(conjunto);

        nums.addAll(conjunto); //União de conjuntos

        System.out.println(nums);

        nums.retainAll(conjunto);

        System.out.println(nums);

        nums.clear();
        System.out.println(nums);

    }
}
