package com.ty.hospital_app.controll;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.service.BranchService;

public class GetBranch {

	public static void main(String[] args) {
		BranchService service=new BranchService();
		Branch branch=service.getBranchById(1);
		System.out.println(branch.getBid());
		System.out.println(branch.getBname());
		System.out.println(branch.getEmail());
		System.out.println(branch.getPhone());
		System.out.println(branch.getHospitals());
	}

}
