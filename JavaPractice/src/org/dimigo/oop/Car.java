/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 : 
 * 2. 작성일: 2017. 3. 23.
 *</pre>
 *
 *@author alber
 */
public class Car {
	
	private String company="현대자동차";
	private String model="제네시스";
	private String color="검정색";
	private int maxSpeed=225;
    private int price=50000000;
	

    //getter
    public String getCompany(){
    	return company;
    }
    public String getModel(){
    	return model;
    }
    public String getColor(){
    	return color;
    }
    public int getmaxSpeed(){
    	return maxSpeed;
    }
    public int getPrice(){
    	return price;
    }
    
    public void setCompany(String newCompany){
    	company=newCompany;
    	}
    public void setModel(String newModel){
    	model=newModel;
    	}
    public void setColor(String newColor){   	
    	color=newColor;
    }
    public void setmaxSpeed(int newmaxSpeed){
    	maxSpeed=newmaxSpeed;
    }
    public void setPrice(int newPrice){
    	price=newPrice;
    }
    
    
    public void setCompany1(String newCompany){
    	company=newCompany;
    	}
    public void setModel1(String newModel){
    	model=newModel;
    	}
    public void setColor1(String newColor){   	
    	color=newColor;
    }
    public void setmaxSpeed1(int newmaxSpeed){
    	maxSpeed=newmaxSpeed;
    }
    public void setPrice1(int newPrice){
    	price=newPrice;
    }

    

}
