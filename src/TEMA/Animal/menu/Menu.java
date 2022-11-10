package TEMA.Animal.menu;

import TEMA.Animal.Animal.*;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Menu {

    public static void inicio() {
        ArrayList<Animal> animais = new ArrayList<Animal>();

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos animais serão cadastrados?");
        int quantidade = leia.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Deseja cadastar:");
            System.out.println("(1)Cão");
            System.out.println("(2)Gato");
            System.out.println("(3)Peixe");
            System.out.print("Informe uma opção: ");

            switch (leia.nextInt()) {
                case 1:
                    animais.add(Cao.cadastra());
                    System.out.println("Cão cadastrado com sucesso!\n\n");
                    break;
                case 2:
                    animais.add(Gato.cadastra());
                    System.out.println("Gato cadastrado com sucesso!\n\n");
                    break;
                case 3:
                    animais.add(Peixe.cadastra());
                    System.out.println("Peixinho cadastrado com sucesso!\n\n");
                    break;
            }

            System.out.println("Deseja continuar o cadastro? (1) Sim (0) Não");
            if (leia.nextInt() == 0) {
                System.out.println("Saindo do Cadastro");
                break;
            }
        }

        System.out.println();
        System.out.println("\n\nAnimais cadastados:");

        for (Animal a : animais) {

            a.imprime();

            System.out.println("---------------------------");
        }

    }
}
