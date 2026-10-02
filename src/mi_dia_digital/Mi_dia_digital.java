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
        int edad, año, mes, dia, horaI, minutos, diaDDmes, horaMILITAR;
        double horasR;
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("|           MI DÍA DIGITAL :D               |");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.\n");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad < 1 || edad > 100) {
            System.out.println("Error. Ingrese una edad válida.");
        } else {
            System.out.println("Año de ingreso: ");
            año = sc.nextInt();
            if (año != 2026) {
                System.out.println("Error. Ingresa el año actual");
            } else {
                System.out.println("Mes de ingreso(1-12): ");
                mes = sc.nextInt();
                if (mes < 1 || mes > 12) {
                    System.out.println("Error. Ingresa un mes válido.");
                } else {
                    System.out.println("Día de ingreso: ");
                    dia = sc.nextInt();
                    if (mes == 2) {
                        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
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
                    }
                    if (dia < 1 || dia > diaDDmes) {
                        System.out.println("Error. Ingresa un día válido.");
                    } else {
                        System.out.println("Hora de ingreso(1-12): ");
                        horaI = sc.nextInt();
                        if (horaI < 1 || horaI > 12) {
                            System.out.println("Error. Ingresa una hora válida.");
                        } else {
                            System.out.println("Minuto de ingreso(0-59)");
                            minutos = sc.nextInt();
                            if (minutos < 0 || minutos > 59) {
                                System.out.println("Error. Ingresa un minuto válido.");
                            } else {
                                System.out.println("Cantidad de horas que utilizará las redes sociales: ");
                                horasR = sc.nextDouble();
                                if (horasR < 0) {
                                    System.out.println("Error. Ingresa un dato válido.");
                                } else {
                                    System.out.println("Ingrese su franja horaria de ingreso (AM/M/PM) ");
                                    franjaH = sc.next();
                                    franjaH = franjaH.toLowerCase();
                                    if (franjaH.equals("am")) {
                                        if (horaI == 12) {
                                            horaMILITAR = 0;
                                        } else {
                                            horaMILITAR = horaI;
                                        }
                                    } else {
                                        if (franjaH.equals("m")) {
                                            if (horaI != 12) {
                                                System.out.println("Error. La hora ingresada no corresponde al mediodía.");
                                            } else {
                                                if (minutos != 0) {
                                                    System.out.println("El medio dia corresponde a las 12:00M\nLos minutos deben ser 0.");
                                                } else {
                                                    horaMILITAR = horaI;
                                                }
                                            }
                                        } else {
                                            if (franjaH.equals("pm")) {
                                                if (horaI == 12) {
                                                    horaMILITAR = horaI;
                                                } else {
                                                    horaMILITAR = horaI + 12;
                                                }
                                            } else {
                                                System.out.println("Ingrese una franja de horario válida(AM/M/PM)");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
