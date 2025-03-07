package com.rest.api.crud_ops.controller;

import com.rest.api.crud_ops.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couldVendor")
public class CloudVendorAPIService {

    CloudVendor vendor;
    @GetMapping("/{vendorId}")
    public CloudVendor getVendorDetails(String vendorId){

        //return new CloudVendor("C1","Vendor 1","Address One","12345");
        return vendor;
    }

    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor vendor){

        this.vendor=vendor;
        return "Cloud vendor created successfully";
    }
}
