package com.fstg.gestion_tlrh.colaborateur;

import com.fstg.gestion_tlrh.dao.ColaborateurRepository;
import com.fstg.gestion_tlrh.models.Collaborateur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class ColaborateurRepositoryTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ColaborateurRepository underTest;

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
        Collaborateur collaborateur = new Collaborateur(
                id,"oussama_ali@sqli.com","azertyuiop","00000","ali","ahmed","aai","","samira asfi","Rabat","M","MRR1",null,null,null,Boolean.FALSE,Boolean.FALSE,null,"CM2","ICD1",9000,null,null,null,null,null,null);
        underTest.save(collaborateur);

        // when
        Optional<Collaborateur> expected = underTest.findById(id);

        //then
        assertThat(expected).isEqualTo(collaborateur);
    }

    @Test
    void itShouldNotFoundIt() {

        // given
        int id = 1;

        // when
        Optional<Collaborateur> expected = underTest.findById(id);

        //then
        assertThat(expected).isNull();
    }
}