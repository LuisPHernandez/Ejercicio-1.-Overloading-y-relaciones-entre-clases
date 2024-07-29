public class Concierto 
{
    //Atributos
    private Localidad balcon2;
    private Localidad platea;
    private Localidad balcon1;

    //Métodos
    public Concierto()
    {
        balcon2 = new Localidad();
        platea = new Localidad();
        balcon1 = new Localidad();
    }
    public void setCapLocalidades(int Cap)
    {
        for (int i = 0; i <= 3; i++)
        {
            if ((Cap - i) % 3 == 0)
            {
                balcon2.setCapacidadTotal((Cap - i) / 3);
                platea.setCapacidadTotal((Cap - i) / 3);
                balcon1.setCapacidadTotal(((Cap - i) / 3) + i);
                break;
            }
        }
        balcon2.setNombre("Balcón 2");
        platea.setNombre("Platea");
        balcon1.setNombre("Balcón 1");
        balcon2.setPrecio(300);
        platea.setPrecio(600);
        balcon1.setPrecio(1800);
    }
    public Localidad getLocalidades(int Cual)
    {
        switch (Cual)
        {
            case 1:
                return balcon2;
            case 2:
                return platea;
            case 3:
                return balcon1;
            default:
                return null;
        }
    }

    public int dispTotal()
    {
        int disp1 = balcon2.getCapacidadTotal() - balcon2.getCapacidadActual();
        int disp2 = platea.getCapacidadTotal() - platea.getCapacidadActual();
        int disp3 = balcon1.getCapacidadTotal() - balcon1.getCapacidadActual();
        return disp1 + disp2 + disp3;
    }

    public int dispIndividual(int Cual)
    {
        switch (Cual)
        {
            case 1:
                return balcon2.getCapacidadTotal() - balcon2.getCapacidadActual();
            case 2:
                return platea.getCapacidadTotal() - platea.getCapacidadActual();
            case 3:
                return balcon1.getCapacidadTotal() - balcon1.getCapacidadActual();
            default:
                return -1;
        }
    }

    public int reporte()
    {
        int dinero1 = balcon2.getPrecio() * balcon2.getCapacidadActual();
        int dinero2 = platea.getPrecio() * platea.getCapacidadActual();
        int dinero3 = balcon1.getPrecio() * balcon1.getCapacidadActual();
        return dinero1 + dinero2 + dinero3;
    }
}
