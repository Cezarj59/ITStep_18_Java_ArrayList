package homework_18.menu;

import homework_18.services.Cadastros;
import homework_18.services.Consultas;
import java.util.Scanner;

public class Menu {

    static Scanner read = new Scanner(System.in);

    public static void menu() {

        while (0 == 0) {
            System.out.println("\n   ------Concessionária------ ");
            System.out.println("\n----------Menu Inicial----------\n");
            System.out.println("[1] Cadastros");
            System.out.println("[2] Consultas");
            System.out.println("[0] Sair");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    menuCadastro();
                case "2" ->
                    menuConsulta();

                case "0" -> {
                    System.out.println("\nSistema finalizado!!!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    menu();
                }
            }
        }
    }

    public static void menuCadastro() {
        System.out.println("\n----------Menu Cadastros----------\n");
        System.out.println("(1)Carro");
        System.out.println("(2)Caminhão");
        System.out.println("(3)Moto");
        System.out.print("\nInforme uma opção: ");
        String option = read.nextLine();

        switch (option) {
            case "1" -> {
                Cadastros.cadastroCarro();
                System.out.println("\n\n### Carro cadastrado com sucesso! ###\n\n");
            }
            case "2" -> {
                Cadastros.cadastroCaminhao();
                System.out.println("\n\n### Caminhão cadastrado com sucesso! ###\n\n");
            }
            case "3" -> {
                Cadastros.cadastroMoto();
                System.out.println("\n\n### Moto cadastrado com sucesso! ###\n\n");
            }
            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);
            }
            default -> {
                System.out.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menu();
            }
        }

    }

    public static void menuConsulta() {
        System.out.println("\n----------Menu Consultas----------\n");
        System.out.println("(1)Carro");
        System.out.println("(2)Caminhão");
        System.out.println("(3)Moto");
        System.out.println("(4)Voltar");
        System.out.println("(0)Sair");
        System.out.print("\nInforme uma opção: ");
        String option = read.nextLine();

        switch (option) {
            case "1" ->
                Consultas.consultaCarro();

            case "2" ->
                Consultas.consultaCaminhao();

            case "3" ->
                Consultas.consultaMoto();

            case "4" ->
                menu();
            case "0" -> {
                System.out.println("\nSistema finalizado!!!");
                System.exit(0);

            }
            default -> {
                System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                menuConsulta();
            }
        }
    }

    public static void subMenuCadastro() {

        while (0 == 0) {
            System.out.println("\n-----------Sub Menu Cadastros-----------\n");
            System.out.println("[1] Novo Cadastro");
            System.out.println("[2] Novo Consulta");
            System.out.println("[3] Menu Inicial");
            System.out.print("\nDigite a opção: ");
            String option = read.nextLine();

            switch (option) {
                case "1" ->
                    menuCadastro();

                case "2" ->
                    menuConsulta();

                case "3" ->
                    menu();

                default -> {
                    System.err.println("\nOps!!! Você digitou uma opção invalida.\nTente Novamente.");
                    subMenuCadastro();
                }
            }
        }
    }
}
