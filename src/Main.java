
public class Main {
    public static void main(String[] args) {

        Cliente Mario = new Cliente("Mario", "344.873.223-87");
        Cliente Maria = new Cliente("Mario", "322.273.723-07");

        Conta conta1 = new Conta(Mario, 432d);
        Conta conta2 = new Conta(Maria, 821d);

        conta1.mostrarExtrato();
        conta2.mostrarExtrato();
        }
    }
