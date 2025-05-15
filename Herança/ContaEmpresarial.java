public class ContaEmpresarial extends Conta{
    private double taxaSaque;
    private PessoaJuridica titular;

    public ContaEmpresarial(double saldo, String numeroConta, String agencia, String banco, double taxaSaque, PessoaJuridica titular) {
        super(saldo, numeroConta, agencia, banco);
        this.taxaSaque = taxaSaque;
        this.titular = titular;
    }

    public PessoaJuridica getTitular() {
        return this.titular;
    }

    public void setTitular(PessoaJuridica titular) {
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
}
