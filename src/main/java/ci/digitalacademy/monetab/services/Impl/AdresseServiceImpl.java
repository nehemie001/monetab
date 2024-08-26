package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.repositories.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class AdresseServiceImpl implements AdresseService {

    private final AdresseRepository adresseRepository;

    /**
     * @param adresse
     * @return
     */
    @Override
    public Adresse save(Adresse adresse) {
        return adresseRepository.save(adresse);
    }

    /**
     * @param adresse
     * @return
     */
    @Override
    public Adresse update(Adresse adresse) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Adresse> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Adresse> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
