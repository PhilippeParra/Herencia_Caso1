package clases;

public class Division extends Operacion
{
    public Division(double X, double Y)
    {
        super(X, Y);
    }

    public void dividir1()
    {
        if(y == 0)
        {
            resultado = x / y;
        }
        
    }

    public void dividir2()
    {
        if(x == 0)
        {
            resultado = y / x;
        }
    }
}
