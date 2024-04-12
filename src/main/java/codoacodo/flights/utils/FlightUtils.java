package codoacodo.flights.utils;

import codoacodo.flights.model.Flight;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component /*con esta anotacion le dijo que se trata de un componente */

public class FlightUtils {
    
    public List<Flight> detectedOffers(List<Flight> flightList, double offerPrice){
        List<Flight> offers = new ArrayList<>();
       offers= flightList.stream()
            .filter(f -> f.getPrice() <= offerPrice)  // aplicamos el filtro para mantener solo los vuelos cuyo precio es menor o igual
            //recopilamos los resultados en una nueva lista con
            .collect(Collectors.toList());
       return offers;


    }
}