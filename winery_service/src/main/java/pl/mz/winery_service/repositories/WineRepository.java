package pl.mz.winery_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mz.winery_service.domain.Wine;

import java.util.UUID;

@Repository
public interface WineRepository extends JpaRepository<Wine, UUID> {

}
