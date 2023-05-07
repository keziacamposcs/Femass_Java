public abstract class Estado {
    public abstract void saque(ContaBancaria contaBancaria, double valor);
    public abstract void deposito(ContaBancaria contaBancaria, double valor);

    public static class EstadoPositivo extends Estado
    {
        @Override
        public void saque(ContaBancaria contaBancaria, double valor)
        {
            if (contaBancaria.getSaldo() - valor < -100.0)
            {
                contaBancaria.setEstado(new EstadoNegativo());
                System.out.println("Conta: "+ contaBancaria.getNum_conta() + " está negativo");
            }
            else
            {
                contaBancaria.debitar(valor);
            }
        }

        @Override
        public void deposito (ContaBancaria contaBancaria, double valor)
        {
            contaBancaria.creditar(valor);
        }
    }

    public static class EstadoNegativo extends Estado
    {
        @Override
        public void saque(ContaBancaria contaBancaria, double valor)
        {
            System.out.println("Conta: "+ contaBancaria.getNum_conta() + " está bloqueado");
        }

        @Override
        public void deposito(ContaBancaria contaBancaria, double valor)
        {
            contaBancaria.creditar(valor);

            if(contaBancaria.getSaldo() >= 0.0)
            {
                contaBancaria.setEstado(new EstadoPositivo());
                System.out.println("Conta: " + contaBancaria.getNum_conta() + " está positivo");
            }
        }
    }

    public static class EstadoBloqueado extends Estado
    {
        @Override
        public void saque(ContaBancaria contaBancaria, double valor)
        {
            System.out.println("Conta: "+ contaBancaria.getNum_conta() + " está bloqueado");
        }

        @Override
        public void deposito(ContaBancaria contaBancaria, double valor)
        {
            contaBancaria.creditar(valor);

            if(contaBancaria.getSaldo() >= 0.0)
            {
                contaBancaria.setEstado(new EstadoPositivo());
                System.out.println("Conta: " + contaBancaria.getNum_conta() + " está positivo");
            }
            else if (contaBancaria.getSaldo() < -100.0)
            {
                contaBancaria.setEstado(new EstadoNegativo());
                System.out.println("Conta: " + contaBancaria.getNum_conta() + " está negativo");
            }
        }
    }


}
