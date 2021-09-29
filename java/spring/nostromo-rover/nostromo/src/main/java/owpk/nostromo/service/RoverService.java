package owpk.nostromo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owpk.nostromo.entity.Rover;
import owpk.nostromo.entity.RoverRepository;

import java.util.List;

@Service
@Slf4j
public class RoverService {

    private final RoverRepository roverRepository;

    public List<Rover> getAllRovers() {
        log.info("get all rovers");
        return roverRepository.findAll();
    }

    @Autowired
    public RoverService(RoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }
}
