package pl.mz.winery_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mz.winery_service.domain.Wine;

import java.util.UUID;

public interface WineRepository extends JpaRepository<Wine, UUID> {

}
