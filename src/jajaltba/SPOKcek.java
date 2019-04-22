/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajaltba;
import java.util.Stack;
/**
 *
 * @author nuzul
 */
public class SPOKcek {

    public SPOKcek() {
    }
    
    public boolean getSubjek(char[] c_arr,int x){
                boolean cek = false;
                for (int j = 0; j < x; j++) {
                    if(c_arr[j] == 'A'){
                       if(x== 4){    
                           if(c_arr[j+1] == 'z' && c_arr[j+2] == 'm' && c_arr[j+3] == 'i') cek = true;
                       }
                    }
                    else if(c_arr[j] == 'I'){
                       if(x == 5){
                           if(c_arr[j+1] == 'n' && c_arr[j+2] == 't' && c_arr[j+3] == 'a' && c_arr[j+4] == 'n') cek = true;
                       }
                    }else if(c_arr[j] == 'W'){
                       if(x == 7){
                           if(c_arr[j+1] == 'a' && c_arr[j+2] == 's' && c_arr[j+3] == 'k' && c_arr[j+4] == 'i'&& c_arr[j+5] == 't' && c_arr[j+6] == 'a') cek = true;
                       }
                    }else if(c_arr[j] == 'K'){
                        if(x == 6){
                           if(c_arr[j+1] == 'h' && c_arr[j+2] == 'a' && c_arr[j+3] == 'r' && c_arr[j+4] == 'i'&& c_arr[j+5] == 's') cek = true;
                        }
                    }else if(c_arr[j] == 'R'){
                        if(x == 5){
                           if(c_arr[j+1] == 'o' && c_arr[j+2] == 's' && c_arr[j+3] == 's'&& c_arr[j+4] == 'i') cek = true;
                        }
                    }
                }
                return cek;
    }
    
    public boolean getPredikat(char[] c_arrPre, int x){
         boolean cek = false;
         for (int j = 0; j < x; j++) {
            if(c_arrPre[j] == 'M'){
                 if(x== 7){
                     if((c_arrPre[j+1] == 'e' && c_arrPre[j+2] == 'm' && c_arrPre[j+3] == 'b' && c_arrPre[j+4] == 'a' && c_arrPre[j+5] == 'c' && c_arrPre[j+6] == 'a') || (c_arrPre[j+1] == 'e' && c_arrPre[j+2] == 'n' && c_arrPre[j+3] == 'u' && c_arrPre[j+4] == 'l' && c_arrPre[j+5] == 'i' && c_arrPre[j+6] == 's')) cek = true; 
                 }else if(x == 12){
                        if(c_arrPre[j+1] == 'e' && c_arrPre[j+2] == 'n' && c_arrPre[j+3] == 'd' && c_arrPre[j+4] == 'e' && c_arrPre[j+5] == 'n' && c_arrPre[j+6] == 'g' && c_arrPre[j+7] == 'a' && c_arrPre[j+8] == 'r' && c_arrPre[j+9] == 'k' && c_arrPre[j+10] == 'a' && c_arrPre[j+11] == 'n') cek = true;
                 }else if(x == 11){
                        if(c_arrPre[j+1] == 'e' && c_arrPre[j+2] == 'n' && c_arrPre[j+3] == 'j' && c_arrPre[j+4] == 'e' && c_arrPre[j+5] == 'l' && c_arrPre[j+6] == 'a' && c_arrPre[j+7] == 's' && c_arrPre[j+8] == 'k' && c_arrPre[j+9] == 'a' && c_arrPre[j+10] == 'n') cek = true; 
                        else if(c_arrPre[j+1] == 'e' && c_arrPre[j+2] == 'n' && c_arrPre[j+3] == 'g' && c_arrPre[j+4] == 'e' && c_arrPre[j+5] == 'n' && c_arrPre[j+6] == 'd' && c_arrPre[j+7] == 'a' && c_arrPre[j+8] == 'r' && c_arrPre[j+9] == 'a' && c_arrPre[j+10] == 'i') cek = true;
                 }
            }
         }
         return cek;
    }
    
