package org.dimigo.inheritance;

public class Korean extends Person {

	public Korean(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	public void sayBye(){
		System.out.println("안녕히계세요");
	}
	public String toString(){
		return "저는 한국사람 홍길동입니다.";
	}
	

}
