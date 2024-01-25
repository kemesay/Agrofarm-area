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
public class LoanApplicaton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanApplicationId;
    private  String applicationDate;
    private  String userName;
    private  String description;
    public LoanApplicaton(String description, String userName, String applicationDate){
        this.applicationDate=applicationDate;
        this.userName=userName;
        this.description = description;

    }

}
