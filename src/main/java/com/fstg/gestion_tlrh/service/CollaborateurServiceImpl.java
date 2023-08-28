package com.fstg.gestion_tlrh.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.fstg.gestion_tlrh.dao.ArchivageRepository;
import com.fstg.gestion_tlrh.models.*;

import org.springframework.stereotype.Service;

import com.fstg.gestion_tlrh.dao.ColaborateurRepository;

@Service

public class CollaborateurServiceImpl implements CollaborateurServiceIntf{

	private ColaborateurRepository collaborateurdao;//type Collaborateur public interface ColaborateurRepository extends JpaRepository<Collaborateur,Integer>

	private ArchivageRepository archivagedao;

	


	public CollaborateurServiceImpl() {}
	//===========================================================================================

	//******************************************************************************************************************

	@Override
	public Collaborateur save(Collaborateur r) {
		Collaborateur savedcollab=collaborateurdao.save(r);

		return savedcollab;
	}

	//===============================gestion de collaborateur===========================================
	@Override
	public Collaborateur Ajout_Collaborateur(Collaborateur cl) {

		//Optional<Collaborateur> existingCollaborateur = collaborateurdao.findById(Integer.valueOf(cl.getMatricul()));
		//if(existingCollaborateur.isPresent()) throw new RuntimeException("collaborateur déja exist");
		//Collaborateur collaborateur = existingCollaborateur.get();

		/*List<Diplome> diploms= new ArrayList<>();
		List<Archivage> archivages= new ArrayList<>();
		List<Technologie> technologie_Collaborateur= new ArrayList<>();
		List<Role> roles= new ArrayList<>();
		Date aujourdhui = new Date();*/

		Collaborateur collab=new Collaborateur(
				cl.getIdCollaborateur(),
				cl.getEmail(),
				cl.getPassword(),
				cl.getMatricul(),
				cl.getNom_collaborateur(),
				cl.getPrenom_collaborateur(),
				cl.getAbreviation_collaborateur(),
				cl.getAncien_manager_rh(),
				cl.getManagerrh_actuel(),
				cl.getSite(),
				cl.getSexe(),
				cl.getBU(),
				cl.getDate_embauche(),
				cl.getMois_bap(),
				cl.getDate_depart(),
				cl.getAncien_Collaborateur(),
				cl.getSeminaire_Intrgration(),
				cl.getDate_Participation(),
				cl.getPosteAPP(),
				cl.getPosteActuel(),
				cl.getSalaire_Actuel(),
				cl.getStatut(),
				cl.getManagerRH(),
				cl.getDiploms(),
				cl.getArchivages(),
				cl.getTechnologie_Collaborateur(),
				cl.getRoles()
		);

	/*	collab.setEmail(cl.getEmail());
		collab.setPassword(cl.getPassword());
		collab.setMatricul(cl.getMatricul());
		collab.setNom_collaborateur(cl.getNom_collaborateur());
		collab.setPrenom_collaborateur(cl.getPrenom_collaborateur());
		collab.setAbreviation_collaborateur(cl.getAbreviation_collaborateur());
		collab.setAncien_manager_rh(cl.getAncien_manager_rh());
		collab.setManagerrh_actuel(cl.getManagerrh_actuel());
		collab.setSite(cl.getSite());
		collab.setSexe(cl.getSexe());
		collab.setBU(cl.getBU());
		collab.setDate_embauche(cl.getDate_embauche());
		collab.setMois_bap(cl.getMois_bap());
		collab.setDate_depart(cl.getDate_depart());
		collab.setAncien_Collaborateur(cl.getAncien_Collaborateur());
		collab.setSeminaire_Intrgration(cl.getSeminaire_Intrgration());
		collab.setDate_Participation(cl.getDate_Participation());
		collab.setPosteAPP(cl.getPosteAPP());
		collab.setPosteActuel(cl.getPosteActuel());
		collab.setSalaire_Actuel(cl.getSalaire_Actuel());*/

        Collaborateur savedcollab=collaborateurdao.save(collab);

		return savedcollab;



        // Vérifie si le collaborateur existe déjà dans la base de données
     /*   Optional<Collaborateur> existingCollaborateur = collaborateurdao.findById(Integer.valueOf(cl.getMatricul()));
        if (existingCollaborateur.isPresent()) {
            throw new IllegalStateException("Le collaborateur existe déjà.");
        } else {
			// Crée une nouvelle instance de collaborateur
			Collaborateur collaborateur = new Collaborateur();
			collaborateur.setMatricul(cl.getMatricul());
			collaborateur.setNom_collaborateur(cl.getNom_collaborateur());
			collaborateur.setEmail(cl.getEmail());
			collaborateur.setPrenom_collaborateur(cl.getPrenom_collaborateur());
			collaborateur.setSexe(cl.getSexe());
			collaborateur.setSite(cl.getSite());
			collaborateur.setAbreviation_collaborateur(cl.getAbreviation_collaborateur());
			collaborateur.setBU(cl.getBU());
			collaborateur.setDate_embauche(cl.getDate_embauche());
			collaborateur.setMois_bap(cl.getMois_bap());
			collaborateur.setEmail(cl.getEmail());
			collaborateur.setSalaire_Actuel(cl.getSalaire_Actuel());
			collaborateur.setPosteActuel(cl.getPosteActuel());
			collaborateur.setPosteAPP(cl.getPosteAPP());
			collaborateur.setAncien_Collaborateur(cl.getAncien_Collaborateur());
			collaborateur.setDate_Participation(cl.getDate_Participation());
			// Enregistre le collaborateur dans la base de données
			collaborateurdao.save(collaborateur);

			return collaborateur;
		}*/
		/*Collaborateur collab=new Collaborateur(cl);
		Archivage archi=new Archivage(arch);
		Diplome diplome1=new Diplome(diplome);
		Ecole ecole1=new Ecole(ecole);
		Role role1=new Role(role);
		Technologie tech1=new Technologie(tech);*/

		//return collab;
	}

