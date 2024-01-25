package DXvalley.AutomatedAgrofinancingBackend.Service;

import DXvalley.AutomatedAgrofinancingBackend.Models.LoanProcessingDocs;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface loanProcessingDocsService {
    List<LoanProcessingDocs> fetchLoanProcessingDocs();
    LoanProcessingDocs editLoanProcessingDocs (LoanProcessingDocs loanProcessingDocs);
    ResponseEntity<?> registerBank(LoanProcessingDocs loanProcessingDocs);
}
