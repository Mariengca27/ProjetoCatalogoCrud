package com.devsuperior.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.ClientCategory;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<ClientCategory>> findAll(){
		List<ClientCategory> list = new ArrayList<>();
        list.add(new ClientCategory(1L,"TesteUsuario","023",123.6,2));
        list.add(new ClientCategory(2L,"TesteUsuarioDois","01246523144",145.9,3));
	
	return ResponseEntity.ok().body(list);
	}
	
}
