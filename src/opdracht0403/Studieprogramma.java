/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht0403;


import java.util.ArrayList;
/**
 *
 * @author tomzw
 */
class Studieprogramma {
    
    private ArrayList<Vak> vaklijst;
    private Datum startdatum, einddatum;
    
    public Studieprogramma(Datum startdatum, Datum einddatum){
        
        vaklijst = new ArrayList();
        
        this.startdatum = startdatum;
        this.einddatum = einddatum;
        
    }
    
    public void addVak(Vak vak){
       vaklijst.add(vak); 
    }
    
    public void printVakken(){
        System.out.println(vaklijst);
    }
    
    public void printData(){
        System.out.println("Startdatum = "+startdatum.getDag()+"-"+startdatum.getMaand()+"-"+startdatum.getJaar());
        System.out.println("Einddatum = "+einddatum.toString());
    }
    
}
