package services;

import dao.DataAccessObject;

public class PayingService {
	
	public static PayingService instance = null;

	public static PayingService getInstance() {
		if (instance == null) {
			instance = new PayingService();
		}
		return instance;
	}

	public PayingService() {
	}
	
	public synchronized String efectuarPago(String id, String cantidad){
		System.out.println(" - PayingService - Attempting to pay");
		DataAccessObject.getInstance().updateCuenta(id, Double.parseDouble(cantidad));
		return "Pago realizado con exito";
	}
}
