public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; // atributos da instancia, do objeto
    private static int total;  //static - atributo da classe: todo atributo static é um atributo da classe

    public Conta(int agencia, int numero){
        Conta.total++; //por estar usando um atributo da classe, não se pode usar o "this", deve usar o nome da classe
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando uma conta " + this.numero);

    } /* Construtor da Conta
            Se no código não se cria um construtor, o Java usa o construtor padrão, que seria um contrutor "vazio" que
        não faz nada basicamente nada.
            Ao criar um construtor, é estabelecida a rotina de inicialização de uma nova instancia de objeto. É executado
        apenas uma vez, na construção do objeto. Só pode ser executado novamente quando se constroi um novo objeto(new).
        Não tem como executar mais de uma vez para o mesmo objeto, sempre cria um novo objeto
            Os parametros de um construtor "obrigam" que sejam informados os "valores" daqueles atributos definidos como
        parametros. Neste exemplo, ao criar uma nova conta,é obrigatório informar a agencia e número
            Os parametros variam conforme a regra de negócio. */
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
    } /* this é uma palavra chave de referencia para "este objeto". Podem existir N objetos criados, o uso da palavra
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
        if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    } /*métodos set "inserem" dados nos atributos dos objetos -- comando de entrada o atributo precisa receber o
        parametro do método(this.nome = nome)*/
    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        /*System.out.println(this.saldo); --- Dentro de um método estático, não se pode  acessar atributos de instancia.
        Métodos estáticos podem acessar somente atributos estáticos */
        return Conta.total;
    } // Por ser um get de um atributo da classe, tem que ser declarado como static também.

}