package FactoryMethodDatabase;

public class PostgresFactory extends DBFactory {

	@Override
	public DB getDataBase() {
		
		return new PostgresDB();
	}

}
