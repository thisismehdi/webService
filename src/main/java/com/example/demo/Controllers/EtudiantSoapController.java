package com.example.demo.Controllers;

import com.example.demo.DTO.EtudiantDTO;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Mapper.EtudiantMapper;
import com.example.demo.Repositories.EtudiantRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService(serviceName = "EtudiantWebService")
public class EtudiantSoapController {
    private EtudiantRepository etudiantRepository;
    private EtudiantMapper etudiantMapper;

    @WebMethod
    public List<Etudiant> etudiantList(){
        return etudiantRepository.findAll();
    }

    @WebMethod
    public Etudiant etudiantById(@WebParam(name="id") Long id){
        return etudiantRepository.findById(id).get();
    }

    @WebMethod
    public Etudiant saveEtudiant(@WebParam EtudiantDTO etudiantDTO){
        Etudiant etudiant = etudiantMapper.from(etudiantDTO);
        return etudiantRepository.save(etudiant);
    }
}
