/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mi_dia_digital;

import java.util.Scanner;

/**
 *
 * @author olivo
 */
public class Mi_dia_digital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, franjaH;
        int edad, anio, mes, dia, horaI, minutos;
        double horasR;
        System.out.println("=========================================");
        System.out.println("           MI DIA DIGITAL :D");
        System.out.println("=========================================\n");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Anio: ");
        anio = sc.nextInt();
        System.out.println("Mes(1-12): ");
        mes = sc.nextInt();
        System.out.println("Dia: ");
        dia = sc.nextInt();
        System.out.println("Hora de ingreso(1-12): ");
        horaI = sc.nextInt();
        System.out.println("Minuto de ingreso(0-59): ");
        minutos = sc.nextInt();
        System.out.println("Ingrese su franja horaria de ingreso (AM/PM) ");
        franjaH = sc.next().toUpperCase();
        System.out.println("Horas de uso en redes sociales: ");
        horasR = sc.nextDouble();
        boolean edadV = edad > 0 && edad < 115;
        boolean mesV = mes > 0 && mes <= 12;
        boolean anioBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        int diaDDmes;
        if (mes==2){
            if (anioBisiesto){
                diaDDmes = 29;
            }else{
                diaDDmes = 28;
            }
        }else{
            if(mes==4 || mes==6 || mes==9 || mes==11){
                diaDDmes = 30;
            }else{
                diaDDmes = 31;
            }
        }
        boolean diaV = mesV && dia >=1 && dia<= diaDDmes;
        boolean horaVingreso = horaI >= 1 && horaI<= 12;
        boolean minutoV = minutos >= 0 && minutos <= 59;
        boolean franjaHV = franjaH.equals("AM") || franjaH.equals("PM");
        boolean horasRV = horasR > 0 && horasR <= 24;
        
        boolean validando = edadV && diaV && mesV && horaVingreso && minutoV && franjaHV && horasRV;
        if (!validando){
            System.out.print("Error. uno o más datos ingresados no son validos.\n¡Intentalo de nuevo!:D");
        }else{
            int horaMILITAR;
            if (franjaH.equals("AM")){
                if (horaI == 12){
                    horaMILITAR = 0;
                }else{
                    horaMILITAR = horaI;
                }
            }else{
                if (horaI == 12){
                    horaMILITAR = 12;
                }else{
                    horaMILITAR = horaI + 12;
                }
            }
        }
    }
}
