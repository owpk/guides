package owpk.rover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import owpk.rover.dto.Planet;
import owpk.rover.service.RandomizerService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class DiscoverController {

    private final RandomizerService randomizerService;

    @Autowired
    public DiscoverController(RandomizerService randomizerService) {
        this.randomizerService = randomizerService;
    }

    @RequestMapping(value = "/discover/planet",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public Planet discover() {
        return randomizerService.getPlanet();
    }
}
