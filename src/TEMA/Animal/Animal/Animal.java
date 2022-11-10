package TEMA.Animal.Animal;

public abstract class Animal {

    private String nome;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String getBrinde();

    public abstract void imprime();

    public static Animal cadastra() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
