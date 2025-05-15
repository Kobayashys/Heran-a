public class ContaPoupanca extends Conta {
    private double taxaJuros;
    private double rendimento;
    private double taxaSaque;

    public ContaPoupanca(double saldo, String numeroConta, String agencia, String banco, double taxaJuros, double taxaSaque) {
        super(saldo, numeroConta, agencia, banco);
        this.taxaJuros = taxaJuros;
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() {
        return this.taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getRendimento() {
        return this.rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void render() {
        this.rendimento = getSaldo() * 0.05;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de " + rendimento + " aplicado. Novo saldo: " + getSaldo());
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
        return false;
    }
    
}
