package dao;

import java.util.HashMap;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class DataAccessObject {
	private static Logger LOGGER;
	private static DataAccessObject instance = new DataAccessObject();
	private HashMap<String,Double> cuentasBancarias;
	
	public DataAccessObject() {
		BasicConfigurator.configure();
		LOGGER = Logger.getLogger("Logger");
		cuentasBancarias = new HashMap<String,Double>();
		cuentasBancarias.put("01010101",2000.0);
		cuentasBancarias.put("02020202",1300.0);
		cuentasBancarias.put("03030303",1200.0);
		cuentasBancarias.put("04040404",1500.0);
	}
	
	public static DataAccessObject getInstance() {
		return instance;
	}

	public void updateCuenta(String id, Double cambio) {
		LOGGER.info("Efectuando cambio en cuenta "+id);
		double nuevoValor = cuentasBancarias.get(id)+cambio;
		cuentasBancarias.replace(id, nuevoValor);
	}
	
	public HashMap<String, Double> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(HashMap<String, Double> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}
}
