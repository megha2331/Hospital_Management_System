package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;


public interface Itemdao 
{
	public Item saveItem(int mid, Item item );
	public Item getItemById(int id);
	public boolean deleteItemById(int id);
	public Item updateItem(int id, Item item);
	public List<Item> getAllItems();

}
