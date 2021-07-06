package com.capgemini.cursusApp.Service;


import com.capgemini.cursusApp.Cursus;
import com.capgemini.cursusApp.repository.CursusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursusService {

    CursusRepository cursusRepository;

    public CursusService(){}


    @Autowired
    public CursusService(CursusRepository cursusRepository){this.cursusRepository=cursusRepository;}

    public List<Cursus> getAllCursus(){
        List<Cursus> cursuses=cursusRepository.getAllCursus();
        return cursuses;
    }

    public Cursus createCursus(Cursus newcursus){
        Cursus cursus=cursusRepository.createCursus(newcursus);
        return cursus;
    }

    public Cursus getCursusById(Integer id){
        Cursus cursus=cursusRepository.getCursusById(id);
        return cursus;
    }

    public Cursus deleteCursus(Integer id){
        Cursus cursus=cursusRepository.deleteCursus(id);
        return cursus;
    }


}

