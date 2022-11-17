package clases;

public class Resta extends Operacion
{
    public Resta(double X, double Y)
    {
        super(X, Y);
    }

    public void restar()
    {
        resultado = x - y;
    }
}
