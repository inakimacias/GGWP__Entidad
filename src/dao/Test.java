package dao;

public class Test {
	public static void main(String[] args) {
		DataAccessObject dao = DataAccessObject.getInstance();
		
		System.out.println(dao.getCuentasBancarias());
		dao.updateCuenta("01010101",-20.35);
		System.out.println(dao.getCuentasBancarias());
	}

}