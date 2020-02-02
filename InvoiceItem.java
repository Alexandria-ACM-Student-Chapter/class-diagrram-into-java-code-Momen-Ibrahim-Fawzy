/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author pc
 */
public class InvoiceItem {
    private String id,desc;
    private int qty;
    private double unitprice;
    
    //constructor
    public InvoiceItem(String id,String desc,int qty,double unitprice){
    this.id=id;
    this.desc=desc;
    this.qty=qty;
    this.unitprice=unitprice;
    }
    
    /**
     * 
     * @return id 
     */
    public String getID(){
    return id;
    }
    
    /**
     * 
     * @return desc 
     */
    public String getDesc(){
    return desc;
    }
    
    /**
     * 
     * @return qty 
     */
    public int getQty(){
    return qty;
    }
    
    /**
     * 
     * @set qty 
     */
    public void setQty(int qty){
    this.qty=qty;
    }
    
    /**
     * 
     * @return unitprice 
     */
    public double getUnitprice(){
    return unitprice;
    }
    
    /**
     * 
     * @set unitprice 
     */
    public void setUnitprice(double unitprice){
    this.unitprice=unitprice;
    }
    
    /**
     * 
     * @return unitprice*qty 
     */
    public double getTotal(){
    return unitprice*qty;
    }
    
    /**
     * 
     * @return  "InvoiceItem[id=?,desc=?,qty=?,unitprice=?]";
     */
    public String changeToString(){
    return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitprice="+unitprice+"]";
    }
    
}
