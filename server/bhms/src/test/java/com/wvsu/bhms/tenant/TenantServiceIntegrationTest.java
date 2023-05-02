package com.wvsu.bhms.tenant;

import com.wvsu.bhms.BhmsApplicationTests;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class TenantServiceIntegrationTest extends BhmsApplicationTests {

    @Autowired
    private TenantService tenantService;

    @Test
    public void create() {
        Tenant saved = tenantService.create(buildTenant());
        System.out.println(saved);
        assertNotNull(saved);
    }

    @Test
    public void createExisting() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            Tenant tenant = new Tenant();
            tenant.setFirstName("Java");
            tenant.setLastName("Woki");
            tenantService.create(tenant);
        });
        assertEquals("Tenant already exists.", exception.getMessage());
    }

    @Test
    public void update() {
        Tenant tenant = buildTenant();
        tenant.setId(52);
        Tenant saved = tenantService.update(tenant);
        System.out.println(saved);
        assertNotNull(saved);
    }

    private static Tenant buildTenant() {
        Tenant tenant = new Tenant();
        tenant.setFirstName(RandomString.make());
        tenant.setLastName(RandomString.make());
        return tenant;
    }
}
