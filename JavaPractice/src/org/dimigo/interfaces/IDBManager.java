package org.dimigo.interfaces;

public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE="SYBASE";
	public void insert();
	public void search();
	public void delete();
	public void update();
	public static IDBManager getDBObject(String database){
		if(database == null){
			return null;
		}
		if(database.equals(ORACLE_DATABASE)){
			return new OracleDB();
		}
		else{
			return new SybaseDB();
		}
	} 

}
