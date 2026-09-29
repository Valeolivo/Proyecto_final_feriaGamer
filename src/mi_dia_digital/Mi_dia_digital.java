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
        int edad, anio, mes, dia, horaI, minutos, diaDDmes, horaMILITAR;
        double horasR;
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("|           MI DIA DIGITAL :D               |");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad < 1 || edad > 100) {
            System.out.println("Error. Ingrese una edad válida.");
            return;
        }
        System.out.println("Año de ingreso: ");
        anio = sc.nextInt();
        if (anio < 2026) {
            System.out.println("Error. Ingresa el año actual.");
            return;
        }
        System.out.println("Mes de ingreso(1-12): ");
        mes = sc.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Error. Ingresa un mes valido.");
            return;
        }
        System.out.println("Dia de ingreso: ");
        dia = sc.nextInt();
        if (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                diaDDmes = 29;
            } else {
                diaDDmes = 28;
            }
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diaDDmes = 30;
            } else {
                diaDDmes = 31;
            }
            if (dia < 1 || dia > diaDDmes) {
                System.out.println("Error. Ingresa un dia valido");
                return;
            }
        }
        System.out.println("Hora de ingreso(1-12): ");
        horaI = sc.nextInt();
        if (horaI > 1 || horaI < 12) {
            System.out.println("Error. Ingresa una hora valida.");
            return;
        }
        System.out.println("Minuto de ingreso(0-59): ");
        minutos = sc.nextInt();
        if (minutos < 0 || minutos > 59) {
            System.out.println("Error. Ingresa una hora valida.");
            return;
        }

        System.out.println("Cantidad de horas que utilizará las redes sociales: ");
        horasR = sc.nextDouble();
        if (horasR<0){
            System.out.println("Error. Ingrese un dato valido.");
            return;
        }
        System.out.println("Ingrese su franja horaria de ingreso (AM/PM) ");
        franjaH = sc.next();
        if (franjaH.equals("AM")) {
            if (horaI == 12) {
                horaMILITAR = 0;
            } else {
                horaMILITAR = horaI;
            }
        } else {
            if (horaI == 12) {
                horaMILITAR = 12;
            } else {
                horaMILITAR = horaI + 12;
            }
        }
        int segundosI = horaMILITAR * 3600 + minutos * 60;
        int segundos_Redes = (int) Math.round(horasR * 3600);
        int segundos_salida = (segundosI + segundos_Redes + 1) % 86400;

        int hora_salida = segundos_salida / 3600;
        int minutos_salida = (segundos_salida % 3600) / 60;
        int segundos_restantes = segundos_salida % 60;

        String horaMILITAR_ingreso = String.format("%02d:%02d:00", horaMILITAR, minutos);
        String horaMILITAR_salida = String.format("%02d:%02d:%02d", hora_salida, minutos_salida, segundos_restantes);

        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("|       PUNTAJE DE RIESGO    |");
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.");

        int puntaje = 0;
        if (horasR > 3 && horasR < 8) {
            puntaje += 4;
        } else {
            if (horasR >= 8) {
                puntaje += 7;
            }
        }
        boolean ingreso_fueraH = horaMILITAR < 8 || horaMILITAR >= 20;
        boolean salida_fueraH = hora_salida < 8 || hora_salida >= 20;
        if (ingreso_fueraH || salida_fueraH) {
            puntaje += 4;
        }
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("|     Contenido consumido   |");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("1. Contenido educativo");
        System.out.println("2. Noticias verificadas");
        System.out.println("3. Entretenimiento");
        System.out.println("4. Noticias falsas");
        System.out.println("5. Contenido violento");
        System.out.println("6. Información engañosa");

        System.out.println("Cual fue el mayor contenido consumido? \nElige teniendo en cuenta el menu de opciones");
        int contenido1 = sc.nextInt();
        switch (contenido1) {
            case 1:
                puntaje += 0;
                break;
            case 2:
                puntaje += 0;
                break;
            case 3:
                puntaje += 2;
                break;
            case 4:
                puntaje += 4;
                break;
            case 5:
                puntaje += 4;
                break;
            case 6:
                puntaje += 5;
                break;
            default:
                System.out.print("Opcion no valida. \nIntentalo de nuevo.");
        }
        System.out.println("Cual fue el segundo mayor contenido consumido? \nElige teniendo en cuenta el menu de opciones");
        int contenido2 = sc.nextInt();
        switch (contenido1) {
            case 1:
                puntaje += 0;
                break;
            case 2:
                puntaje += 0;
                break;
            case 3:
                puntaje += 2;
                break;
            case 4:
                puntaje += 4;
                break;
            case 5:
                puntaje += 4;
                break;
            case 6:
                puntaje += 5;
                break;
            default:
                System.out.print("Opcion no valida. \nIntentalo de nuevo.");
        }
    }
}

