package com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.ClientCategory;
import com.devsuperior.dscatalog.repositories.ClientCategoryRepository;

@Service
public class ClientCategoryService {

	@Autowired
	private ClientCategoryRepository clientRepository;
	
	public List<ClientCategory> findAll(){
		return clientRepository.findAll();
		
		
	}
}