	@Override
	public Collaborateur modifier_Collaborateur(Collaborateur cl, Integer id) {
        //passer les données vers la table collaborateur
        //création de la liaison entre dto et l'entity// et recuperer les données
		//les données par lesquelle je dois remplacer les anciens
		//mapping dzs données est pas type casting
        //Collaborateur collabb=modelmapper.map(cl,Collaborateur.class);
        //chercher par id dans les deonnées qu'on a viens de passer vers collaborateur
		//Optional<Collaborateur> findcollab=collaborateurdao.findById(id);
        //soit isPresent()=>!null où orElseThrow(()-> new RunTimeException("error"))
		//if(findcollab.isPresent() && findcollab.get().getIdCollaborateur().equals(cl.getIdCollaborateur())){

            //recuperer les info de collaborateur précis
          //  Collaborateur recupinfo=findcollab.get();//les données qui vont étre modifié


           // recupinfo.setIdCollaborateur(id);

			/*recupinfo.setIdCollaborateur(cl.getIdCollaborateur());
			recupinfo.setMatricul(cl.getMatricul());
			recupinfo.setNom_collaborateur(cl.getNom_collaborateur());
			recupinfo.setPrenom_collaborateur(cl.getPrenom_collaborateur());
			recupinfo.setEmail(cl.getEmail());
			recupinfo.setAbreviation_collaborateur(cl.getAbreviation_collaborateur());
			recupinfo.setAncien_Collaborateur(cl.getAncien_Collaborateur());
			//recupinfo.setCollaborateur_Role(cl.getCollaborateur_Role());

            Collaborateur savecollab=collaborateurdao.save(recupinfo);


			//ajouter à la table archivage
			Archivage archivage=new Archivage();

			//archivage.setCollaborateur(cl.getRoles());
			archivage.setDateArchivage(new Date(System.currentTimeMillis()));
			archivage.setPosteActuel(cl.getPosteActuel());
			archivage.setPosteApp(cl.getPosteAPP());
			archivage.setSalaire(cl.getSalaire_Actuel());

			Archivage savearrchive=archivagedao.save(archivage);


			return savecollab;
		}*/

		return null;
	}

