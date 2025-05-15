public class Pessoa{
    private String nome;
    private String endereço;
    private int telefone;
    private int idade;


    public Pessoa(String nome, String endereço, int telefone, int idade) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.idade = idade;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void fazAniversário(int idade){
        idade = idade++;
    }
}