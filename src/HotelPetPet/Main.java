package HotelPetPet;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            // Cria o hotel
            Hotel hotel = new Hotel("Pet Hotel Feliz");
            
            // Cria os funcionários do hotel
            Funcionario funcBanho = new Funcionario("João", "999.888.777-66", "Esteticista", 2000.0, 0.0);
            Funcionario funcGeral = new Funcionario("Maria", "111.222.333-44", "Gerente", 3500.0, 0.0);
            
            // --- PRIMEIRA HOSPEDAGEM ---
            
            // Cria o primeiro tutor e pet
            Tutor tutor1 = new Tutor("Ana", "123.456.789-00");
            // Preenchendo as informações do tutor
            tutor1.setTelefone("41 99876-5432");
            tutor1.setEmail("ana@email.com");
            
            Pet cachorro1 = new Cachorro("Rex", 3);
            // Preenchendo as informações do pet
            cachorro1.setRaca("Golden Retriever");
            cachorro1.setDieta("Ração especial para cães adultos");
            cachorro1.setVacinacao(true);
            cachorro1.setCooperativo(true);
            
            tutor1.adicionarPet(cachorro1);

            // Define as datas e cria a primeira hospedagem
            LocalDate dataEntrada1 = LocalDate.of(2025, 10, 1);
            LocalDate dataSaida1 = LocalDate.of(2025, 10, 5);
            Hospedagem hospedagem1 = new Hospedagem(cachorro1, tutor1, dataEntrada1, dataSaida1);

            // Adiciona serviços extras (note que agora passamos o objeto Funcionario)
            Servico servicoBanho = new Servico("Banho", "Banho completo", 35.0, funcBanho);
            hospedagem1.adicionarServico(servicoBanho);

            // Registra a primeira hospedagem no hotel
            hotel.registrarHospedagem(hospedagem1);

            System.out.println("--- DADOS DA PRIMEIRA HOSPEDAGEM ---");
            System.out.println(tutor1.getInfo());
            System.out.println("--------------------");
            System.out.println(cachorro1.getInfo());
            System.out.println("--------------------");
            System.out.println("Dias de hospedagem: " + hospedagem1.getDias());
            
            System.out.println("\n---------------------\n");

            // --- SEGUNDA HOSPEDAGEM ---
            
            // Cria o segundo tutor e pet
            Tutor tutor2 = new Tutor("João", "987.654.321-11");
            // Preenchendo as informações do segundo tutor
            tutor2.setTelefone("41 99123-4567");
            tutor2.setEmail("joao@email.com");
            
            Pet gato1 = new Gato("Miau", 2);
            // Preenchendo as informações do segundo pet
            gato1.setRaca("Persa");
            gato1.setDieta("Ração para gatos castrados");
            gato1.setVacinacao(true);
            gato1.setCooperativo(false); // Gatos nem sempre são cooperativos!
            
            tutor2.adicionarPet(gato1);

            // Define as datas e cria a segunda hospedagem
            LocalDate dataEntrada2 = LocalDate.of(2025, 11, 10);
            LocalDate dataSaida2 = LocalDate.of(2025, 11, 20);
            Hospedagem hospedagem2 = new Hospedagem(gato1, tutor2, dataEntrada2, dataSaida2);
            
            // Adiciona serviços extras (note que passamos o objeto Funcionario)
            Servico servicoTosa = new Servico("Tosa", "Tosa especial", 50.0, funcBanho);
            hospedagem2.adicionarServico(servicoTosa);
            
            // Registra a segunda hospedagem no hotel
            hotel.registrarHospedagem(hospedagem2);

            System.out.println("--- DADOS DA SEGUNDA HOSPEDAGEM ---");
            System.out.println(tutor2.getInfo());
            System.out.println("--------------------");
            System.out.println(gato1.getInfo());
            System.out.println("--------------------");
            System.out.println("Dias de hospedagem: " + hospedagem2.getDias());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}