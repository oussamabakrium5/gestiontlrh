package com.fstg.gestion_tlrh.models;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;



import lombok.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor

public class Collaborateur implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCollaborateur;
	
	@Column()
	private String email;

	@Column
	private String password;

	@Column()
	private String matricul;

	@Column()
	private String nom_collaborateur;

	@Column()
	private String prenom_collaborateur;

	@Column()
	private String abreviation_collaborateur;

	@Column()
	private String ancien_manager_rh;

	@Column()
	private String managerrh_actuel;

	@Column()
	private String site;

	@Column()
	private String sexe;

	@Column()
	private String BU;

	@Column()
	private Date date_embauche;

	@Column()
	private String mois_bap;

	@Column()
	private Date date_depart;

	@Column()
	private Boolean Ancien_Collaborateur;

	@Column()
	private Boolean Seminaire_Intrgration;

	@Column()
	private Date Date_Participation;

	@Column()
	private String PosteAPP;

	@Column()
	private String PosteActuel;

	@Column()
	private Integer Salaire_Actuel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusManagerRH statut = StatusManagerRH.Desactive;

//===================constructeurs=====================

public  Collaborateur(Collaborateur cl){


	this.email=cl.email;

    this.idCollaborateur=cl.idCollaborateur;
    this.password=cl.password;

    this.matricul=cl.matricul;

    this.nom_collaborateur=cl.nom_collaborateur;

    this.prenom_collaborateur=cl.prenom_collaborateur;

    this.abreviation_collaborateur=cl.abreviation_collaborateur;

    this.ancien_manager_rh=cl.ancien_manager_rh;

    this.managerrh_actuel=cl.managerrh_actuel;

    this.site=cl.site;

    this.sexe=cl.sexe;

    this.BU=cl.BU;

    this.date_embauche=cl.date_embauche;

    this.mois_bap=cl.mois_bap;

    this.date_depart=cl.date_depart;

    this.Ancien_Collaborateur=cl.Ancien_Collaborateur;

    this.Seminaire_Intrgration=cl.Seminaire_Intrgration;

    this.Date_Participation=cl.Date_Participation;

    this.PosteAPP=cl.PosteAPP;

    this.PosteActuel=cl.PosteActuel;

    this.Salaire_Actuel=cl.Salaire_Actuel;

    this.statut = cl.statut;
}

	public Collaborateur(Integer idCollaborateur, String email, String password, String matricul, String nom_collaborateur, String prenom_collaborateur, String abreviation_collaborateur, String ancien_manager_rh, String managerrh_actuel, String site, String sexe, String BU, Date date_embauche, String mois_bap, Date date_depart, Boolean ancien_Collaborateur, Boolean seminaire_Intrgration, Date date_Participation, String posteAPP, String posteActuel, Integer salaire_Actuel, StatusManagerRH statut, Collaborateur managerRH, List<Diplome> diploms, List<Archivage> archivages, List<Technologie> technologie_Collaborateur, List<Role> roles) {
		this.idCollaborateur = idCollaborateur;
		this.email = email;
		this.password = password;
		this.matricul = matricul;
		this.nom_collaborateur = nom_collaborateur;
		this.prenom_collaborateur = prenom_collaborateur;
		this.abreviation_collaborateur = abreviation_collaborateur;
		this.ancien_manager_rh = ancien_manager_rh;
		this.managerrh_actuel = managerrh_actuel;
		this.site = site;
		this.sexe = sexe;
		this.BU = BU;
		this.date_embauche = date_embauche;
		this.mois_bap = mois_bap;
		this.date_depart = date_depart;
		Ancien_Collaborateur = ancien_Collaborateur;
		Seminaire_Intrgration = seminaire_Intrgration;
		Date_Participation = date_Participation;
		PosteAPP = posteAPP;
		PosteActuel = posteActuel;
		Salaire_Actuel = salaire_Actuel;
		this.statut = statut;
		this.managerRH = managerRH;
		this.diploms = diploms;
		this.archivages = archivages;
		Technologie_Collaborateur = technologie_Collaborateur;
		this.roles = roles;
	}

	//===========================implementation des relations===============================
//add onetoone archivage
    @OneToOne
    private Collaborateur managerRH;

    //@OneToMany(mappedBy = "colaborateur")
    //private List<Diplome> diplomes;

	@OneToMany(mappedBy="colaborateur",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Diplome> diploms;

    @OneToMany
    @JoinTable(name = "collaborateur_archivage",
            joinColumns = @JoinColumn(name = "id_collaborateur"),
            inverseJoinColumns = @JoinColumn(name = "id_archivage"))
    private List<Archivage> archivages;
	//@ManyToOne
	//private Archivage archivage;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	           name = "Collaborateur_Technologie",
	           joinColumns = @JoinColumn(name = "id_technologie"),
	           inverseJoinColumns = @JoinColumn(name = "id_collaborateur")
	    )
	private List<Technologie> Technologie_Collaborateur;


	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_Collaborateur",
            joinColumns = @JoinColumn(name = "id_role"),
            inverseJoinColumns = @JoinColumn(name = "id_collaborateur")
    )
    private List<Role> roles;





}
