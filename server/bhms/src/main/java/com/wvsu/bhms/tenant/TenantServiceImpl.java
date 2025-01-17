package com.wvsu.bhms.tenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TenantServiceImpl implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public Tenant create(Tenant tenant) {
        Tenant existing = findTenantByFirstNameAndLastName(tenant);
        if (existing != null) {
            throw new IllegalStateException("Tenant already exist.");
        }
        return tenantRepository.save(tenant);
    }

    @Override
    public Tenant update(Tenant tenant) {
        Tenant existingById = checkTenantIdIfExisting(tenant);
        Tenant existingByFirstNameAndLastName = findTenantByFirstNameAndLastName(tenant);
        Tenant existing = checkTenantNameIfAlreadyExisting(existingById, existingByFirstNameAndLastName);
        if (existing != null) {
            return existing;
        }
        existingById.setFirstName(tenant.getFirstName());
        existingById.setLastName(tenant.getLastName());

        return tenantRepository.save(tenant);
    }

    @Override
    public void delete(long id) {
        tenantRepository.deleteById(id);
    }

    @Override
    public Tenant findById(long id) {
        Optional<Tenant> found = tenantRepository.findById(id);
        return found.orElse(null);
    }

    private static Tenant checkTenantNameIfAlreadyExisting(Tenant existingById, Tenant existingByFirstNameAndLastName) {
        if (existingByFirstNameAndLastName != null) {
            if (existingById.getId() != existingByFirstNameAndLastName.getId()) {
                throw new IllegalStateException("Tenant name already exist.");
            }
            return existingById;
        }
        return null;
    }

    private Tenant findTenantByFirstNameAndLastName(Tenant tenant) {
        return tenantRepository.findFirstByFirstNameAndLastName(
                tenant.getFirstName(), tenant.getLastName());
    }

    private Tenant checkTenantIdIfExisting(Tenant tenant) {
        Optional<Tenant> existingById = tenantRepository.findById(tenant.getId());
        if (existingById.isEmpty()) {
            throw new IllegalStateException("Tenant ID does not exist");
        }
        return existingById.get();
    }
}
