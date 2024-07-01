package org.example.gestion_film_front_end.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/show")
    public void show (){
        System.out.println("show");
    }
}
