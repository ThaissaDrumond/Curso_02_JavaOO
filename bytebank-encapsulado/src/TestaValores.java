public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1137, 245576);

        /* essa conta está inconsistente:
        conta.setAgencia(-50);
        conta.setNumero(-330);*/
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1124, 45497);
        Conta conta3 = new Conta(5659, 235674);
        System.out.println(Conta.getTotal());
    }
}