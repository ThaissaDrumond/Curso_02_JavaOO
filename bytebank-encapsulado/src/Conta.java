public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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
    } /* this é uma palavra chave de referencia para "este objeto". Podem existir n objetos criados, o uso da palavra
    this especifica, deixa claro em qual desses objetos será invocado o método. O this é usado em atributos/métodos que
    todos os objetos possuem*/

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
    }/* métodos get retornam o "conteúdo" dos objetos -- comando de saída // não é obrigatório inserir o parametro
     quando chamar o método*/

    public int getNumero() {
        return this.numero;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    } /*métodos set "inserem" dados nos atributos dos objetos -- comando de entrada o atributo precisa receber o
        parametro do método(this.nome = nome)*/

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}