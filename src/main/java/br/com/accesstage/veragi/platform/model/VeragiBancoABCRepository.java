package br.com.accesstage.veragi.platform.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface VeragiBancoABCRepository extends CrudRepository<VeragiBancoABC, Long> {
}
