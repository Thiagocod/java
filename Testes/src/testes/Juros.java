/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
/**
 *
 * @author Thiago
 */
public class Juros {
    public double jurosAno1(double p,double r, int n ){
        
        double m = p * Math.pow(1+r,n);
    
        return m;
    }
    public double jurosAno2(double p,double r, int n ){
        
        double m = p;
        for(int i=0;i<n;i++){
            m = m*(1+r);
        }
        return m;
    }
}
