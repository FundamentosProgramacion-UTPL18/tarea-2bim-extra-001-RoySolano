/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = {"Agosto","Octubre","Diciembre"};
        String [] sucursales = {"sucursal 1","sucursal 2","sucursal 3","sucursal 4"};
        double [] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};
        double [] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};
        double [] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};
        double [] venta_total_sucursal = new double[4];
        double [] venta_promedio_sucursal = new double[4];
        
        double total;//variable del total de ventas de cada sucursal
        double suma_total = 0;// variable acumuladora de los totales de ventas de cada sucursal
        double promedio;// variable del promedio de ventas de cada sucursal
        String cadenafinal;// cadena que almacena el reporte de ventas
        String vacio = "";// espacio vacío
        
        for (int contador = 0; contador < sucursales.length; contador++){//ciclo para las operaciones de suma y promedio
            total = ventas_mes_1[contador]+ventas_mes_2[contador]+ventas_mes_3[contador];//cálculo del total de ventas
            suma_total = suma_total+total;//uso de la variable acumuladora
            venta_total_sucursal[contador] = total;//insertación de los totales en el respectivo arreglo
            promedio = (ventas_mes_1[contador]+ventas_mes_2[contador]+ventas_mes_3[contador])/3;
            venta_promedio_sucursal[contador] = promedio;//insertación de los promedios en el respectivo arreglo
        }
        System.out.printf("%s\n\n","Reporte");
        cadenafinal = String.format("%-15s",vacio);//colocación de un espacio vacío
        for (int contador = 0; contador < meses.length; contador++){//ciclo para colocar los mese como encabezados en el reporte final
            cadenafinal = String.format("%s%-15s", cadenafinal,meses[contador]);    
        }
        cadenafinal = String.format("%s%-15s%-15s\n\n", cadenafinal,"Total","Promedio");//colocación de total y promedio como encabezados
        for(int contador = 0; contador < sucursales.length; contador++){//ciclo para ordenar los resultados en la cadena final
            cadenafinal = String.format("%s%-15s%-15.2f%-15.2f%-15.2f%-15.2f%-15.2f\n", cadenafinal, sucursales[contador], ventas_mes_1[contador], ventas_mes_2[contador], ventas_mes_3[contador], venta_total_sucursal[contador], venta_promedio_sucursal[contador]);
        }
        System.out.println (cadenafinal);//presentación del reporte final
        System.out.printf("%s%.2f\n", "Totales de ventas de todas la sucursales es: ", suma_total);
    }
    
}
