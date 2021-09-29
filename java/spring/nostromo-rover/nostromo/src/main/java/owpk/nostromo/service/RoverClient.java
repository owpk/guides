package owpk.nostromo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoverClient {

    @Autowired
    private DiscoveryClient discoveryClient;


    public List<String> getRoverURLs() {
        return discoveryClient.getInstances("rover")
                .stream()
                .map(ServiceInstance::getUri)
                .map(URI::toString)
                .collect(Collectors.toList());
    }
}
