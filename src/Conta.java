import java.time.LocalDate;
import java.time.LocalDateTime;

public class Conta implements ContaOperations{

    private static Integer ID = 1;

    private final Integer id;
    private Cliente cliente;
    private Double saldo;
    private final LocalDate dataCriada;

    //métodos especiais
    @Override
    public void sacar(Double valor) {
        if(getSaldo()<valor || valor<0){
            throw new RuntimeException("Nao é permitido valores negativos!");
        } else {
            setSaldo(getSaldo()-valor);
            System.out.println("Saque de "+valor+" feito com sucesso!");
        }
    }

    @Override
    public void depositar(Double valor) {
        if(valor<0){
            throw new RuntimeException("Nao é permitido valores negativos!");
        } else {
            setSaldo(getSaldo()+valor);
            System.out.println("Deposito de "+valor+" feito com sucesso!");
        }
    }

    @Override
    public void transferir(Double valor, Conta conta) {
        if (getSaldo()<valor || valor<0){
            throw new RuntimeException("Nao é permitido valores negativos!");
        } else {
            setSaldo(getSaldo()-valor);
            conta.setSaldo(getSaldo()+valor);
            System.out.println("Transferencia feita com sucesso");
        }
    }

    @Override
    public void mostrarExtrato() {
        System.out.println("===Conta===");
        System.out.println("identificador: "+getId());
        System.out.println("saldo: "+getSaldo());
        System.out.println("data criada: "+getDataCriada());
    }

    //construtor
    public Conta(Cliente cliente, Double saldo) {
        this.id = ID++;
        this.cliente = cliente;
        this.saldo = saldo;
        this.dataCriada = LocalDate.now();
    }

    //getters e setters
    public Integer getId(){
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataCriada() {
        return dataCriada;
    }
}
