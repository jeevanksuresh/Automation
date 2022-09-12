package com.attra.assignment1;

public class MyVehicle {
	
	 	int vmodel;
	    String vname;
	    double vprice;
	    String vcolor;
	    
	        
	    public MyVehicle(int vmodel, String vname, double vprice, String vcolor ) {
	        super();
	        this.vmodel = vmodel ;
	        this.vname = vname;
	        this.vprice = vprice;
	        this.vcolor = vcolor;
	    }




	    public MyVehicle() {
	        // TODO Auto-generated constructor stub
	    }



	   public int getVmodel() {
	        return vmodel;
	    }




	    public void setVmodel(int vmodel) {
	        this.vmodel = vmodel;
	    }




	    public String getVname() {
	        return vname;
	    }




	    public void setVname(String vname) {
	        this.vname = vname;
	    }




	    public double getVprice() {
	        return vprice;
	    }




	    public void setVprice(double vprice) {
	        this.vprice = vprice;
	    }




	    public String getVcolor() {
	        return vcolor;
	    }




	    public void setVcolor(String vcolor) {
	        this.vcolor = vcolor;
	    }




	    
	    public void printst() {
	        System.out.println("The Vehicle model is " + vmodel + ", the vehicle name is = " + vname + ",and Price is " + vprice + ", and the color is " + vcolor + "]");
	    }



	   public static void main(String[] args) {
	        
	        MyVehicle a1 = new MyVehicle(2017, "i20", 1000000, "White");
	        System.out.println("The colour of the Vehicle is "+ a1.getVcolor());



	       MyVehicle a2 = new MyVehicle();
	        a2.setVcolor("Black");
	        a2.setVname("Thar");
	        a2.setVprice(1500000);
	        a2.setVmodel(2021);
	        a2.printst();
	        



	   }



}
