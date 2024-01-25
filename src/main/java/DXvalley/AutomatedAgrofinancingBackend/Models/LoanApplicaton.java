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
public class LoanApplicaton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanApplicationId;
    private  String applicationDate;
    private  String userName;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Farmer> farmers = new ArrayList<>();
    private  String description;
    public LoanApplicaton(String description, String userName, String applicationDate){
        this.applicationDate=applicationDate;
        this.userName=userName;
        this.description = description;

    }

}
