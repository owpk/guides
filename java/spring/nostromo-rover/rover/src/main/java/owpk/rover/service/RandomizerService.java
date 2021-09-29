package owpk.rover.service;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;
import owpk.rover.dto.Planet;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class RandomizerService {
    private Map<Integer, Planet> planetMap;
    private final String[] planets = {"Mars", "Venus", "Uranus", "Earth", "Jupiter"};


    @PostConstruct
    public void fillPlanetMap() {
        planetMap = new HashMap<>();
        for (int i = 0; i < planets.length; i++) {
            planetMap.put(i, new Planet(planets[i]));
        }
    }

    public Planet getPlanet() {
        return planetMap.get(RandomUtils.nextInt(planets.length));
    }
}
