package com.test.test.Repositories;


import com.test.test.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    List<Facture> findByClientIdClient(Long idClient);
}
