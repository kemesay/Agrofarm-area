package DXvalley.AutomatedAgrofinancingBackend.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

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
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<FarmArea> farmAreas = new ArrayList<>();

    public FarmingInput(String crop, String wateringMethod, String farmingSeason, String farmingMethod){
        this.farmingMethod = farmingMethod;
        this.farmingSeason = farmingSeason;
        this.crop = crop;
         this.wateringMethod = wateringMethod;

    }


}
