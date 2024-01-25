package DXvalley.AutomatedAgrofinancingBackend.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class FarmArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmAreaId;
    private String longitude;
    private  String latitude;
    private  String width ;
    private String height;

    @ManyToOne
    @JoinColumn(name = "farmer_Id")
    private Farmer farmer;

    public FarmArea(String longitude, String latitude, String width, String height){
        this.longitude=longitude;
        this.width= width;
        this.height= height;
        this.latitude = latitude;


    }

}
