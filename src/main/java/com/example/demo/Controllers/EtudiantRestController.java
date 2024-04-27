package com.example.demo.Controllers;

import com.example.demo.DTO.EtudiantDTO;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Mapper.EtudiantMapper;
import com.example.demo.Repositories.EtudiantRepository;
import com.sun.source.tree.LabeledStatementTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    private EtudiantRepository etudiantRepository;
    private EtudiantMapper etudiantMapper;

    @GetMapping("/Etudiants")
    public List<Etudiant> etudiantList(){
        return etudiantRepository.findAll();
    }

        @GetMapping("/Etudiants/{id}")
    public Etudiant etudiantById(@PathVariable Long id){
        return etudiantRepository.findById(id).get();
    }

    @PostMapping("/Etudiants")
    public Etudiant saveEtudiant(@RequestBody EtudiantDTO etudiantDTO){
        Etudiant etudiant = etudiantMapper.from(etudiantDTO);
        return etudiantRepository.save(etudiant);
    }
}
