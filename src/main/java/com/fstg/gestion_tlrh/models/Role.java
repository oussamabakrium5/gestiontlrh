package com.fstg.gestion_tlrh.models;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable{

	@Id
	private Integer idrole;
	
	@Column()
	private String rolename;
	//============constructeur de copie====================
	public Role(Role role){
		this.idrole=role.idrole;
		this.rolename=role.rolename;
	}


	//============declaration des relations===============
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_Collaborateur",
            joinColumns = @JoinColumn(name = "id_role"),
            inverseJoinColumns = @JoinColumn(name = "id_collaborateur")
    )
    private List<Collaborateur> Collaborateur_Role;
}
