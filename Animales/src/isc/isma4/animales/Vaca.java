/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author Alvarez
 */
public  class Vaca extends Animal{
    
    //public void habla(){

      //  System.out.println("¡Muuuuuu!");
    
     double Muuuu;
     
    public Vaca (double Muuuu){
        
        this.Muuuu=Muuuu;
    } 

    @Override
    public double getSonido() {
        return Muuuu;
    }
    
    }
    

