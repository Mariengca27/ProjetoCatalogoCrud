package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.ClientCategory;

@Repository
public interface ClientCategoryRepository extends JpaRepository<ClientCategory,Long> {

	
	
	
	
}
