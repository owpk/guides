package owpk.nostromo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import owpk.nostromo.entity.Rover;
import owpk.nostromo.entity.RoverRepository;


@Configuration
@Slf4j
public class NostromoConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommandLineRunner loadService(RoverRepository roverRepository) {
        return args -> {
            log.info("Nostromo Started");
            log.info("Data={}",roverRepository.save(new Rover("Rover", "Hoover")));
            log.info("Data={}",roverRepository.save(new Rover("Rover", "Trumpet")));
            log.info("Data={}",roverRepository.save(new Rover("Rover", "Spoont")));
            log.info("Data was loaded");
        };
    }
}
