package com.fstg.gestion_tlrh.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.gestion_tlrh.models.Collaborateur;
import com.fstg.gestion_tlrh.models.Ecole;
@Repository
public interface EcoleRepository extends JpaRepository<Ecole,Integer>{



}
