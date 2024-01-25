package DXvalley.AutomatedAgrofinancingBackend.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class FarmingInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmingInputId;
    private String crop;
    private String wateringMethod;
    private String farmingSeason;
    private String farmingMethod;
    public FarmingInput(String crop, String wateringMethod, String farmingSeason, String farmingMethod){
        this.farmingMethod = farmingMethod;
        this.farmingSeason = farmingSeason;
        this.crop = crop;
         this.wateringMethod = wateringMethod;

    }


}
