package com.capgemini.cursusApp.controller;


import com.capgemini.cursusApp.Cursus;
import com.capgemini.cursusApp.Service.CursusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class CursusController {

    @Autowired
    CursusService cursusService;

    public CursusController(){}

    @Autowired
    public CursusController(CursusService cursusService){
        this.cursusService=cursusService;
    }

    @GetMapping(value = "/cursuses",produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Cursus>> getAllCursus(){                     //All cursus list
        List<Cursus> cursuses=cursusService.getAllCursus() ;
    return new ResponseEntity<List<Cursus>>(cursuses, HttpStatus.OK);
    }

    @GetMapping(value = "/cursus/{id}",produces = "application/json")          //call only one cursus
    @ResponseBody
    public ResponseEntity<Cursus> getCursusById( @PathVariable (name = "id",required = true) Integer id){
        Cursus cursus=cursusService.getCursusById(id);
        return new ResponseEntity<Cursus>(cursus,HttpStatus.OK);
    }

    @DeleteMapping(value = "/cursus/delete/{id}",produces = "applicaton/json")     //delete a cursus
    public ResponseEntity<Cursus> deleteCursus(Integer id){
        Cursus cursus=cursusService.deleteCursus(id);
        return new ResponseEntity<Cursus>(cursus,HttpStatus.OK);

    }

    @PutMapping(value = "/cursus/add")                                 //create new cursus
    public ResponseEntity<Cursus> createCursus(Cursus newcursus){
        Cursus cursus=cursusService.createCursus(newcursus);
        return new ResponseEntity<Cursus>(cursus,HttpStatus.OK);
    }




}
