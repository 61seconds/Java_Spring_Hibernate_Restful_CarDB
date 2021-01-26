package com.example.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {



    //Fetch cars by brand
    List<Car> findByBrand(@Param("brand") String brand);
//
//    //Fetch cars by color
    List<Car> findByColor(@Param("color") String color);
//
//    //Fetch cars by year
    List<Car> findByYear(@Param("year") int year);
//
//    //Fetch cars by year and brand
//    List<Car> findByYearAndBrand(int year, String brand);
//
//    //Fetch cars by brand and order by year
//    List<Car> findPriceOrderByYear(int price, int year);
//
//    //Fetch cars by brand and order by year
//    List<Car> findByBrandOrderByYearAsc(String brand);

    //Fetch cars by brand using SQL
//    @Query("select c from Car c where c.brand = ?1")
//    List<Car> findByBrandFromSQL(String brand);

}

