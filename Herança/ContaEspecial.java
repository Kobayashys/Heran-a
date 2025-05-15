public class ContaEspecial extends Conta {
    private double taxaSaque;
    private double chequeEspecial;
    private PessoaFisica titular;

    public ContaEspecial(PessoaFisica titular, double saldo, String numeroConta, String agencia, String banco, double taxaSaque, double chequeEspecial) {
        super(saldo, numeroConta, agencia, banco);
        this.titular = titular;
        this.taxaSaque = taxaSaque;
        this.chequeEspecial = chequeEspecial;
    }

    public PessoaFisica getTitular() {
        return this.titular;
    }
    
    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }

    public double getTaxaSaque() {
        return this.taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar() {
        if (getSaldo() + chequeEspecial >= taxaSaque) {
            setSaldo(getSaldo() - taxaSaque);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    @Override
    public boolean depositar() {
        double valorSaldo = getSaldo() + taxaSaque;
        setSaldo(valorSaldo);
        return true;
    }

    public boolean transferir(ContaEspecial contaDestino, double valor) {
        if (getSaldo() + chequeEspecial >= valor) {
            setSaldo(getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }
}