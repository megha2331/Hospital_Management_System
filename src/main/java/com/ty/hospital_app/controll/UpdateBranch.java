package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.BranchService;

public class UpdateBranch 
{
	public static void main(String[] args) {
		Branch branch=new Branch();
		BranchService  service=new BranchService();
		branch.setBname("K R Puram");
		branch.setEmail("krpuram@gmail.com");
		service.updateBranchById(1, branch);
	}

}
