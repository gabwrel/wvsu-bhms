package com.wvsu.bhms.tenant;

import com.wvsu.bhms.BhmsApplicationTests;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

public class TenantResourceIntegrationTest extends BhmsApplicationTests {

    @Autowired
    private RestTemplate restTemplate;
    @LocalServerPort
    private int port;

    @Test
    public void create() {
        Tenant tenant = buildTenant();
        String url = "http://localhost:" + port + "/tenant/create";
        Tenant saved = restTemplate.postForObject(url, tenant, Tenant.class);
        System.out.println(saved);
    }

    private static Tenant buildTenant() {
        Tenant tenant = new Tenant();
        tenant.setFirstName(RandomString.make());
        tenant.setLastName(RandomString.make());
        return tenant;
    }
}
