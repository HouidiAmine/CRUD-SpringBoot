package com.houidi.crud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houidi.crud.modele.Produit;

public interface ProduitRepos extends JpaRepository<Produit, Long> {

}
