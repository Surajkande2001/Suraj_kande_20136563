package com;

 

public class Employee {

 

    private int Eid;
    private String Ename;
    //private int price;
    //private String pdesc;


    public int getEid() {
        return Eid;
    }

 


    public void setEid(int eid) {
        Eid = eid;
    }

 


    public String getEname() {
        return Ename;
    }

 


    public void setEname(String ename) {
        Ename = ename;
    }

 




 

    
    @Override

    public String toString() {

        return "Employee [id=" +Eid +", Ename=" + Ename + "]";// ",price = " + price + ",pdesc = " + pdesc + "]";
    }


    void display() {
           System.out.println("Employee ID: " + Eid);
           System.out.println("Employee Name: " + Ename);
           //System.out.println("Price: " + price);
           //System.out.println("Product Description: " + pdesc);
        }

 

        }