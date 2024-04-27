package com.example.demo.Controllers;

import com.example.demo.DTO.EtudiantDTO;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Mapper.EtudiantMapper;
import com.example.demo.Repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class EtudiantQraphqlController {
    private EtudiantRepository etudiantRepository;
    private EtudiantMapper etudiantMapper;


    @QueryMapping
    public List<Etudiant> allEtudiants(){

        return etudiantRepository.findAll();
    }

    @QueryMapping
    public Etudiant etudiantById(@Argument Long id){
        return etudiantRepository.findById(id).get();
    }

    @MutationMapping
    public Etudiant saveEtudiant(@Argument EtudiantDTO etudiantDTO){
        Etudiant etudiant = etudiantMapper.from(etudiantDTO);
        return etudiantRepository.save(etudiant);
    }
}
