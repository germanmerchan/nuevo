/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2Ciclo4.servicio;

import Reto2Ciclo4.modelo.Cosmetic;
import Reto2Ciclo4.repositorio.RepositorioCosmetic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author WINDOWS
 */
@Service
public class ServiceCosmetic {
    @Autowired
private RepositorioCosmetic cosmeticRepository;

    public List<Cosmetic> getAll() {
        return cosmeticRepository.getAll();
    }

   public Optional<Cosmetic> getCosmetic(String reference) {
        return cosmeticRepository.getCosmetic(reference);
    }

    public Cosmetic  create(Cosmetic accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return cosmeticRepository.create(accesory);
        }
    }

    public Cosmetic  update(Cosmetic  accesory) {

        if (accesory.getReference() != null) {
            Optional<Cosmetic> accesoryDb = cosmeticRepository.getCosmetic(accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                cosmeticRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getCosmetic(reference).map(accesory -> {
            cosmeticRepository.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}
