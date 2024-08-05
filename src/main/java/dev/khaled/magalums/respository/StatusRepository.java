package dev.khaled.magalums.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.khaled.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
