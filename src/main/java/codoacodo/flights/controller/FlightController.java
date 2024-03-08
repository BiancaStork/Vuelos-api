package codoacodo.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import codoacodo.flights.model.Flight;
import codoacodo.flights.services.FlightService;


import java.util.List;






@RestController
@RequestMapping("/flights")

public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping()
    public List<Flight> getAll(){
        return flightService.allFlights();
    }

    @GetMapping("/{id}")
    public Flight getById(@PathVariable Long id){
        return flightService.flightById(id);
    }
    
    @PostMapping("/new")
    public void saveNew(@RequestBody Flight flight) {       
        flightService.newFlight(flight);
    }
    
   // @PutMapping("flight/{id}")
    // public Flight delete() {
               
    //    return FlightService.deleteFlight();
    // }
    
    


}