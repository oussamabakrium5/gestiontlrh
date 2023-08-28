package com.fstg.gestion_tlrh.controller;



import com.fstg.gestion_tlrh.models.*;
import com.fstg.gestion_tlrh.service.CollaborateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("collaborateurs")
public class CollaborateurController {

    @Autowired
    /*les annotations @Data,@AllArgsConstructor,@NoArgsConstructor à éviter pour la class de la couche controleur et remplacer par @Autowired*/
    private CollaborateurServiceImpl collabService=new CollaborateurServiceImpl();


    @PostMapping("/hii")
    public ResponseEntity<String> sayHi() {
        return new ResponseEntity<>("<h1> Hello World !!!</h1>", HttpStatus.NOT_FOUND);
    }

    @PostMapping ("/save")
    public ResponseEntity<Collaborateur> saveCollab(@RequestBody() Collaborateur cl){
        return new ResponseEntity<>(collabService.save(cl), HttpStatus.CREATED);
    }

    @PostMapping ("/ajout")// chemin: /collaborateurs/ajout
    //dans la class controleur on va crée une autre fonction qui fait appele à la fonction précédante implémenté dans la class service
    //cette fonction prend les mémes paramétres et type de retourd que la premiére
    public ResponseEntity<Collaborateur> ajout_collab(@RequestBody() Collaborateur cl){
        return new ResponseEntity<>(collabService.Ajout_Collaborateur(cl), HttpStatus.CREATED);
    }

    @PostMapping ("/ajout-managerrh")
    public ResponseEntity<Collaborateur> ajout_managerrh(@RequestBody() Collaborateur cl){
        return new ResponseEntity<>(collabService.creat_managerRH(cl), HttpStatus.CREATED);
    }

    @PostMapping ("/affecter-managerrh")
    public ResponseEntity<Collaborateur> affecter_managerrh(Integer collaborateurId, Integer managerId){
        return new ResponseEntity<>(collabService.assign_to_mangerRH(collaborateurId,managerId), HttpStatus.CREATED);
    }
    @PutMapping("/modifier/{id}")/*pour update on utilise la methode @PutMapping() et pour delete on utilise @DeleteMapping() s'il s'agit
                                    pas d'une parmi ces deux et contient une partie dynamique on utilise @GetMapping sinon @PostMapping()*/
    public ResponseEntity<Collaborateur> modifier_collab(@RequestBody() Collaborateur cl,@PathVariable("id") Integer id){
        return new ResponseEntity<>(collabService.modifier_Collaborateur(cl,id),HttpStatus.ACCEPTED);
    }



}