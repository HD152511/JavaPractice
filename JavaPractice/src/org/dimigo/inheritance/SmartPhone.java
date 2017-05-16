/**
 * 
 */
package org.dimigo.inheritance;

/**
 * 
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhone
 *
 * 1. 개요 : 
 * 2. 작성일: 2017. 5. 12.
 *</pre>
 *
 *@author alber
 */
public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(String model,String company,int price){
		this.model=model;
		this.company=company;
		this.price=price;
	}
	public void turnOn(){
		System.out.println("전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println("전원을 끕니다.");
	}
	public void pay(){
		System.out.println("결제합니다.");
	}
	public void useSpecialFunction(SmartPhone sp){
		System.out.println("기능을 사용합니다.");
	}
	public String toString(){
		return "모델명 : "+model+","+"제조사 : "+company+","+"가격 : "+price +"원";
	}

}
