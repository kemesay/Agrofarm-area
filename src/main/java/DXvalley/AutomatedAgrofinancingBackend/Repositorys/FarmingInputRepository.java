package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.FarmingInput;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmingInputRepository extends JpaRepository<FarmingInput, Long> {
    FarmingInput findByFarmingInputId( long farmingInputId);
}
