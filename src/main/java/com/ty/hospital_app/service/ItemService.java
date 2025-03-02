package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemdaoImpl;
import com.ty.hospital_app.dto.Item;

public class ItemService 
{
	public void saveItem(int mid, Item item )
	{
		ItemdaoImpl daoImpl=new ItemdaoImpl();
		Item item1=daoImpl.saveItem(mid, item);
		if(item1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunatly data not saved");
		}
	}
	public Item getItemById(int id)
	{
		ItemdaoImpl daoImpl=new ItemdaoImpl();
		Item item1=daoImpl.getItemById(id);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;
		}
	}
	public void deleteItemById(int id)
	{
		ItemdaoImpl daoImpl=new ItemdaoImpl();
		boolean flag=daoImpl.deleteItemById(id);
		if(flag)
		{
			System.out.println("Data Deleted");
		}
		else
		{
			System.out.println("Data not found");
		}
	}
	public Item updateItemById(int id, Item item)
	{
		ItemdaoImpl daoImpl=new ItemdaoImpl();
		Item item1=daoImpl.updateItem(id, item);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;

		}

	}
	public List<Item> getAllItem() 
	{
		ItemdaoImpl daoImpl=new ItemdaoImpl();
		List<Item> item=daoImpl.getAllItems();
		if(item!=null)
		{
			return item;
		}
		else
		{
			return null;
		}
	}

}
