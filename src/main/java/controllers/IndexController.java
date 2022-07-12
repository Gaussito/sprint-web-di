package controllers;


import models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MiServicio servicio = new MiServicio();

    @GetMapping()
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

}