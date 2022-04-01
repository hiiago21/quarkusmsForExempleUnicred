package silva.hiago.pessoas.business;

import silva.hiago.pessoas.infrastructure.PessoaRepository;
import silva.hiago.pessoas.model.PessoaEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class PessoaService {

    @Inject
    private PessoaRepository repository;

    public Optional<PessoaEntity> findById(Long id) {
        return repository.findById(id);
    }

}
