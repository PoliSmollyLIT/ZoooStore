package com.example.zooostore.controllers;

import com.example.zooostore.dto.ItemInput;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/zoostore")
public class ItemServiceController {


    @PostMapping("/item/create")
    ResponseEntity createItem(@RequestBody ItemInput itemToCreate){
        return ResponseEntity.ok("Succssess");
    }
}
