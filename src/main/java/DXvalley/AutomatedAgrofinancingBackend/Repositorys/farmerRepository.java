package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface farmerRepository extends JpaRepository<Farmer, String > {

    Farmer findByBankAccountNum(Farmer bankAccountNum);

}
