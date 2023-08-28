package com.fstg.gestion_tlrh.models;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technologie implements Serializable {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idTechnologie;

	    @Column()
	    private String nomTechnologie;

	    @Column()
	    private int niveauTechnologie;
	    //============constructeur de copie============
	public Technologie(Technologie tech){
		this.idTechnologie=tech.idTechnologie;
		this.nomTechnologie=tech.nomTechnologie;
		this.niveauTechnologie=tech.niveauTechnologie;
	}

		//=============declaration des methodes=======
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	            name = "Technologie_Collaborateur",
	            joinColumns = @JoinColumn(name = "id_technologie"),
	            inverseJoinColumns = @JoinColumn(name = "id_collaborateur")
	    )
	    private List<Collaborateur> Collaborateur_Technologie;
	
}
