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
public class FarmArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmAreaId;
    private String longitude;
    private  String latitude;
    private  String width ;
    private String height;
    private String landCertificate;

    public FarmArea(String longitude, String latitude, String width, String height, String landCertificate){
        this.longitude=longitude;
        this.width= width;
        this.height= height;
        this.latitude = latitude;
        this.landCertificate = landCertificate;

    }

}
