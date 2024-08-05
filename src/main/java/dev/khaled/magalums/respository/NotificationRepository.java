package dev.khaled.magalums.respository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.khaled.magalums.entity.Notification;
import dev.khaled.magalums.entity.Status;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime localDateTime);
}
