package com.techbee.daoPattern;
import java.util.ArrayList;
import java.util.List;

public class bankDaoImpl implements accnoDao{
	
	List<daoPattern> accno;
	
	public bankDaoImpl() {
		accno = new ArrayList<daoPattern>();
		daoPattern accno1 = new daoPattern(0012, "nancy", 5354, "nancy@gmail.com", 2098765432);
		daoPattern accno2 = new daoPattern(0013, "ancy", 5874, "ancy@gmail.com", 2098765476);
		accno.add(accno1);
		accno.add(accno2);
	}
	public void deleteAccono(daoPattern Accno) {
		accno.remove(Accno.getAccno());
		System.out.println("Bank : Accno " + Accno.getAccno() + "deleted from database");
		
	}
	
	public List<daoPattern> getAllAccno(){
		return accno;
	}
	
	public daoPattern getAccno(int name) {
		return accno.get(name);
	}
	
	public void updateAccno(daoPattern Accno) {
	accno.get(Accno.getAccno()).setAccno(Accno.getAccno());
	System.out.println("BAnk: Accno" + Accno.getName() + ", updated in the database");
	}
	@Override
	public daoPattern getAccno(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updatedaoPattern(daoPattern Accno) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletedaoPattern(daoPattern Accno) {
		// TODO Auto-generated method stub
		
	}
}
