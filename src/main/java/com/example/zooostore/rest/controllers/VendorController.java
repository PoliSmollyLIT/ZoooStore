package com.example.zooostore.rest.controllers;

import com.example.zooostore.api.operations.vendor.create.CreateVendorRequest;
import com.example.zooostore.api.operations.vendor.edit.EditVendorRequest;
import com.example.zooostore.core.operations.vendor.CreateVendorImpl;
import com.example.zooostore.core.operations.vendor.EditVendorImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoostore/vendor")
@Tag(name = "Zoostsore", description = "API for working with vendors")
@RequiredArgsConstructor
public class VendorController {
    private final CreateVendorImpl createVendor;
    private final EditVendorImpl editVendor;

    @PostMapping("/create")
    @Operation(summary = "Create Vendor", description = "Creates a new Vendor")
    ResponseEntity createVendor(@RequestBody CreateVendorRequest vendorToCreate){
        return ResponseEntity.ok(createVendor.process(vendorToCreate));
    }

    @PostMapping("/edit")
    @Operation(summary = "Edit Vendor", description = "Edits existing Vendor")
    ResponseEntity editVendor(@RequestBody EditVendorRequest vendorToEdit)    {
        return ResponseEntity.ok(editVendor.process(vendorToEdit));
    }

}
