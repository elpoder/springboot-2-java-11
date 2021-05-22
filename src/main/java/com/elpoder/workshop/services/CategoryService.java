package com.elpoder.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elpoder.workshop.entities.Category;
import com.elpoder.workshop.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> FindAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> obj = repository.findById(id);
		 return obj.get();
	}

}
