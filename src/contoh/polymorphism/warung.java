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
public class warung extends makanan {
    @Override
    void basah(){
        System.out.println("mie rebus");
    }
    @Override
    void kering(){
        System.out.println("gorengan");
    }
    
}
