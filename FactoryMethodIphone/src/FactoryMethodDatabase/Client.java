package FactoryMethodDatabase;

public class Client {
	public static void main(String[] args) {
		DB db = new PostgresFactory().getDataBase();
		
		
		db.update("server");
	}	
}
