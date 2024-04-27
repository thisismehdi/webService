package com.example.demo.Configuration;

import com.example.demo.Controllers.EtudiantSoapController;
import jakarta.xml.ws.Endpoint;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ConfigCxf {
    private Bus bus;
    private EtudiantSoapController etudiantSoapController;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,etudiantSoapController);
        endpoint.publish("/EtudiantService");
        return endpoint;
    }
}
