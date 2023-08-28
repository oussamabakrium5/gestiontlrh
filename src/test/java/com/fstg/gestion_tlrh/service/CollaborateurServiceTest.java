package com.fstg.gestion_tlrh.service;

import com.fstg.gestion_tlrh.dao.ArchivageRepository;
import com.fstg.gestion_tlrh.dao.ColaborateurRepository;
import com.fstg.gestion_tlrh.models.Collaborateur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CollaborateurServiceTest {


    @Mock
    private ColaborateurRepository colaborateurRepository;
    private ArchivageRepository archivageRepository;
    private AutoCloseable autoCloseable;
    private CollaborateurServiceImpl underTest;

    @BeforeEach
    void setUp() {
        AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new CollaborateurServiceImpl();
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }



    @Test
    void canAjout_Collaborateur() {
        //given
        Collaborateur collaborateur = new Collaborateur(
                1,"oussama_ali@sqli.com","azertyuiop","00000","ali","ahmed","aai","","samira asfi","Rabat","M","MRR1",null,null,null,Boolean.FALSE,Boolean.FALSE,null,"CM2","ICD1",9000,null,null,null,null,null,null);
    }

        //then
        ArgumentCaptor<Collaborateur> collaborateurArgumentCaptor = ArgumentCaptor.forClass(Collaborateur.class);

        //
       //  verify(ColaborateurRepository).save(collaborateurArgumentCaptor.capture());
        Collaborateur capturedCollaborateur = collaborateurArgumentCaptor.getValue();



    @Test
    void canModifier_Collaborateur() {
    }

    @Test
    void canEnvoie_email() {
    }

    @Test
    void canCreat_managerRH() {
    }

    @Test
    void canAssign_to_mangerRH() {
    }
}