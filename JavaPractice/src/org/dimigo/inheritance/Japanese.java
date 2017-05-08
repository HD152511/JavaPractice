package org.dimigo.inheritance;

public class Japanese extends Person {

	public Japanese(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sayHello(){
		System.out.println("오하이오");
	}
	public void sayBye(){
		System.out.println("사요나라");
	}
	public String toString(){
		return "저는 일본사람 다나카입니다.";
	}

}
