package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.FicheNote;
import ci.digitalacademy.monetab.repositories.FicheNoteRepository;
import ci.digitalacademy.monetab.services.FicheNoteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class FicheNoteServiceImpl implements FicheNoteService {

    private final FicheNoteRepository ficheNoteRepository;


    /**
     * @param ficheNote
     * @return
     */
    @Override
    public FicheNote save(FicheNote ficheNote) {
        return null;
    }

    /**
     * @param ficheNote
     * @return
     */
    @Override
    public FicheNote update(FicheNote ficheNote) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<FicheNote> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<FicheNote> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
