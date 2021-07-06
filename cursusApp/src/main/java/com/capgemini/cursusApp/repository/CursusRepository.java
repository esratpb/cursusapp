package com.capgemini.cursusApp.repository;


import com.capgemini.cursusApp.Cursus;
import com.capgemini.cursusApp.controller.DateTimeController;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class CursusRepository {
    List<Cursus> cursuses=new ArrayList<>();

    public CursusRepository(){

        Cursus cursus=new Cursus();

        cursuses.add(new Cursus(0,"Java Basics","Niveau 100","Jan de Vries", "02-06-2021","10-08-2021","continue"));
        cursuses.add(new Cursus(1,"Java Advanced","Niveau 200","Bas de Hoop", "02-06-2021","10-09-2021","continue"));

    }

    public List<Cursus> getAllCursus(){return cursuses;}      //All cursus list

    public Cursus createCursus(Cursus cursus){              //Add new cursus
        cursuses.add(cursus);
        return cursus;
    }


    public Cursus getCursusById(Integer id){            //call a cursus with id
        Cursus cursus=new Cursus();
        for(Cursus cursus1:cursuses){
            if (cursus1.getId()==id){
                cursus=cursus1;
                break;
            }
            else{
                cursus=null;
            }
        }
        return cursus;

    }

    public Cursus deleteCursus(Integer id){                 //Delete a cursus
        Cursus cursus=new Cursus();
        for(Cursus cursus1:cursuses){
            if (cursus1.getId()==id){
                cursuses.remove(cursus1);
                cursus=cursus1;
                break;
            }
            else{
                cursus=null;
            }
        }
        return cursus;
    }

    //Update metode??
}
