package HotelPetPet;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInfo() {
        return "Nome: " + this.nome + "\n" +
               "CPF: " + this.cpf + "\n" +
               "Telefone: " + this.telefone + "\n" +
               "Email: " + this.email;
	}
}
