public class Localidad 
{
    //Atributos
    private String nombre;
    private int precio;
    private int capacidadTotal;
    private int capacidadActual;

    //Métodos
    public Localidad()
    {
        this.nombre = "";
        this.precio = 0;
        this.capacidadTotal = 0;
        this.capacidadActual = 0;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getPrecio() 
    {
        return precio;
    }

    public void setPrecio(int precio) 
    {
        this.precio = precio;
    }

    public int getCapacidadTotal() 
    {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) 
    {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() 
    {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) 
    {
        this.capacidadActual = capacidadActual;
    }

    public String toString() 
    {
        return "nombre='" + nombre + '\'' + ", precio=" + precio +
        ", capacidadTotal=" + capacidadTotal +  ", capacidadActual=" + capacidadActual;
    }
    
}
