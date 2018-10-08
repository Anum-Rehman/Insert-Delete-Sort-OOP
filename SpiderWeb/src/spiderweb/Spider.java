/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderweb;

/**
 *
 * @author Anum
 */
public class Spider {
    private int legs;
    private String color;
    private float size;
    public Spider (int legs,String color,float size){
        this.legs=legs;
        this.color=color;
        this.size=size;
    }
    public int getLegs(){
        return legs;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public float getSize(){
        return size;
    }
    public void setSize(float size){
        this.size=size;
    }
    @Override
    public String toString(){
        System.out.println();
        return "Spider is:"+" "+this.color+" "+"having"+" "+this.legs+" "+"legs of size"+" "+this.size;
    }
}
