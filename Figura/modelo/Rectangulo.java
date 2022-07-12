package modelo;

public class Rectangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
   


    public double getBase() 
    {
        return base;
    }

    public void setBase(double base) 
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura)
     {
        this.altura = altura;
    }


    public void calcularAreaPerimetro(double base, double altura) 
    {
        area = base * altura;
        perimetro = 2 * (base + altura);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
     {
        return "area=" + area + "\nPerimetro: " + perimetro;
    }
    
}

