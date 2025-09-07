package HotelPetPet;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {
    private List<Pet> pets;
    private String endereco;
 
  
    

    public Tutor(String nome, String cpf) {
        super(nome, cpf);
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
