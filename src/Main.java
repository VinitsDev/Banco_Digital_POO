
public class Main {
    public static void main(String[] args) {

        Cliente Mario = new Cliente("Mario", "344.873.223-87");
        Cliente Maria = new Cliente("Mario", "322.273.723-07");

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(Mario, 155d);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(Maria, 450d);

        contaPoupanca1.mostrarExtrato();
        contaPoupanca2.mostrarExtrato();

        contaPoupanca1.depositar(45d);
        contaPoupanca1.transferir(50d, contaPoupanca2);

        contaPoupanca2.sacar(50d);

        contaPoupanca1.mostrarExtrato();
        contaPoupanca2.mostrarExtrato();
        }
    }
