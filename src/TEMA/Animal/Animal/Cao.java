package TEMA.Animal.Animal;


import java.util.Scanner;

public class Cao extends Animal {

    public Cao(String nome) {
        super(nome);
    }

    public Cao() {
    }

    @Override
    public String getBrinde() {
        return "acompanha coleira e pote de ração";
    }

    @Override
    public void imprime() {
        System.out.println("Cãozinho: " + super.getNome());
        System.out.println("Brinde: " + this.getBrinde());
    }

    public static Animal cadastra() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Nome do cãozinho: ");
        Animal animal = new Cao(leia.nextLine());

        return animal;
    }
}
