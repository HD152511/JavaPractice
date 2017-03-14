/**
 * 
 */
package org.dimigo.basic;

/**
 * 
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요 : 디미베네 
 * 2. 작성일: 2017. 3. 14.
 *</pre>
 *
 *@author alber
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int w = 1700000;
		int z = 3;
		int jumsu = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d",1700000)+"원");
		System.out.println("점포 내 직원수 : "+z+"명");
		System.out.println("점포 수 : "+jumsu +"개");
		System.out.println("연간 인건비 : "+String.format("%,d",(long)w*z*jumsu*12)+"원");

	}

}
