package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{

}
