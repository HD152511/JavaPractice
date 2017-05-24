package org.dimigo.interfaces;

public class DBTest {
	private static void crud (IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

	public static void main(String[] args) {
		System.out.println("<< 변경 전 >>");
		IDBManager s = IDBManager.getDBObject("SYBASE");
		crud(s);
		System.out.println("");
		System.out.println("<< 변경 후 >>");
		IDBManager o = IDBManager.getDBObject("ORACLE");
		crud(o);
	}
 
}
 