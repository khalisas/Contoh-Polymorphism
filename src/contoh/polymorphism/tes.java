/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh.polymorphism;

/**
 *
 * @author LENOVO
 */
public class tes { 
    public static void main (String []args){

        makanan[] makanan= new makanan[3];
        
        makanan[0]= new restaurant();
        makanan[1]= new rumahan();
        makanan[2]= new warung();
        
       
        for(int i=0; i<makanan.length; i++){
            makanan[i].basah();
            makanan[i].kering();
          
            System.out.println();
        }
    }
}
