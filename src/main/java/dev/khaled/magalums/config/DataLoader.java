package dev.khaled.magalums.config;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import dev.khaled.magalums.entity.Channel;
import dev.khaled.magalums.entity.Status;
import dev.khaled.magalums.respository.ChannelRepository;
import dev.khaled.magalums.respository.StatusRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
public class DataLoader implements CommandLineRunner {

    private final ChannelRepository channelRepository;
    private final StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values())
            .map(Channel.Values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.Values.values())
            .map(Status.Values::toStatus)
            .forEach(statusRepository::save);
    }


}
