package com.Brains404.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Brains404.dao.ProduitRepository;
import com.Brains404.entities.Produit;

@RestController
public class CatalogueController {
@Autowired
private ProduitRepository produitRepository ; 
@RequestMapping("/save")
public Produit saveProduit(Produit p) { 
	produitRepository.save(p);
	return p ; 
	
}
@RequestMapping("/all")
public List<Produit> getProduits(){ 
	return produitRepository.findAll();
}

@RequestMapping("/allByPage")
public Page<Produit> getProduits(int page){
	Pageable PageWithFiveElements = PageRequest.of(page, 5);
	return produitRepository.findAll(PageWithFiveElements);
}

@RequestMapping("/prodByMC")
public Page <Produit> getProduits(String mc , int page){
	Pageable PageWithFiveElements = PageRequest.of(page, 5);
	return produitRepository.produitParMC("%"+mc+"%",PageWithFiveElements);
}

@RequestMapping("/get")
public Optional<Produit> getProduit(Long ref){
	return produitRepository.findById(ref);
}



}
