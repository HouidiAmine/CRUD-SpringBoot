package com.houidi.crud;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houidi.crud.modele.Produit;
import com.houidi.crud.repos.ProduitRepos;


@SpringBootTest
class CrudApplicationTests {
@Autowired
private ProduitRepos produitRepos;
@Test
public void testCreateProduit() {
	Produit prod=new  Produit("pcAzur" , 2240.0 , new Date());
	produitRepos.save(prod);
	
}/*
@Test
public void testFindByidProduit() {
	Produit prod=produitRepos.findById(1L).get();
System.out.println(prod);
	
}
@Test
public void testUpdateProduit() {
	Produit prod=produitRepos.findById(1L).get();
	prod.prixProduit(6000.0);
	produitRepos.save(prod);
System.out.println(prod);
	
}
	
@Test
public void testDeleteProduit() {
	
	produitRepos.deleteById(1L);

}
@Test
public void testaffichetoutProduit() {
	List<Produit> prods=produitRepos.findAll();
	for (Produit p : prods)
		System.out.println(p);

}
	
	@Test
	void contextLoads() {
	}
	*/
	 

}
