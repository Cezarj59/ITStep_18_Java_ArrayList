package homework_18.services;

import static homework_18.services.Cadastros.cadastro;
import homework_18.veiculos.*;

public class Consultas {

    public static void consultaCarro() {

        if (cadastro.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastro.size(); i++) {
            if (cadastro.get(i) instanceof Carro) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastro.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastro.get(i) instanceof Carro == false && i == cadastro.size()) {
                System.err.println("\n\n###   NÃO HÁ CARROS CADASTRADOS.  ###\n\n");
            }

        }

    }

    public static void consultaMoto() {

        if (cadastro.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastro.size(); i++) {
            if (cadastro.get(i) instanceof Moto) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastro.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastro.get(i) instanceof Moto == false && i == cadastro.size()) {
                System.err.println("\n\n###   NÃO HÁ MOTOS CADASTRADOS.  ###\n\n");
            }

        }

    }

    public static void consultaCaminhao() {

        if (cadastro.isEmpty()) {
            System.err.println("\n\n###   NÃO HÁ CADASTROS NA BASE DE DADOS.   ###\n\n");
        }

        for (int i = 0; i < cadastro.size(); i++) {
            if (cadastro.get(i) instanceof Caminhao) {
                System.out.println("\n----------------------------------------\n");
                System.out.println(cadastro.get(i));
                System.out.println("\n----------------------------------------\n");
            } else if (cadastro.get(i) instanceof Caminhao == false && i == cadastro.size()) {
                System.err.println("\n\n###   NÃO HÁ MOTOS CADASTRADOS.  ###\n\n");
            }

        }

    }

}
