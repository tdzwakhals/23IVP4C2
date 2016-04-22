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
class Student {
    private String naam;
    private int nr;
    
    public Studieprogramma sp;
    public Datum gebdatum;
    
    public Student(String naam, int nr, Datum gebdatum, Datum startdatum, Datum einddatum){
        
        this.naam = naam;
        this.nr = nr;
        
        this.sp = new Studieprogramma(startdatum, einddatum);
        
        this.gebdatum = gebdatum;
        
    }
    
    public String getNaam(){
        return naam;
    }
    
    public int getNr(){
        return nr;
    } 

    @Override public String toString(){
        return naam+", "+nr+", "+gebdatum.getDag()+"-"+gebdatum.getMaand()+"-"+gebdatum.getJaar();
    }
    
    public void printStudieprogramma(){
        sp.printVakken();
        sp.printData();
    }
    
}
