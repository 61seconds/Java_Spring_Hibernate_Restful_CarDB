package com.example.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    //TO BE IMPLEMENTED


    //Fetch cars by brand
    List<Owner> findByLastName(@Param("lastname") String lastNAME);
//
}


