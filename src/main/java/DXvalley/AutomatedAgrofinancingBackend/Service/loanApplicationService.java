package DXvalley.AutomatedAgrofinancingBackend.Service;

import DXvalley.AutomatedAgrofinancingBackend.Models.LoanApplicaton;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface loanApplicationService {
    List<LoanApplicaton> fetchLoanApplicaton();
    LoanApplicaton editLoanApplicaton (LoanApplicaton loanApplicaton);
    ResponseEntity<?> registerLoanApplicaton(LoanApplicaton loanApplicaton);
}
