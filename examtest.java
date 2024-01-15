/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author THIDEN
 */
public class Mavenproject2 {

    public static void main(String[] args) {
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date(YYYY-MM-DD): ");
        String date = scanner.nextLine();

        String[] dataSplited = date.split("-", 3);

        switch(dataSplited[1]){
            case "01":
                    System.out.println(dataSplited[0] + " January " + dataSplited[2]);
                break;
            case "02":
                System.out.println(dataSplited[0] + " February " + dataSplited[2]);
                break;
            case "03":
                System.out.println(dataSplited[0] + " March " + dataSplited[2]);
                break;
            case "04":
                System.out.println(dataSplited[0] + " April " + dataSplited[2]);
                break;
            case "05":
                System.out.println(dataSplited[0] + " May " + dataSplited[2]);
                break;
            case "06":
                System.out.println(dataSplited[0] + " June " + dataSplited[2]);
                break;
            case "07":
                System.out.println(dataSplited[0] + " July " + dataSplited[2]);
                break;
            case "08":
                System.out.println(dataSplited[0] + " August " + dataSplited[2]);
                break;
            case "09":
                System.out.println(dataSplited[0] + " September " + dataSplited[2]);
                break;
            case "10":
                System.out.println(dataSplited[0] + " October " + dataSplited[2]);
                break;
            case "11":
                System.out.println(dataSplited[0] + " November " + dataSplited[2]);
                break;
            case "12":
                System.out.println(dataSplited[0] + " December " + dataSplited[2]);
                break;
        }
    }
}
    }
}
