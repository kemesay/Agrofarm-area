package DXvalley.AutomatedAgrofinancingBackend.Service;

import DXvalley.AutomatedAgrofinancingBackend.Models.Address;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface addressService {

    List<Address> fetchAddress();
    Address editAddress (Address address);
    ResponseEntity<?> registerAddress(Address address);
}
