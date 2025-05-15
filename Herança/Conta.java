abstract public class Conta {
    private double saldo;
    private String numeroConta;
    private String agencia;
    private String banco;
    
    public Conta(double saldo, String numeroConta, String agencia, String banco){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.banco = banco;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    abstract public boolean sacar();
    abstract public boolean depositar();
}
