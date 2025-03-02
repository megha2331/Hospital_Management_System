package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.BranchdaoImpl;
import com.ty.hospital_app.dto.Branch;


public class BranchService 
{
	public void saveBranch(int hid,Branch branch)
	{
		BranchdaoImpl daoImpl= new BranchdaoImpl();
		Branch branch1=daoImpl.saveBranch(hid, branch);
		if(branch1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly Data not Saved");
		}
	}
	public Branch getBranchById(int bid)
	{
		BranchdaoImpl daoImpl= new BranchdaoImpl();
		Branch branch1=daoImpl.getBranchById(bid);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	public void deleteBranchById(int bid)
	{
		BranchdaoImpl daoImpl= new BranchdaoImpl();
		boolean flag=daoImpl.deleteBranchById(bid);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Branch updateBranchById(int bid, Branch branch)
	{
		BranchdaoImpl daoImpl=new BranchdaoImpl();
		Branch branch1=daoImpl.updateBranch(bid, branch);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;

		}
	}
	public List<Branch> getAllBranch() 
	{
		BranchdaoImpl daoImpl=new BranchdaoImpl();
		List<Branch> branch=daoImpl.getAllBranch();
		if(branch!=null)
		{
			return branch;
		}
		else
		{
			return null;
		}
		
		
	}
}
