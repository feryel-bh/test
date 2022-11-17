package com.test.test.Controllers;

import com.test.test.Entities.Stock;
import com.test.test.Services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    IStockService SS;
    @GetMapping("/affiche")
    public List<Stock> retrieveAllStocks(){return  SS.retrieveAllStocks();}
    @PostMapping("/add")
    public Stock addStock(@RequestBody Stock s) {return SS.addStock(s);}
    @PutMapping("/update")
    public Stock updateStock(@RequestBody Stock u) {return  SS.updateStock(u);}
    @GetMapping("/affiche/{id}")
    public Stock retrieveStock(@RequestBody Long id){return SS.retrieveStock(id);}
}
