public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero()); /* não é necessário informar o parametro em métodos get, pois eles
        retornam o "conteudo" do atributo*/

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);/* referencia entre objetos, flecha que aponta para a mesma instancia de objeto(paulo)
        da classe Cliente ,informando que o atributo "titular" da classe Conta é referente a instancia "paulo" da classe
        Cliente*/

        System.out.println(conta.getTitular()); /*imprime o "conteúdo" do atributo "titular". Como este é um atributo de
        referencia, vai imprimir o valor da referencia(vai imprimir o valor da seta que direciona pra onde está sendo
        apontado - endereço de memória)*/

        System.out.println(conta.getTitular().getNome()); /*pega a referencia da 1 instancia de objeto(conta), depois
        pega o conteúdo do atributo da outra instancia de objeto(nome do Cliente)*/

        conta.getTitular().setProfissao("programador");/*outra forma de uso com referenncias: a instancia "conta", da
        classe "Conta", está pegando(get) o atributo "titular" e alterando, inserindo(set) no atributo "profissao" da
        instancia da classe"Cliente"*/

        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular(); /*esta variavel temporária "aponta" para a mesma instancia de
        objeto, pois foi criada apenas uma nova instancia da classe Cliente */
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
    }
}