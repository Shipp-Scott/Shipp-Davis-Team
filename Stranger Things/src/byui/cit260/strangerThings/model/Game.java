/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.model;

import java.io.Serializable;

/**
 *
 * @author Cache
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalTime;
    private double noPeople;

    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.noPeople) ^ (Double.doubleToLongBits(this.noPeople) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return Double.doubleToLongBits(this.noPeople) == Double.doubleToLongBits(other.noPeople);
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }
        
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(double noPeople) {
        this.noPeople = noPeople;
    }
    
    
}
