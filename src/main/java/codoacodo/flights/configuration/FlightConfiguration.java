package codoacodo.flights.configuration;

import codoacodo.flights.models.Dolar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration

public class FlightConfiguration {
    @Bean  //componente dentro de un componente

    public RestTemplate restTemplate(){
        return new RestTemplate();

    }

    public Dolar FetchDolar(){
        RestTemplate restTemplate = restTemplate();
        String apiUrl = "https://dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiUrl, Dolar.class);
    }

}
