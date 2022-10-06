package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_ClientCategory")
public class ClientCategory implements Serializable{
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String name;
	  private String cpf;
	  private Double income;
	 // private Instant birthDate; 
	  private int Children;
	
	  
	  public ClientCategory() {
		   }

	public ClientCategory(Long id, String name, String cpf, Double income, int children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		//this.birthDate = birthDate;
		this.Children = children;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Double getIncome() {
		return income;
	}


	public void setIncome(Double income) {
		this.income = income;
	}


	public int getChildren() {
		return Children;
	}


	public void setChildren(int children) {
		Children = children;
	}

	//public Instant getBirthDate() {
		//return birthDate;
	//}


	//public void setBirthDate(Instant birthDate) {
		//this.birthDate = birthDate;
	//}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientCategory other = (ClientCategory) obj;
		return Objects.equals(id, other.id);
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
