package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.models.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {

    Adresse save(Adresse adresse);

    Adresse update(Adresse adresse);

    Optional<Adresse> findOne(Long id);

    List<Adresse> findAll();

    void delete(Long id);
}
