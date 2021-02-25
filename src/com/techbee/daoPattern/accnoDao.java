package com.techbee.daoPattern;
import java.util.List;

public interface accnoDao {
	public List<daoPattern> getAllAccno();
	public daoPattern getAccno(String name);
	public void updatedaoPattern(daoPattern Accno );
	public void deletedaoPattern(daoPattern Accno);
}
