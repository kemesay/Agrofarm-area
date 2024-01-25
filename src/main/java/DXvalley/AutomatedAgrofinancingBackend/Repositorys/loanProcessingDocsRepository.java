package DXvalley.AutomatedAgrofinancingBackend.Repositorys;

import DXvalley.AutomatedAgrofinancingBackend.Models.LoanProcessingDocs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loanProcessingDocsRepository extends JpaRepository<LoanProcessingDocs, Long> {
    LoanProcessingDocs findByLoanProcessingId(Long loanProcessingId);
}
