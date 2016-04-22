/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht0403;

/**
 *
 * @author tomzw
 */
class Vak {
    
    private String omschrijving;
    
    public Vak(String omschrijving){
        this.omschrijving = omschrijving;
    }
    
    @Override public String toString(){
        return omschrijving;
    }
}
