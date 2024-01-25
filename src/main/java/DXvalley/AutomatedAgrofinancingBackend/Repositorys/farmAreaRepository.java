package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.FarmArea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface farmAreaRepository extends JpaRepository<FarmArea, Long> {
        FarmArea findByFarmAreaId(long farmAreaId);

        }
