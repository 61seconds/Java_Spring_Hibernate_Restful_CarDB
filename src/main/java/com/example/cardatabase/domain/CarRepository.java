package com.example.cardatabase.domain;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface CarRepository extends CrudRepository<Car, Long> {

    //Fetch cars by brand
//    List<Car> findByBrand(String brand);
//
//    //Fetch cars by color
//    List<Car> findByColor(String color);
//
//    //Fetch cars by year
//    List<Car> findByYear(int year);
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

