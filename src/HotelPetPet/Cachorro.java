package HotelPetPet;

public class Cachorro extends Pet {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
       
    }
    private String porte;

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
}
