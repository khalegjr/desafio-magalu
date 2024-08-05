package dev.khaled.magalums.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.khaled.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {


}
