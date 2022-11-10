package TEMA.Animal.Animal;


import java.util.Scanner;

public class Peixe extends Animal {
    public Peixe() {}

    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public String getBrinde() {
        return "acompanha saco de transporte";
    }

    @Override
    public void imprime() {
        System.out.println("Peixinho: " + super.getNome());
        System.out.println("Brinde: " + this.getBrinde());
    }

    public static Animal cadastra(){
        Scanner leia = new Scanner(System.in);

        System.out.print("Nome do peixinho: ");
        Animal animal= new Peixe(leia.nextLine());

        return animal;
    }
}
