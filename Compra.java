import java.util.Date;

public class Compra
{
    //Atributos
    private String nombre;
    private String email;
    private int cantidad;
    private int presupuesto;
    private Date fecha;
    private int correlativo;
    private String ticket;

    //Métodos
    public Compra()
    {
        this.nombre = "";
        this.email = "";
        this.cantidad = 0;
        this.presupuesto = 0;
        this.fecha = new Date();
        this.correlativo = 0;
        this.ticket = "";
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public void setCantidad(int cantidad) 
    {
        this.cantidad = cantidad;
    }

    public int getPresupuesto() 
    {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) 
    {
        this.presupuesto = presupuesto;
    }

    public Date getFecha() 
    {
        return fecha;
    }

    public void setFecha(Date fecha) 
    {
        this.fecha = fecha;
    }

    public int getCorrelativo()
    {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) 
    {
        this.correlativo = correlativo;
    }

    public String getTicket() 
    {
        return ticket;
    }

    public void setTicket(String ticket) 
    {
        this.ticket = ticket;
    }
    
    public String toString() 
    {
        return "nombre=" + nombre + ", email=" + email + 
        ", cantidad=" + cantidad + ", presupuesto=" + presupuesto +
        ", fecha=" + fecha + ", correlativo=" + correlativo;
    }
}