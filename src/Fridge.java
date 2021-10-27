/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMART
 */
public class Fridge {
    String item;
    String number;
    boolean state;
    Fridge next;
    public Fridge(String i,String n,boolean s){
     item=i;
     number=n;
     state=s;
    }
    public Fridge(){}
}
