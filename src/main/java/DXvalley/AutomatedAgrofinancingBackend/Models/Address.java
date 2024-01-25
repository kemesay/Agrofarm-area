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

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private  String region;
    private String zone;
    private String city;
    private String subcity;
    private String woreda;
    private  String kebele;
    private String  phoneNum;
    private String ownerUserName;
    private  String houseNum;
        public Address(String region, String zone, String city, String ownerUserName, String subcity, String woreda, String kebele,  String phoneNum, String houseNum){
            this.region =region;
            this.zone =zone;
            this.city = city;
            this.ownerUserName=ownerUserName;
            this.subcity= subcity;
            this.woreda =woreda;
            this.kebele= kebele;
            this.phoneNum= phoneNum;
            this.houseNum= houseNum;
    }


}

