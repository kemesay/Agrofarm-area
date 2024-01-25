package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.LoanApplicaton;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loanApplicationRepository extends JpaRepository<LoanApplicaton, Long> {
    LoanApplicaton findByLoanApplicationId (Long loanApplicationId);
}
