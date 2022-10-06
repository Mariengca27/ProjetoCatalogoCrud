package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.ClientCategory;
import com.devsuperior.dscatalog.services.ClientCategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private ClientCategoryService service;
	
	@GetMapping
	public ResponseEntity<List<ClientCategory>> findAll(){
		List<ClientCategory> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
		
        //list.add(new ClientCategory(1L,"TesteUsuario","023",123.6,2));
        //list.add(new ClientCategory(2L,"TesteUsuarioDois","01246523144",145.9,3));
	
	}
	
}
