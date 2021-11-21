package com.mycompany.projeto;

public class Gasto_Total extends Funcionario
{
    public double calcular_gasto(Funcionario fun)
    {    
        return (this.get_salario_base() - this.calcular_encargos());
    }
}
