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
public class Account {
    private String id,name;
    private int balance = 0;
    //1'st constructor
    public Account(String id,String name){
    this.id=id;
    this.name=name;
    }
    //2'nd constructor
    public Account(String id,String name,int balance){
    this.id=id;
    this.name=name;
    this.balance = balance;
    }
    
    /**
    * @return id
    */
    public String grtID(){
    return id;
    }
    
    /**
    * @return name
    */
    public String grtName(){
    return name;
    }
    
    /**
    * @return balance
    */
    public int getBalance(){
    return balance;
    }
   
    /**
    * set balance = balance+amount
    * @return balance
    */
    public int credit(int amount){
    balance+=amount;
    return balance;
    }
    
    /**
    * if(amount<=balance) set balance = balance-amount
    * else print "Amount exceeded balance"
    * @return balance
    */
    public int debit(int amount){
    if (amount<=balance)
    {
        balance-=amount;
    }
    else
    {
        System.out.println("Amount exceeded balance");
    }
    return balance;
    }
    
    /**
    * if(amount<=balance) 
    * set balance = balance-amount
    * set another.balance=another.balance+amount
    * else print "Amount exceeded balance"
    * @return balance
    */
    public int transferto(Account another,int amount){
    if(amount<=balance)
    {
        this.balance-=amount;        
        another.balance+=amount;
    }
    else
    {
        System.out.println("Amount exceeded balance");
    }
    return this.balance;
    }
    
    /**
    * @return "Account[id=?,name=?,balance=?]"
    */
    public String changeToString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }
    
}
