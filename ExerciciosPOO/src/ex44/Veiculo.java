package ex44;
//Crie uma classe Veiculo com os atributos: marca, modelo, ano. Crie classes concretas para carro, moto e caminhão,
// cada uma com suas características específicas.
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public void ligandoCarro(){
        System.out.println("ligando carro");
    }
    public void ligandoCaminhao(){
        System.out.println("ligando caminhao");
    }
    public void ligandoMoto(){
        System.out.println("ligando moto");
    }
}
