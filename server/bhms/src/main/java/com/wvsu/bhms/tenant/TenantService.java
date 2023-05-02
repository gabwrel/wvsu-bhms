package com.wvsu.bhms.tenant;

public interface TenantService {
    Tenant create(Tenant tenant);

    Tenant update(Tenant tenant);
}
