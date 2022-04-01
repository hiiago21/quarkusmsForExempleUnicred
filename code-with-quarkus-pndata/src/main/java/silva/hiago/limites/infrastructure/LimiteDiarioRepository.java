package silva.hiago.limites.infrastructure;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import silva.hiago.limites.model.LimiteDiarioEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Optional;

@ApplicationScoped
public class LimiteDiarioRepository implements PanacheRepository<LimiteDiarioEntity> {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public Optional<LimiteDiarioEntity> buscarLimiteDiario(final Long codigoAgencia, final Long codigoConta) {
        return buscarLimitePorData(codigoAgencia, codigoConta, LocalDate.now());
    }

    public Optional<LimiteDiarioEntity> buscarLimitePorData(final Long codigoAgencia, final Long codigoConta, final LocalDate data) {
        TypedQuery<LimiteDiarioEntity> query = em.createNamedQuery("LimiteDiario.findByAgenciaAndConta", LimiteDiarioEntity.class);
        query.setParameter("agencia", codigoAgencia);
        query.setParameter("conta", codigoConta);
        query.setParameter("data", data);
        return query.getResultStream().findFirst();

    }

}
