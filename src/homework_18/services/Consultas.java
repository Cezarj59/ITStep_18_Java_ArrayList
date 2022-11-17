package homework_18.services;

import static homework_18.services.Cadastros.cadastros;
import homework_18.veiculos.*;

public class Consultas {

    public static void consultaCarro() {

        if (cadastros.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastros.size(); i++) {
            if (cadastros.get(i) instanceof Carro) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastros.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastros.get(i) instanceof Carro == false && i == cadastros.size()) {
                System.err.println("\n\n###   NÃO HÁ CARROS CADASTRADOS.  ###\n\n");
            }

        }
    }

    public static void consultaMoto() {

        if (cadastros.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastros.size(); i++) {
            if (cadastros.get(i) instanceof Moto) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastros.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastros.get(i) instanceof Moto == false && i == cadastros.size()) {
                System.err.println("\n\n###   NÃO HÁ MOTOS CADASTRADOS.  ###\n\n");
            }

        }

    }

    public static void consultaCaminhao() {

        if (cadastros.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastros.size(); i++) {
            if (cadastros.get(i) instanceof Caminhao) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastros.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastros.get(i) instanceof Caminhao == false && i == cadastros.size()) {
                System.err.println("\n\n###   NÃO HÁ MOTOS CADASTRADOS.  ###\n\n");
            }

        }

    }

}
