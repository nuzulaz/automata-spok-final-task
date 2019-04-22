/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajaltba;

import java.util.Scanner;

/**
 *
 * @author nuzul
 */
public class JajalTBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         SPOKcek x = new SPOKcek();
         int idx =0;
         String tmp = "";
         System.out.println("Masukan Kalimat : ");
         String input = s.nextLine();
         String[] Split = input.split(" ");
         for (String str : Split) {
             idx++;
         }
         if(idx == 1 || idx == 0) System.out.println("Error");
         else if(idx == 2){
            char[] c_arr = Split[0].toCharArray();
            char[] c_arrPre = Split[1].toCharArray();
            if(x.getSubjek(c_arr, Split[0].length()) && x.getPredikat(c_arrPre, Split[1].length())){
                System.out.println("S P");
                tmp += "SP";
            }else{
                System.out.println("Error");
                tmp += "Error";
            }
         }else if(idx == 3){
            char[] c_arr = Split[0].toCharArray();
            char[] c_arrPre = Split[1].toCharArray();
            char[] c_arrObj = Split[2].toCharArray(); 
            if(x.getSubjek(c_arr, Split[0].length()) && x.getPredikat(c_arrPre, Split[1].length()) && x.getObject(c_arrObj, Split[2].length())){
                System.out.println("S P 0");
                tmp += "SPO";
            }else if(x.getSubjek(c_arr, Split[0].length()) && x.getPredikat(c_arrPre, Split[1].length()) && x.getKeterangan(c_arrObj, Split[2].length())){
                System.out.println("S P K");
                tmp += "SPK";
            }else{
                System.out.println("Error");
                tmp += "Error";
            }
         }else if(idx ==4){
            char[] c_arr = Split[0].toCharArray();
            char[] c_arrPre = Split[1].toCharArray();
            char[] c_arrObj = Split[2].toCharArray();
            char[] c_arrKet = Split[3].toCharArray();
            if(x.getSubjek(c_arr, Split[0].length()) && x.getPredikat(c_arrPre, Split[1].length()) && x.getObject(c_arrObj, Split[2].length()) && x.getKeterangan(c_arrKet, Split[3].length())){
                System.out.println("S P 0 K");
                tmp += "SPOK";
            }else{
                System.out.println("Error");
                tmp += "Error";
            }
         }
         
         System.out.println("------------------");
         
         if(x.SPOKpda(tmp)){
             System.out.println("Data Valid");
         }else{
             System.out.println("Data Tidak Valid");
         }
         
    }
}