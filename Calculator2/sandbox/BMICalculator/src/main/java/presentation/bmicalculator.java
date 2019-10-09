package presentation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenso
 */
public class bmicalculator {
    
    private final double weight;
    
    private final double height;
    
    private double bmi;
    
    public bmicalculator(double weight, double height){
        
        this.height = height;
        this.weight = weight;
        
    }
    
    public double bmiresult(){
        
        bmi = weight / (height * height) ;
        
        return bmi;
        
    }
    
}
