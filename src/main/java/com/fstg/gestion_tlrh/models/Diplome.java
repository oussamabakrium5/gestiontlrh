package com.fstg.gestion_tlrh.models;

import java.io.Serializable;
import javax.persistence.*;

import lombok.*;

@Entity
@Data
@Table(name = "diplome")
@AllArgsConstructor
@NoArgsConstructor

public class Diplome implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idDiplome;

	@Column()
	private String typeDiplome;

	@Column()
	private Integer Niveau;

	@Column()
	private Integer promotion;
//======================constructeur de copie=============





	//==================declaration des relations=======
	@ManyToOne
	private Ecole ecole;
	@ManyToOne
	//@JoinColumn(name="col-id")
	private Collaborateur colaborateur;
}
