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
class Datum {
    
    private int dag, maand, jaar;
    
    public Datum(int dag, int maand, int jaar){
        
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
        
    }
    
    public int getDag(){
        return dag;
    }
    
    public int getMaand(){
        return maand;
    }
    
    public int getJaar(){
        return jaar;
    }
    
    public String toString(){
        return ""+dag+"-"+maand+"-"+jaar;
    }
}
