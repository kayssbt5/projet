package com.kays.voitures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kays.voitures.entities.Marque;
import com.kays.voitures.entities.Voiture;
import com.kays.voitures.repos.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService {
	
	@Autowired
	VoitureRepository voitureRepository;

	@Override
	public Voiture saveVoiture(Voiture v) {
		return voitureRepository.save(v);
	}
	@Override
	public Voiture updateVoiture(Voiture v) {
	return voitureRepository.save(v);
	}
	@Override
	public void deleteVoiture(Voiture v) {
	voitureRepository.delete(v);
	}
	@Override
	public void deleteVoitureById(Long id) {
	voitureRepository.deleteById(id);
	}
	@Override
	public Voiture getVoiture(Long id) {
	return voitureRepository.findById(id).get();
	}
	@Override
	public List<Voiture> getAllVoitures() {
	return voitureRepository.findAll();
	}
	@Override
	public List<Voiture> findByNomVoiture(String nom) {
		return voitureRepository.findByNomVoiture(nom);
	}
	@Override
	public List<Voiture> findByNomVoitureContains(String nom) {
		return voitureRepository.findByNomVoitureContains(nom);
	}
	@Override
	public List<Voiture> findByNomPrix(String nom, Double prix) {
		return voitureRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Voiture> findByMarque(Marque marque) {
		return voitureRepository.findByMarque(marque);
	}
	@Override
	public List<Voiture> findByMarqueIdMar(Long id) {
		return voitureRepository.findByMarqueIdMar(id);
	}
	@Override
	public List<Voiture> findByOrderByNomVoitureAsc() {
		return voitureRepository.findByOrderByNomVoitureAsc();
	}
	@Override
	public List<Voiture> trierVoituresNomsPrix() {
		return voitureRepository.trierVoituresNomsPrix();
	}
	
	}
