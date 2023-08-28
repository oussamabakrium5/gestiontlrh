package com.fstg.gestion_tlrh.Archivage;

import com.fstg.gestion_tlrh.dao.ArchivageRepository;
import com.fstg.gestion_tlrh.models.Archivage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class ArchivageRepositoryTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ArchivageRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void itShouldFindById() {

        // given
        int id = 1;
        Archivage archivage = new Archivage(1,null,null,null,null);
        underTest.save(archivage);

        // when
        Optional<Archivage> expected = underTest.findById(id);

        //then
        assertThat(expected).isEqualTo(archivage);
    }

    @Test
    void itShouldNotFoundIt() {

        // given
        int id = 1;

        // when
        Optional<Archivage> expected = underTest.findById(id);

        //then
        assertThat(expected).isNull();
    }
}