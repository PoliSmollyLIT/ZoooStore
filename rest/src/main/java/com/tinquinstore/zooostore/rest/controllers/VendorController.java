package com.tinquinstore.zooostore.rest.controllers;

import com.tinquinstore.zooostore.api.operations.vendor.create.CreateVendorRequest;
import com.tinquinstore.zooostore.api.operations.vendor.edit.EditVendorRequest;
import com.tinquinstore.zooostore.core.operations.vendor.CreateVendorCore;
import com.tinquinstore.zooostore.core.operations.vendor.EditVendorCore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zoostore/vendor")
@Tag(name = "Zoostsore", description = "API for working with vendors")
@RequiredArgsConstructor
public class VendorController {
    private final CreateVendorCore createVendor;
    private final EditVendorCore editVendor;

    @PostMapping()
    @Operation(summary = "Create Vendor", description = "Creates a new Vendor")
    ResponseEntity createVendor( @Valid @RequestBody CreateVendorRequest vendorToCreate){
        return ResponseEntity.ok(createVendor.process(vendorToCreate));
    }

    @PutMapping()
    @Operation(summary = "Edit Vendor", description = "Edits existing Vendor")
    ResponseEntity editVendor( @Valid @RequestBody EditVendorRequest vendorToEdit)    {
        return ResponseEntity.ok(editVendor.process(vendorToEdit));
    }

}
