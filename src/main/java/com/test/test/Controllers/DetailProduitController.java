package com.test.test.Controllers;

import com.test.test.Services.IDetailProduitServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DetailProduit")
public class DetailProduitController {
    @Autowired
    IDetailProduitServicee dp;
}
