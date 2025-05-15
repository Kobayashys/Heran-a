public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String endereço, int telefone, int idade, String cpf) {
        super(nome, endereço, telefone, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
