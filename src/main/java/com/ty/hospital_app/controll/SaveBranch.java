package com.ty.hospital_app.controll;


import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.BranchService;

public class SaveBranch {

	public static void main(String[] args) {
	Branch branch=new Branch();
	BranchService service=new BranchService();
	branch.setBname("BTM");
	branch.setEmail("btm@gmail.com");
	branch.setPhone(9949514564l);
	service.saveBranch(2, branch);
	
	
	

	}

}
