/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2Ciclo4.repositorio;

import Reto2Ciclo4.modelo.Cosmetic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2Ciclo4.interfaces.InterfaceCosmetic;

/**
 *
 * @author WINDOWS
 */
@Repository
public class RepositorioCosmetic {
    @Autowired
    private InterfaceCosmetic repository;

    public List<Cosmetic> getAll() {
        return repository.findAll();
    }

    public Optional<Cosmetic> getCosmetic(String reference) {
        return repository.findById(reference);
    }
    public Cosmetic create(Cosmetic cosmetic) {
        return repository.save(cosmetic);
    }

    public void update(Cosmetic cosmetic) {
        repository.save(cosmetic);
    }
    
    public void delete(Cosmetic cosmetic) {
        repository.delete(cosmetic);
    }
}
