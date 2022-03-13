package com.houidi.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houidi.crud.modele.Produit;
import com.houidi.crud.repos.ProduitRepos;
@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
    ProduitRepos  produitRepos;
	@Override
	public Produit saveProduit(Produit p) {
             
		return produitRepos.save(p);
	
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepos.save(p);
		
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepos.delete(p);
			}

	@Override
	public void deleteProduitById(Long id) {
		produitRepos.deleteById(id);		
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepos.findById(id).get();
	
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepos.findAll();
	}

}
