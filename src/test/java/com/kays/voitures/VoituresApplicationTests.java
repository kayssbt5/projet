package com.kays.voitures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kays.voitures.entities.Marque;
import com.kays.voitures.entities.Voiture;
import com.kays.voitures.repos.VoitureRepository;

@SpringBootTest
class VoituresApplicationTests {
	
	@Autowired
	private VoitureRepository voitureRepository;

	@Test
	public void testCreateVoiture() {
	Voiture voi = new Voiture("Mercedes cla",1200.500,new Date());
	voitureRepository.save(voi);
	}
	
	@Test
	public void testFindVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();

	System.out.println(v);
	}
	@Test
	public void testUpdateVoiture()
	{
	Voiture v = voitureRepository.findById(1L).get();
	v.setPrixVoiture(1000.0);
	voitureRepository.save(v);
	}
	@Test
	public void testDeleteVoiture()
	{
	voitureRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousVoitures()
	{
	List<Voiture> voit = voitureRepository.findAll();
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testFindByNom()
	{
	List<Voiture> voit = voitureRepository.findByNomVoiture("mercedes class c");

	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testFindByNomContains ()
	{
	List<Voiture> voit=voitureRepository.findByNomVoitureContains("m");

	for (Voiture v : voit)
	{
	System.out.println(v);
	} }
	@Test
	public void testfindByNomPrix()
	{
	List<Voiture> voit = voitureRepository.findByNomPrix("mercedes cla", 1000.0);
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testfindByMarque()
	{
	Marque mar = new Marque();
	mar.setIdMar(1L);
	List<Voiture> voit = voitureRepository.findByMarque(mar);
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void findByMarqueIdMar()
	{
	List<Voiture> voit = voitureRepository.findByMarqueIdMar(1L);
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testfindByOrderByNomVoitureAsc()
	{
	List<Voiture> voit = voitureRepository.findByOrderByNomVoitureAsc();
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
	@Test
	public void testTrierVoituresNomsPrix()
	{
	List<Voiture> voit = voitureRepository.trierVoituresNomsPrix();
	for (Voiture v : voit)
	{
	System.out.println(v);
	}

	}
}
