package FactoryMethodDatabase;

public class OracleFactory extends DBFactory {

	@Override
	public DB getDataBase() {
		// TODO Auto-generated method stub
		return new OracleDB();
	}
	
}
