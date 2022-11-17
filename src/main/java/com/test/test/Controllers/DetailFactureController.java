package com.test.test.Controllers;



import com.test.test.Services.IDeteilFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DetailFacture")
public class DetailFactureController {
    @Autowired
    IDeteilFactureService df;
}
