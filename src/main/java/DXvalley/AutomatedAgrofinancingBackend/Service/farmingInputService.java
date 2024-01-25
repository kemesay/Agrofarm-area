package DXvalley.AutomatedAgrofinancingBackend.Service;

import DXvalley.AutomatedAgrofinancingBackend.Models.FarmingInput;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface farmingInputService {
    List<FarmingInput> fetchFarmingInput();
    FarmingInput editFarmingInput (FarmingInput farmingInput);
    ResponseEntity<?> registerFarmingInput(FarmingInput farmingInput);
}
