package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepository  extends JpaRepository<Address,Long> {
Address findByAddressId(long addressId);

}
