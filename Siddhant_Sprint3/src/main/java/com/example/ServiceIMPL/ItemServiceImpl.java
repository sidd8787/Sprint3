package com.example.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Item;
import com.example.Repository.ItemRepo;
import com.example.Service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepo itemRepo;
	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item); 
	}
	@Override
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}
	@Override
	public Item updateItem(int id, Item item) {
		
		Item i=itemRepo.findById(id).get();
		i.setName(item.getName());
		i.setDescription(item.getDescription());
		i.setPrice(item.getPrice());
		Item i1= itemRepo.save(i);
		return i1;
	}
	@Override
	public String deleteItem(int id, Item item) {
		itemRepo.deleteById(id);
		return "deleted the record is successfully";
	}
	

}
