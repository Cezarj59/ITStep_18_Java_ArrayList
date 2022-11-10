package homework_18.veiculos;

public class Carro extends Veiculo {

    private boolean opcionalFreioABS;
    private boolean opcionalDirecaoH;
    private boolean opcional4Portas;
    private boolean opcionalArCondicionado;

    public Carro(boolean opcionalFreioABS, boolean opcionalDirecaoH, boolean opcional4Portas, boolean opcionalArCondicionado, String ano, String fabricante, String modelo, String cor, boolean novo) {
        super(ano, fabricante, modelo, cor, novo);
        this.opcionalFreioABS = opcionalFreioABS;
        this.opcionalDirecaoH = opcionalDirecaoH;
        this.opcional4Portas = opcional4Portas;
        this.opcionalArCondicionado = opcionalArCondicionado;
    }

    public String isOpcionalFreioABS() {
        return opcionalFreioABS == true ? "Sim" : "Não Possui";
    }

    public void setOpcionalFreioABS(boolean opcionalFreioABS) {
        this.opcionalFreioABS = opcionalFreioABS;
    }

    public String isOpcionalDirecaoH() {
        return opcionalDirecaoH == true ? "Sim" : "Não Possui";
    }

    public void setOpcionalDirecaoH(boolean opcionalDirecaoH) {
        this.opcionalDirecaoH = opcionalDirecaoH;
    }

    public String isOpcional4Portas() {
        return opcional4Portas == true ? "Sim" : "Não";
    }

    public void setOpcional4Portas(boolean opcional4Portas) {
        this.opcional4Portas = opcional4Portas;
    }

    public String isOpcionalArCondicionado() {
        return opcionalArCondicionado == true ? "Sim" : "Não Possui";
    }

    public void setOpcionalArCondicionado(boolean opcionalArCondicionado) {
        this.opcionalArCondicionado = opcionalArCondicionado;
    }

    @Override
    public String toString() {
        return    "\nModelo = " + getModelo()
                + "\nFabricante = " + getFabricante()
                + "\nEstado = " + isNovo()
                + "\nCor = " + getCor()
                + "\nAno = " + getAno()
                + "\nDireção Hidraulica = " + isOpcionalDirecaoH()
                + "\n4 Portas = " + isOpcional4Portas()
                + "\nAr Condicionado = " + isOpcionalArCondicionado()
                + "\nFreio ABS = " + isOpcionalFreioABS();
    }

}
