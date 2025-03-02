package com.ty.hospital_app.controll;

import com.ty.hospital_app.service.BranchService;

public class DeleteBranch {

	public static void main(String[] args) {
		BranchService service=new BranchService();
		service.deleteBranchById(2);

	}

}
