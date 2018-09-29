/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Kavita
 */
public class VitalSigns {
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    // Runtime Polymorphism( overriding)- process of replacing or displaying anything which user want in place of an object address.
    
    @Override // to change the definition of a method which is defined in parent class
    public String toString() // a method which return string also it is defined in main object class
    {
        return this.date;
    }       
    
}
