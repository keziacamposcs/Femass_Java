public class Main {
    public static void main(String[] args)
    {
        Estado estadoInicial = new Estado.EstadoPositivo();

        ContaBancaria contaBancaria_1 = new ContaBancaria(123, 50, estadoInicial);
        ContaBancaria contaBancaria_2 = new ContaBancaria(456, -300, estadoInicial);


        contaBancaria_1.deposito(100);
        contaBancaria_1.saque(10);
        contaBancaria_1.deposito(1);

        contaBancaria_2.deposito(50);
        contaBancaria_2.saque(300);

    }
}