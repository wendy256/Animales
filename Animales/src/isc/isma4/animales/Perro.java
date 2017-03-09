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
public abstract class Perro extends Animal{
      
 //public void habla(){

       // System.out.println("¡Guau!");
    
    double Guau;
     
    public Perro (double Guau){
        
        this.Guau=Guau;
    } 

    @Override
    public double getSonido() {
        return Guau;
    }
    
    }
    
  
    
    

