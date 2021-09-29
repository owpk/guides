package owpk.nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import owpk.nostromo.dto.Planet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoverDiscoveryPlanet {

    @Autowired
    private RoverClient roverClient;

    @Autowired
    private RestTemplate restTemplate;

    public List<Planet> getDiscoveryPlanetList() {
        List<String> l = roverClient.getRoverURLs();
        List<Planet> planets = new ArrayList<>();
        for (String pl : l) {
            planets.add(restTemplate.getForObject(pl + "/discover/planet", Planet.class));
        }
        return planets;
    }
}
