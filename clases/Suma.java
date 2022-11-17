package clases;

public class Suma extends Operacion
{
    public Suma(double X, double Y)
    {
        super(X, Y);
    }

    public void sumar()
    {
        resultado = x + y;
    }
}
