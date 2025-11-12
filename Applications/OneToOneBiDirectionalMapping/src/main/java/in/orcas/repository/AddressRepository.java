package in.orcas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.orcas.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
