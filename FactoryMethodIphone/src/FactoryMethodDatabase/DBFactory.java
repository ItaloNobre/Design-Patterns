package FactoryMethodDatabase;

public abstract class  DBFactory {
	
	protected DB db (String nameDb, String sql) {
		
		DB device = getDataBase();
		
		if("OracleDb".equalsIgnoreCase(nameDb)) {
			device = new OracleDB();
		}else if("PostgresDB".equalsIgnoreCase(nameDb)) {
			device = new PostgresDB();
		}
		
		if(device != null) {
			device.query(sql);
			device.update(sql);
			
		}
		
		return device;
	}
	
	public abstract  DB getDataBase();
	
}
