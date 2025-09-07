package HotelPetPet;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private double comissao;

    public Funcionario(String nome, String cpf, String cargo, double salario, double comissao) {
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.comissao = comissao;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    /**
     * Adiciona um valor à comissão atual do funcionário.
     * @param valor A quantia a ser adicionada à comissão.
     */
    public void addComissao(double valor) {
        if (valor > 0) {
            this.comissao += valor;
        }
    }

    /**
     * Calcula o pagamento total do funcionário (salário + comissão)
     * e reseta a comissão para zero.
     * @return O valor total a ser pago.
     */
    public double getPgto() {
        double pagamentoTotal = this.salario + this.comissao;
        this.comissao = 0.0; // Reseta a comissão após o cálculo do pagamento
        return pagamentoTotal;
    }
}