package TEMA;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();

        System.out.println(frutas);

        //adicionando um valor no ArrayList
        frutas.add("Uva");
        frutas.add("Banana");

        System.out.println(frutas);
        System.out.println(frutas.get(0));
        System.out.println(frutas.get(1));
        System.out.println();
        frutas.add(0, "Melão");
        System.out.println(frutas);

        //substituindo um valor no ArrayList
        frutas.set(0, "Pêra");
        System.out.println(frutas);

        //.contains retorna valor booleano
        System.out.println(frutas.contains("Banana"));
        //.indexOf retorna o valor da casa que o conteudo está
        System.out.println(frutas.indexOf("Banana"));
        //ex:
        frutas.add("Melão");
        if (frutas.contains("Melão")) {
            System.out.println(frutas.indexOf("Melão"));
        }

        //Criando um ArrayList tipo Classe
        //ArrayList<Animal> animais = new ArrayList<Animal>();
        //remove o index
        frutas.remove(0);
        System.out.println(frutas);
        
        //remove a ultima casa
        frutas.remove(frutas.size() - 1);

        System.out.println(frutas);
    }
}
