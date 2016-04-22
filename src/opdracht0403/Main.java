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
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {     
        // TODO code application logic here
        
        
        //Comment!
        Datum gebdatum = new Datum(23,01,1987);
        Datum startdatum = new Datum(1,1,2016);
        Datum einddatum = new Datum(1,6,2016);
        
        Student student = new Student("Tom", 2100391, gebdatum, startdatum, einddatum);
        
        for(int i = 1; i <= 5; i++){
            String naam = "vak"+i;
            Vak vak = new Vak(naam);
            student.sp.addVak(vak);
        }
        
        System.out.println(student.toString());
        student.printStudieprogramma();
        
        System.out.println(student.gebdatum.getDag());
        
    }
      
}