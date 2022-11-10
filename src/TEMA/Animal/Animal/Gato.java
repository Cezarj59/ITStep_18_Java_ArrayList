package TEMA.Animal.Animal;


import java.util.Scanner;

public class Gato extends Animal {
    public Gato() {}

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String getBrinde() {
        return "acompanha caixa de transporte";
    }

    @Override
    public void imprime() {
        System.out.println("Gatinho: " + super.getNome());
        System.out.println("Brinde: " + this.getBrinde());
    }

    public static Animal cadastra(){
        Scanner leia = new Scanner(System.in);

        System.out.print("Nome do gatinho: ");
        Animal animal= new Gato(leia.nextLine());

        return animal;
    }
}
