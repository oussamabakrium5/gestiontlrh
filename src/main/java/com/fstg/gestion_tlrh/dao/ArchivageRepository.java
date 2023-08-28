package com.fstg.gestion_tlrh.dao;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fstg.gestion_tlrh.models.Archivage;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivageRepository extends JpaRepository<Archivage,Integer> {

	Optional<Archivage> findById(Integer id);
}
