package com.fstg.gestion_tlrh.models;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import lombok.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Archivage implements Serializable
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idArchivage;

	  

	    @Column()
	    private Date dateArchivage;

	    @Column()
	    private String posteActuel;

	    @Column()
	    private String posteApp;

	    @Column()
	    private Integer salaire;

		//==========constructor de copie==========================
	public Archivage(Archivage arch){

		this.idArchivage=arch.idArchivage;
		this.dateArchivage=arch.dateArchivage;
		this.posteActuel=arch.posteActuel;
		this.posteApp=arch.posteApp;
		this.salaire=arch.salaire;


	}
	    
	    //@OneToMany(mappedBy="archivage",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	   // private List<Collaborateur> collaborateur;
}
