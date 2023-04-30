package com.example.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;

/**
*
* @author Vidya Rajarajeswari Gummadi s554047
*/

public interface DogRepository extends CrudRepository<Dog, Integer>{
List<Dog> findByName(String name);
}
