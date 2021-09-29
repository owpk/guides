package owpk.nostromo.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import owpk.nostromo.dto.Planet;
import owpk.nostromo.entity.Rover;
import owpk.nostromo.service.RoverClient;
import owpk.nostromo.service.RoverDiscoveryPlanet;
import owpk.nostromo.service.RoverService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
public class RoverController {
    @Autowired
    private final RoverService roverService;
    @Autowired
    private final RoverClient roverClient;
    @Autowired
    private final RoverDiscoveryPlanet roverDiscovery;

    @RequestMapping(value = "/rover/all",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers() {
        return roverService.getAllRovers();
    }

    @RequestMapping(value = "/rover/available",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<String> getAvailableRovers() {
        return roverClient.getRoverURLs();
    }

    @RequestMapping(value = "/rover/discover",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public List<Planet> discoverPlanets() {
        return roverDiscovery.getDiscoveryPlanetList();
    }
}
