package DXvalley.AutomatedAgrofinancingBackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmerId;
    private String bankAccountNum;
    private  String landCertificate;
    private  String farmerUserName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    public Farmer(String landCertificate,String farmerUserName, String bankAccountNum){
        this.bankAccountNum=bankAccountNum;
        this.landCertificate=landCertificate;
        this.farmerUserName=farmerUserName;

    }

}
