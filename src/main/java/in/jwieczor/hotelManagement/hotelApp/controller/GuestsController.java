package in.jwieczor.hotelManagement.hotelApp.controller;


import java.util.List;

import in.jwieczor.hotelManagement.hotelApp.model.Guests;
import in.jwieczor.hotelManagement.hotelApp.service.GuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class GuestsController {


    @Autowired
    private GuestsService guestsService;

    @PostMapping("/guests")
    public Guests save(@RequestBody Guests guestsObj) {
        guestsService.save(guestsObj);
        return guestsObj;
    }

    @GetMapping("/employee")
    public List<Guests> get(){
        return guestsService.get();
    }

    @GetMapping("/employee/{id}")
    public Guests get(@PathVariable int id) {
        Guests guestsObj = guestsService.get(id);
        if(guestsObj == null) {
            throw new RuntimeException("Employee not found for the Id:"+id);
        }
        return guestsObj;
    }

    @PutMapping("/employee")
    public Guests update(@RequestBody Guests guestsObj) {
        guestsService.save(guestsObj);
        return guestsObj;
    }

    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id) {
        guestsService.delete(id);
        return "Employee has been deleted with id:"+id;
    }

}
