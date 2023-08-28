package com.fstg.gestion_tlrh.dao;
 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.gestion_tlrh.models.Archivage;
import com.fstg.gestion_tlrh.models.Collaborateur;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaborateurRepository extends JpaRepository<Collaborateur,Integer>{

	Optional<Collaborateur> findById(Integer id);
}
