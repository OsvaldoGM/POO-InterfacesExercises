/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author Osvaldo
 */
public class Circle implements GeometricObject{
    protected double radius = 1.0;

    public Circle(double raidus) {
        this.radius = radius;
    }
    //Hiciimos este constructor de mas porque si
    public Circle (){
        this.radius = 1.0;
    }
    
    @Override
    public double getPerimeter (){
        return radius * 2 * Math.PI;
    }
    
    @Override
    public double getArea (){
        return radius * radius * Math.PI;      
    }
}
