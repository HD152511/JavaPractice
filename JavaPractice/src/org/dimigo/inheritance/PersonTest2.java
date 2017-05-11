package org.dimigo.inheritance;


public class PersonTest2 {
	
	private static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
	}

	public static void main(String[] args) {
		Person p[] ={
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person i : p){
			greeting(i);
			System.out.println("");
		}
			
		
	}

}


