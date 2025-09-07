package HotelPetPet;

public class Gato extends Pet {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    private String pelagem;

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
}
