package com.fstg.gestion_tlrh.service;


import com.fstg.gestion_tlrh.models.*;

public interface CollaborateurServiceIntf {

	 //**************************************************************************************************************

   public Collaborateur save(Collaborateur r);
	
	//public CollaborateurRespondDTO findById(Integer id);
	
	//public CollaborateurRespondDTO findByNom(String nom);
	
//	public void Delete(Integer id) ;
	
	//public CollaborateurRespondDTO Update(CollaborateurRequestDTO cl, Integer id);
	
	//public List<CollaborateurRespondDTO> findAll();
//**********************************************************************************************************************
	//====================gestion de collaborateur===================
	public Collaborateur Ajout_Collaborateur(Collaborateur cl);

	public Collaborateur modifier_Collaborateur(Collaborateur cl, Integer id);

	public void envoie_email(Collaborateur collaborateur);

//============gestion des mangers RH=========================

	public Collaborateur creat_managerRH(Collaborateur managerDto);
	public Collaborateur assign_to_mangerRH(Integer collaborateurId, Integer managerId);

//============ reporting =========================



}
