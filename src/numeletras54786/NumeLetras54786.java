/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeletras54786;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class NumeLetras54786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String unidades[] = 
        {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco" ,
            "seis" ,"siete" ,"ocho" ,"nueve","diez"};
        String especiales[] = 
        {"once", "doce","trece","catorce", "quince", 
            "diezciseis", "diecisiete", "dieciocho", "diecinueve"};
        String decenas[] = 
        {"veinte", "treinta","cuarenta","cincuenta", "sesenta",
            "setenta", "ochenta", "noventa"};
                             
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0-99: "); 
        int num = scanner.nextInt();
        
        if(num>=0 && num<11)
             System.out.print('\n' + unidades[num]);         
        else if(num<20)
            System.out.print('\n' + especiales[num-11]);        
         else if(num<100){
            int unid = num % 10;
            int dec = num/10;
            if(unid == 0)
                System.out.print('\n' + decenas[dec-2]);                
            else
                System.out.print('\n' + decenas[dec-2]
                + " y " + unidades[unid]);
        }
        else            
            System.out.print("El numero debe ser menor a 100");
  }    
    
}
    
