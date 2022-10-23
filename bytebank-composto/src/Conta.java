public class Conta {

    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    void deposita(double valor) {
        this.saldo = this.saldo + valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }// métodos get retornam o "conteúdo" dos objetos -- comando de saída
}