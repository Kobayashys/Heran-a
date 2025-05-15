public class ContaCorrente extends Conta {
    private double taxaSaque;
    private PessoaFisica titular;

    public ContaCorrente(double saldo, String numeroConta, String agencia, String banco, double taxaSaque, PessoaFisica titular) {
        super(saldo, numeroConta, agencia, banco);
        this.taxaSaque = taxaSaque;
        this.titular = titular;
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

    @Override
    public boolean sacar() {
        if(getSaldo() >= taxaSaque) {
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

    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if(getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência.");
            return false;
        }
    }
}
