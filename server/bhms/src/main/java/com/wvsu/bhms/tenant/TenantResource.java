package com.wvsu.bhms.tenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tenant")
public class TenantResource {

    @Autowired
    private TenantService tenantService;

    @PostMapping("/create")
    Tenant create(@RequestBody Tenant tenant) {
        return tenantService.create(tenant);
    }
}
