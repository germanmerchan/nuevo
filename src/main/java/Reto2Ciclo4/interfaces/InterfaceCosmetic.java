/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2Ciclo4.interfaces;

import Reto2Ciclo4.modelo.Cosmetic ;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author WINDOWS
 */
public interface InterfaceCosmetic extends MongoRepository<Cosmetic, String> {
    
}
