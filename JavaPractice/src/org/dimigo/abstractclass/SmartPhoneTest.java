/**
 * 
 */
package org.dimigo.abstractclass;

public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone [] phones = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000),
		};
for(SmartPhone p : phones) {
	System.out.println(p);
	p.turnOn();
	p.pay();
	p.useSpecialFunction(p);
	p.turnOff();
}
		

	}

}