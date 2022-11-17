package clases;

public class Operacion
{
    // Atrbutos 
    protected double x;
    protected double y;
    protected double resultado;

    public Operacion(double X, double Y)
    {
        this.x = X;
        this.y = Y;
        this.resultado = 0;
    }

    public double mostrarResultado()
    {
        return this.resultado;
    }
}



