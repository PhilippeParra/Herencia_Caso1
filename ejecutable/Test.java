package ejecutable;

import javax.swing.JOptionPane;

import clases.Suma;
import clases.Resta;
import clases.Division;
import clases.Multiplicacion;

public class Test 
{
    public static void main(String[] args) 
    {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        Suma miSuma = new Suma(x , y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null , "la suma de " + x + " y " + y + " es: " + miSuma.mostrarResultado());
        
        Resta miResta = new Resta(x , y);
        miResta.restar();
        JOptionPane.showMessageDialog(null , "la Resta de " + x + " y " + y + " es: " + miResta.mostrarResultado());

        Multiplicacion miMultiplicacion = new Multiplicacion(x , y);
        miMultiplicacion.multiplicar();
        JOptionPane.showMessageDialog(null , "la multiplicacion de " + x + " y " + y + " es: " + miMultiplicacion.mostrarResultado());

        System.exit(0);
    }
}
