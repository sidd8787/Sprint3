package com.example.Service;

import java.util.List;

import com.example.Entity.Item;

public interface ItemService {
Item createItem(Item item);
List<Item> getAllItem();
//void deleteItem(Integer id);

Item updateItem(int id, Item item);

String deleteItem(int id, Item item);
}
