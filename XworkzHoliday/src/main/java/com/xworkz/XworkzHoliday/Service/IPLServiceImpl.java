package com.xworkz.XworkzHoliday.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.XworkzHoliday.Entity.IPLEntity;
import com.xworkz.XworkzHoliday.dao.IPLDAO;

@Component
public class IPLServiceImpl implements IPLService {
	@Autowired
	private IPLDAO ipldao;
	
	public IPLServiceImpl() {
		System.out.println("created \t :"+this.getClass().getSimpleName());
	}
	
	/*public IPLServiceImpl(IPLDAO ipldao) {
		this.ipldao= ipldao;
		System.out.println("created  with args :"+ipldao);
		}*/
	
	public boolean validateAndSave(IPLEntity iplEntity) {
	System.out.println("invoked validateIPLAndRegister......!!!!!");
	boolean flag=false;
	
		String teamName=iplEntity.getTeamName();
		if(teamName!=null && !teamName.isEmpty() ) {
			System.out.println("teamName is valid");
			flag= true;
		}else {
			System.out.println("teamName is NOT valid");
			flag=false;
			return flag;
		}
		
	String franchiceOwner =iplEntity.getFranchiceOwner();
	if(franchiceOwner !=null && !franchiceOwner.isEmpty() && franchiceOwner.length()>2 && franchiceOwner.length()<10 && !franchiceOwner.trim().isEmpty()&& franchiceOwner.matches("[a-zA-Z]+")) {
		System.out.println("FranchiceOwner is vaild");
		flag=true;
	}
	else {
		System.out.println("FranchiceOwner is NOT valid");
		flag=false;
		return flag;
	}
	String teamCaptain=iplEntity.getTeamCaptain();
	if(teamCaptain !=null && !teamCaptain.isEmpty() && teamCaptain.length()>2 && teamCaptain.length()<10 && !teamCaptain.trim().isEmpty()&& teamCaptain.matches("[a-zA-Z]+")) {
		System.out.println("TeamCaptain is vaild");
		flag=true;
	}
	else {
		System.out.println("TeamCaptain is NOT valid");
		flag=false;
		return flag;
	}
	String place=iplEntity.getPlace();
	if(place !=null && !place.isEmpty() && place.length()>2 && place.length()<10 && !place.trim().isEmpty()&& place.matches("[a-zA-Z]+")) {
		System.out.println("place is vaild");
		flag=true;
	}
	else {
		System.out.println("place is NOT valid");
		flag=false;
		return flag;
	}
	

	if(flag = true) {
		ipldao.save(iplEntity);
	}
	return flag;
}
}
	
