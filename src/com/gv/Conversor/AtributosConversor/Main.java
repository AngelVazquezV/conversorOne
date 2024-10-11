package com.gv.Conversor.AtributosConversor;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String menu = """ 
                         Enter the conversion option you want to perform:
                         1 Dollar to brazilian real
                         2 Dollar to argentine peso
                         3 Dollar to colombian peso
                         4 Brazilian real to dollar
                         5 Brazilian real to argentine peso
                         6 Brazilian real to colombian peso
                         7 Argentine peso to dollar
                         8 Argentine peso to brazilian real
                         9 Argentine peso to colombian peso
                         10 Colombian peso to dollar
                         11 Colombian peso to brazilian real
                         12 Colombian peso to argentine peso
                         13 view conversion history
                         14 exit the program
                         """;

        System.out.println("welcome to currency converter1");
        System.out.println(menu);

        Principal principal = new Principal();

        while(true) {
            try {
                Scanner lectura = new Scanner(System.in);
                int opcion = lectura.nextInt();
                while (opcion != 14) {

                    switch (opcion) {
                        case 1:
                            System.out.println("enter the amount of dollars you want to convert to brazilian real");
                            principal.setIso1("USD");
                            principal.setIso2("BRL");
                            principal.setMoneda1(" dollar(s)");
                            principal.setMoneda2(" brazilian real");
                            principal.showCases();
                        break;

                        case 2:
                            System.out.println("enter the amount of dollars you want to convert to argentine peso");
                            principal.setIso1("USD");
                            principal.setIso2("ARS");
                            principal.setMoneda1(" dollar(s)");
                            principal.setMoneda2(" argentine peso(s)");
                            principal.showCases();
                        break;

                        case 3:
                            System.out.println("enter the amount of dollars you want to convert to colombian pesos");
                            principal.setIso1("USD");
                            principal.setIso2("COP");
                            principal.setMoneda1(" dollar(s)");
                            principal.setMoneda2(" colombian peso(s)");
                            principal.showCases();
                        break;

                        case 4:
                            System.out.println("enter the amount of brazilian real you want to convert to dollars");
                            principal.setIso1("BRL");
                            principal.setIso2("USD");
                            principal.setMoneda1(" brazilian real(s)");
                            principal.setMoneda2(" dollar(s)");
                            principal.showCases();
                        break;

                        case 5:
                            System.out.println("enter the amount of brazilian real you want to convert to argentine pesos");
                            principal.setIso1("BRL");
                            principal.setIso2("ARS");
                            principal.setMoneda1(" brazilian real(s)");
                            principal.setMoneda2(" argentine peso(s)");
                            principal.showCases();
                        break;

                        case 6:
                            System.out.println("enter the amount of brazilian real you want to convert to colombian pesos");
                            principal.setIso1("BRL");
                            principal.setIso2("COP");
                            principal.setMoneda1(" brazilian real(s)");
                            principal.setMoneda2(" colombian peso(s)");
                            principal.showCases();
                        break;

                        case 7:
                            System.out.println("enter the amount of argentine pesos you want to convert to dollars");
                            principal.setIso1("ARS");
                            principal.setIso2("USD");
                            principal.setMoneda1(" argentine peso(s)");
                            principal.setMoneda2(" dollar(s)");
                            principal.showCases();
                        break;

                        case 8:
                            System.out.println("enter the amount of argentine pesos you want to convert to brazilian real");
                            principal.setIso1("ARS");
                            principal.setIso2("BRL");
                            principal.setMoneda1(" argentine peso(s)");
                            principal.setMoneda2(" brazilian real(s)");
                            principal.showCases();
                        break;

                        case 9:
                            System.out.println("enter the amount of argentine pesos you want to convert to colombian pesos");
                            principal.setIso1("ARS");
                            principal.setIso2("COP");
                            principal.setMoneda1(" argentine peso(s)");
                            principal.setMoneda2(" colombian peso(s)");
                            principal.showCases();
                        break;

                        case 10:
                            System.out.println("enter the amount of colombian pesos you want to convert to dollars");
                            principal.setIso1("COP");
                            principal.setIso2("USD");
                            principal.setMoneda1(" colombian peso(s)");
                            principal.setMoneda2(" dollar(s)");
                            principal.showCases();
                        break;

                        case 11:
                            System.out.println("enter the amount of colombian pesos you want to convert to brazilian real");
                            principal.setIso1("COP");
                            principal.setIso2("BRL");
                            principal.setMoneda1(" colombian peso(s)");
                            principal.setMoneda2(" brazilian real(s)");
                            principal.showCases();
                        break;

                        case 12:
                            System.out.println("enter the amount of colombian pesos you want to convert to argentine peso");
                            principal.setIso1("COP");
                            principal.setIso2("ARS");
                            principal.setMoneda1(" colombian peso(s)");
                            principal.setMoneda2(" argentine peso(s)");
                            principal.showCases();
                        break;

                        case 13:
                            System.out.println("you have done the following operations: ");
                            principal.showHistory();
                            System.out.println("*******************************");
                        break;

                        default:  System.out.println("invalid option, please enter an option from 1 to 14");
                        System.out.println("********************************");
                    } //cierre switch

                    System.out.println(menu);
                    opcion = lectura.nextInt();
                } //cierre while opcion different 13

                    System.out.println("you performed the following operations in this session: ");
                    principal.showHistory();
                    System.out.println("leaving the program. Stay tuned for new updates");
                    System.out.println("made by Ángel Vázquez");

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Enter only numbers from 1 to 14, please");
                System.out.println(e.getMessage());
                System.out.println("********************************");
                System.out.println(menu);
            }
        }
    } //cierre public static
} //cierre main











