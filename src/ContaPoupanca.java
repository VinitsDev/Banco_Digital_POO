public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("===Conta Poupanca===");
        System.out.println("identificador: "+getId());
        System.out.println("saldo: "+getSaldo());
        System.out.println("data criada: "+getDataCriada());
    }

}
