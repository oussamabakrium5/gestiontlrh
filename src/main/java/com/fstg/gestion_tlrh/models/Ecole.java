package com.fstg.gestion_tlrh.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ecole implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idEcole;

	@Column()
	private String NomEcole;
//======================constructeur de copie===============
public Ecole(Ecole ecole){

	this.idEcole=ecole.idEcole;
	this.NomEcole=ecole.NomEcole;
}

//========================declaration des relations=======================
	@OneToMany(mappedBy="ecole",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Diplome> diploms;
}
