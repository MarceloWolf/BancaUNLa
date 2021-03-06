package com.marcelo.banca.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.banca.entities.Persona;


@Repository("personaRepository")
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
