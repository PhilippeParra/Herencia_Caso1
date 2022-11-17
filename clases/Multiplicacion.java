package clases;

public class Multiplicacion extends Operacion
{
    public Multiplicacion(double X, double Y)
    {
        super(X, Y);
    }

    public void multiplicar()
    {
        resultado = x * y;
    }
}
