public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("===Conta Corrente===");
        System.out.println("identificador: "+getId());
        System.out.println("saldo: "+getSaldo());
        System.out.println("data criada: "+getDataCriada());
    }
}
