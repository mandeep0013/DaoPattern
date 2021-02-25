package com.techbee.daoPattern;

public class daoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accnoDao bankDao = new bankDaoImpl();
		
		for (daoPattern Accno : bankDao.getAllAccno() ) {
			System.out.println("Accno : [Name :" + Accno.getName() + ", Acccno: " + Accno.getAccno() + "]");
		}
		
		daoPattern Accno = bankDao.getAllAccno().get(0);
		Accno.setAccno(0012);
		bankDao.updatedaoPattern(Accno);
		
		bankDao.getAccno("ffg");
		System.out.println("Accno : [Name :" + Accno.getName() + ", Acccno: " + Accno.getAccno() + "]");
	}

}