	@Override
	public void envoie_email(Collaborateur collaborateur) {
		String collaborateurMail=collaborateur.getEmail();
		Collaborateur manager=collaborateur.getManagerRH();
		if(manager!=null) {
			String managerMail = manager.getEmail();
			String sexe = manager.getSexe().equals("Female") ? "Mrs" : "Mr";
			EmailSenderService.sendemail(managerMail,
					"New Employee ",
					"Hi "+sexe+" "+manager.getPrenom_collaborateur()+" "+manager.getNom_collaborateur()+
							" Your new Employee is : " + collaborateur.getPrenom_collaborateur() +
							" " + collaborateur.getNom_collaborateur() + " the email is : " + collaborateurMail
					);
		}
		EmailSenderService.sendemail(collaborateurMail,
				" SQLI ",
				"Hi Dear welcome to SQLI . "
				);
	}
	//=================================gestion des mangers RH========================================
	@Override
	public Collaborateur creat_managerRH(Collaborateur managerrh) {

	//	Collaborateur collab=modelmapper.map(managerDto,Collaborateur.class);//recuperer les données
        Optional<Collaborateur> fincollab=collaborateurdao.findById(managerrh.getIdCollaborateur());
        if(fincollab.isPresent()){
            Collaborateur recup=fincollab.get();
            boolean hasrolemnrh=recup.getRoles().stream().anyMatch(
                    role->recup.getRoles().equals("Manger RH"));
            if(hasrolemnrh) throw new RuntimeException("collaborateur est deja manager rh");

        }
		Collaborateur collab=new Collaborateur();

		collab.setEmail(managerrh.getEmail());
		collab.setPassword(managerrh.getPassword());
		collab.setMatricul(managerrh.getMatricul());
		collab.setNom_collaborateur(managerrh.getNom_collaborateur());
		collab.setPrenom_collaborateur(managerrh.getPrenom_collaborateur());
		collab.setAbreviation_collaborateur(managerrh.getAbreviation_collaborateur());
		collab.setAncien_manager_rh(managerrh.getAncien_manager_rh());
		collab.setManagerrh_actuel(managerrh.getManagerrh_actuel());
		collab.setSite(managerrh.getSite());
		collab.setSexe(managerrh.getSexe());
		collab.setBU(managerrh.getBU());
		collab.setDate_embauche(managerrh.getDate_embauche());
		collab.setMois_bap(managerrh.getMois_bap());
		collab.setDate_depart(managerrh.getDate_depart());
		collab.setAncien_Collaborateur(managerrh.getAncien_Collaborateur());
		collab.setSeminaire_Intrgration(managerrh.getSeminaire_Intrgration());
		collab.setDate_Participation(managerrh.getDate_Participation());
		collab.setPosteAPP(managerrh.getPosteAPP());
		collab.setPosteActuel(managerrh.getPosteActuel());
		collab.setSalaire_Actuel(managerrh.getSalaire_Actuel());

		Collaborateur savedcollab=collaborateurdao.save(collab);

		//ajouter à la table archivage
		Archivage archivage=new Archivage();

		//archivage.setCollaborateur(collab.getRoles());
		archivage.setDateArchivage(new Date(System.currentTimeMillis()));
		archivage.setPosteActuel(managerrh.getPosteActuel());
		archivage.setPosteApp(managerrh.getPosteAPP());
		archivage.setSalaire(managerrh.getSalaire_Actuel());
		Archivage savearrchive=archivagedao.save(archivage);

		// Assign the "Manager RH" role to the coll
		Role managerRole = new Role();
		managerRole.setRolename("manager RH");
		managerrh.getRoles().add(managerRole);
		collaborateurdao.save(managerrh);

		return savedcollab;
	}

	@Override
	public Collaborateur assign_to_mangerRH(Integer collaborateurId, Integer managerId) {
		Optional<Collaborateur> optionalCollaborateur = collaborateurdao.findById(collaborateurId);


		if (optionalCollaborateur.isPresent()) {
			Collaborateur collaborateur = optionalCollaborateur.get();


			Optional<Collaborateur> optionalManagerRH = collaborateurdao.findById(managerId);
			if (optionalManagerRH.isPresent()) {
				Collaborateur managerRH = optionalManagerRH.get();

				if (managerRH.getRoles().stream().anyMatch(role -> role.getRolename().equals("Manager RH"))) {

					collaborateur.setManagerRH(managerRH);
				} else {
					throw new IllegalStateException("Le Collaborateur sélectionné n'a pas le rôle de Manager RH.");
				}
			} else {
				throw new RuntimeException("Manager RH not found");
			}


			Collaborateur collaborateurUpdated = collaborateurdao.save(collaborateur);


			Collaborateur updatedDto = new Collaborateur();
			updatedDto.setMatricul(collaborateurUpdated.getMatricul());
			updatedDto.setSalaire_Actuel(collaborateurUpdated.getSalaire_Actuel());
		//	updatedDto.setManagerRH(collaborateurUpdated.getManagerRH().getMatricul());
			updatedDto.setPosteAPP(collaborateurUpdated.getPosteAPP());

			return updatedDto;
		} else {
			throw new RuntimeException("Collaborateur not found");
		}
		//return null;
	}
//=================================================== reporting ====================================

}
