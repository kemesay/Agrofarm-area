package DXvalley.AutomatedAgrofinancingBackend.Service;

import DXvalley.AutomatedAgrofinancingBackend.Models.FarmArea;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface farmAreaService {
    List<FarmArea> fetchFarmArea();
    FarmArea editFarmArea (FarmArea farmArea);
    ResponseEntity<?> registerFarmArea(FarmArea farmArea);
}
