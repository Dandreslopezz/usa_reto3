package com.usa.ciclo3.reto.repository;

import com.usa.ciclo3.reto.crudrepository.BoxCrudRepository;
import com.usa.ciclo3.reto.model.Box;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BoxRepository {
    @Autowired
    private BoxCrudRepository boxCrudRepository;

    public List<Box> getAll() {
        return (List<Box>) boxCrudRepository.findAll();
    }

    public Optional<Box> getBox(int id) {
        return boxCrudRepository.findById(id);
    }

    public Box save(Box box) {
        return boxCrudRepository.save(box);
    }

    public void delete(Box box) {
        boxCrudRepository.delete(box);
    }
}