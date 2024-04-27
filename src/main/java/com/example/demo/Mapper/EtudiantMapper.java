package com.example.demo.Mapper;

import com.example.demo.DTO.EtudiantDTO;
import com.example.demo.Entities.Etudiant;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Etudiant from(EtudiantDTO etudiantDTO){
        return modelMapper.map(etudiantDTO,Etudiant.class);
    }

  /*  public EtudiantDTO fromEtudiant(Etudiant etudiant){
        return modelMapper.map(etudiant,EtudiantDTO.class);
    }*/
}