    public boolean getObject(char[] c_arrObj, int x){
         boolean cek = false;
         for (int j = 0; j < x ; j++) {
            if(c_arrObj[j] == 'B'){
                if(x== 4){
                    if(c_arrObj[j+1] == 'u' && c_arrObj[j+2] == 'k' && c_arrObj[j+3] == 'u') cek = true;
                }
            }else if(c_arrObj[j] == 'T'){
                if(x == 5){
                    if(c_arrObj[j+1] == 'u' && c_arrObj[j+2] == 'b' && c_arrObj[j+3] == 'e' && c_arrObj[j+4] == 's') cek = true;
                }
            }else if(c_arrObj[j] == 'L'){
                if(x == 4){
                    if(c_arrObj[j+1] == 'a' && c_arrObj[j+2] == 'g' && c_arrObj[j+3] == 'u') cek = true;
                }
            }else if(c_arrObj[j] == 'P'){
                if(x == 5){
                    if(c_arrObj[j+1] == 'u' && c_arrObj[j+2] == 'i' && c_arrObj[j+3] == 's' && c_arrObj[j+4] == 'i') cek = true;
                }
            }else if(c_arrObj[j] == 'M'){
                if(x == 5){
                    if(c_arrObj[j+1] == 'o' && c_arrObj[j+2] == 't' && c_arrObj[j+3] == 'o' && c_arrObj[j+4] == 'r') cek = true;
                }
                
            }
         }
         return cek;
    }
    
    public boolean getKeterangan(char[] c_arrKet, int x){
        boolean cek = false;
        for (int i = 0; i < x; i++) {
            if(c_arrKet[i] == 'N'){
                if(x == 5){
                    if(c_arrKet[i+1] == 'o' && c_arrKet[i+2] == 'v' && c_arrKet[i+3] == 'e' && c_arrKet[i+4] == 'l') cek = true;
                    else if(c_arrKet[i+1] == 'i' && c_arrKet[i+2] == 'n' && c_arrKet[i+3] == 'j' && c_arrKet[i+4] == 'a') cek = true;
                }
            }
            if(c_arrKet[i] == 'B'){
                if(x==6){
                    if(c_arrKet[i+1] == 'a' && c_arrKet[i+2] == 'l' && c_arrKet[i+3] == 'a' && c_arrKet[i+4] == 'd'  && c_arrKet[i+5] == 'a') cek = true;
                }
            }
            if(c_arrKet[i] == 'J'){
                if(x == 4){
                    if(c_arrKet[i+1] == 'a' && c_arrKet[i+2] == 'z' && c_arrKet[i+3] == 'z') cek = true;
                }
            }
            if(c_arrKet[i] == 'T'){
                 if(x == 3){
                    if(c_arrKet[i+1] == 'B' && c_arrKet[i+2] == 'A') cek = true;
                }
            }
          }
           return cek;
    }
    public boolean SPOKpda(String spok){
        boolean cek = true;
        int i =0;
        char[] a = spok.toCharArray();
        Stack S = new Stack();
        if(S.isEmpty()){
            S.push('#');
        }
        while(!S.isEmpty() && cek){
            if(S.peek().equals('#') && a[i] == 'S'){
                S.push('S');
                i++;
                if(S.peek().equals('S') && a[i] == 'P'){
                    if(spok.length() == 2){
                        while(i != -1){
                          S.pop();
                          i--;
                        }
                    }else{
                        S.push('P');
                        i++;
                        if(S.peek().equals('P') && a[i] == 'O'){
                                if(spok.length() == 3){
                                    while(i != -1){
                                      S.pop();
                                      i--;
                                    }
                                }else{
                                    S.push('O');
                                    i++;
                                    if(S.peek().equals('O') && a[i] == 'K'){    
                                            while(i != -1){
                                              S.pop();
                                              i--;
                                            }
                                    }else{
                                        cek = false;
                                    }
                                }
                        }else if(S.peek().equals('P') && a[i] == 'K'){
                            while(i != -1){
                              S.pop();
                              i--;
                            }
                        }else{
                            cek = false;
                        }
                    }
                    
                }else{
                    cek = false;
                }
            }else{
                cek = false;
            }
        }
          return cek;
    }
}

