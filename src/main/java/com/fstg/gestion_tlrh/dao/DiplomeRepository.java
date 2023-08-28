package com.fstg.gestion_tlrh.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fstg.gestion_tlrh.models.Collaborateur;
import com.fstg.gestion_tlrh.models.Diplome;
import org.springframework.stereotype.Repository;

@Repository
public interface DiplomeRepository extends JpaRepository<Diplome,Integer>{



}
