import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main 
{
    public static void main(String[] args)
    {
        Concierto concierto = new Concierto();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int correlativo = 0;
        String nombre = "";
        String email = "";
        int cantidad = 7;
        int presupuesto = 0;
        String ticket = "";
        int localidad = 0;
        int nuevaCapacidad = 0;
        int boletos1 = 0;
        int boletos2 = 0;
        int boletos3 = 0;
        int dispLocal = 0;
        int dinero1 = 0;
        int dinero2 = 0;
        int dinero3 = 0;
    
        System.out.println("\nIngrese la capacidad del teatro donde se hará el concierto: ");
        int capacidad = teclado.nextInt();
        concierto.setCapLocalidades(capacidad);
        
        while (opcion != 5) 
        {
            System.out.println("\nMENU\n" +
            "1. Comprar boletos\n" +
            "2. Consultar disponibilidad total\n" +
            "3. Consultar disponibilidad por localidad\n" +
            "4. Mostrar reporte de caja\n" +
            "5. Salir\n" +		
            "Seleccione el número de la opción deseada:\n");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion)
            {
                case 1:
                    Compra compra = new Compra();
                    correlativo++;	
                    Date hoy = new Date();
                    String fecha = new SimpleDateFormat("ddMMyyyy").format(hoy);
                    ticket = fecha + Integer.toString(correlativo);
                    System.out.println("\nIngrese su nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("\nIngrese su correo eléctronico:");
                    email = teclado.nextLine();
                    cantidad = 7;
                    while (cantidad > 6)
                    {
                        System.out.println("\nIngrese el número de la cantidad de boletos que desea comprar (máximo 6):");
                        cantidad = teclado.nextInt();
                        teclado.nextLine();
                        if (cantidad > 6)
                        {
                            System.out.println("La cantidad de boletos debe ser menor o igual a 6.");
                        }
                    }
                    System.out.println("\nIngrese su presupuesto máximo para la compra:");
                    presupuesto = teclado.nextInt();
                    teclado.nextLine();
                    compra.setFecha(hoy);
                    compra.setNombre(nombre);
                    compra.setEmail(email);
                    compra.setCantidad(cantidad);
                    compra.setPresupuesto(presupuesto);
                    compra.setCorrelativo(correlativo);
                    compra.setTicket(ticket);

                    System.out.println("\nLOCALIDAD\n" +
                    "1. Balcón 2 (Q300 por ticket)\n" +
                    "2. Platea (Q600 por ticket)\n" +
                    "3. Balcón 1 (Q1800 por ticket)\n" +
                    "Seleccione el número de la localidad donde desea comprar sus boletos:\n");
                    localidad = teclado.nextInt();
                    teclado.nextLine();
                    switch (localidad)
                    {
                        case 1:
                            if ((concierto.getLocalidades(localidad).getPrecio() * cantidad) > compra.getPresupuesto())
                            {
                                System.out.println("\nNo tiene presupuesto suficiente para comprar en el balcón 2.");
                                break;
                            }
                            if (concierto.dispIndividual(localidad) == 0)
                            {
                                System.out.println("\nNo hay boletos disponibles en el balcón 2.");
                                break;
                            }
                            else
                                for (int i = 0; i < cantidad; i++) 
                                {
                                    if (compra.getCantidad() - i <= concierto.dispIndividual(localidad))
                                    {
                                        System.out.println("Por disponibilidad en el balcón 2, se han comprado " + (cantidad - i) + " boletos.");
                                        compra.setCantidad(cantidad - i);
                                        nuevaCapacidad = concierto.getLocalidades(localidad).getCapacidadActual() + (cantidad - i);
                                        concierto.getLocalidades(localidad).setCapacidadActual(nuevaCapacidad);
                                        break;
                                    }
                                }
                            break;
                        case 2:
                            if ((concierto.getLocalidades(localidad).getPrecio() * cantidad) > compra.getPresupuesto())
                            {
                                System.out.println("No tiene presupuesto suficiente para comprar en platea.");
                                break;
                            }
                            if (concierto.dispIndividual(localidad) == 0)
                            {
                                System.out.println("No hay boletos disponibles en platea");
                                break;
                            }
                            else
                                for (int i = 0; i < cantidad; i++) 
                                {
                                    if (compra.getCantidad() - i <= concierto.dispIndividual(localidad))
                                    {
                                        System.out.println("Por disponibilidad en platea, se han comprado " + (cantidad - i) + " boletos.");
                                        compra.setCantidad(cantidad - i);
                                        nuevaCapacidad = concierto.getLocalidades(localidad).getCapacidadActual() + (cantidad - i);
                                        concierto.getLocalidades(localidad).setCapacidadActual(nuevaCapacidad);
                                        break;
                                    }
                                }
                            break;
                        case 3:
                            if ((concierto.getLocalidades(localidad).getPrecio() * cantidad) > compra.getPresupuesto())
                            {
                                System.out.println("No tiene presupuesto suficiente para comprar en el balcón 1.");
                                break;
                            }
                            if (concierto.dispIndividual(localidad) == 0)
                            {
                                System.out.println("No hay boletos disponibles en el balcón 1.");
                                break;
                            }
                            else
                                for (int i = 0; i < cantidad; i++) 
                                {
                                    if (compra.getCantidad() - i <= concierto.dispIndividual(localidad))
                                    {
                                        System.out.println("Por disponibilidad en el balcón 1, se han comprado " + (cantidad - i) + " boletos.");
                                        compra.setCantidad(cantidad - i);
                                        nuevaCapacidad = concierto.getLocalidades(localidad).getCapacidadActual() + (cantidad - i);
                                        concierto.getLocalidades(localidad).setCapacidadActual(nuevaCapacidad);
                                        break;
                                    }
                                }
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            break;       
                    }
                    break;
                case 2:
                    boletos1 = concierto.getLocalidades(1).getCapacidadActual();
                    boletos2 = concierto.getLocalidades(2).getCapacidadActual();
                    boletos3 = concierto.getLocalidades(3).getCapacidadActual();
                    System.out.println("\nSe han vendido " + boletos1 + " boletos en el balcón 2, " + boletos2 + " en platea y " + boletos3 + " en el balcón 1");
                    System.out.println("\nDisponibilidad total: " + concierto.dispTotal());
                    break;
                case 3:
                    System.out.println("\nDisponibilidad por localidad\n" +
                    "1. Balcón 2\n" +
                    "2. Platea\n" +
                    "3. Balcón 1\n" +
                    "Seleccione el número de la localidad para ver la disponibilidad:\n");
                    dispLocal = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("\nEn esta localidad hay " + concierto.dispIndividual(dispLocal) + " boletos disponibles.");
                    break;
                case 4:
                    dinero1 = concierto.getLocalidades(1).getCapacidadActual() * concierto.getLocalidades(1).getPrecio();
                    dinero2 = concierto.getLocalidades(2).getCapacidadActual() * concierto.getLocalidades(2).getPrecio();
                    dinero3 = concierto.getLocalidades(3).getCapacidadActual() * concierto.getLocalidades(3).getPrecio();
                    System.out.println("\nDinero genereado por las 3 localidades: $" + (dinero1 + dinero2 + dinero3));
                    break;
                case 5:
                    System.out.println("\nGracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("\nOpción inválida.");
                    break;
            } 
        }
        teclado.close();
    }
}
