package com.mycompany.projeto;

import javax.swing.JOptionPane;

public class main 
{
    public static void main(String[] args)
    {
        Quadrado q1 = new Quadrado(4);
        Triangulo t1 = new Triangulo(5,8,2,2);
        Circulo c1 = new Circulo(7);
        Retangulo r1 = new Retangulo(5,4);

        String quadrado1 = "A área do quadrado q1 é: "+q1.calculaArea()+"\n";
        String triangulo1 = "A área do triangulo1 t1 é: "+t1.calculaArea()+"\n";
        String circulo1 = "A área do circulo c1 é: "+c1.calculaArea()+"\n";
        String retangulo1 = "A área do retangulo r1 é: "+r1.calculaArea()+"\n";
        
        JOptionPane.showMessageDialog(null, quadrado1,"Area do quadrado:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, triangulo1,"Area do trinagulo:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, circulo1,"Area do circulo:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, retangulo1,"Area do retangulo:",JOptionPane.INFORMATION_MESSAGE);

    }
}
