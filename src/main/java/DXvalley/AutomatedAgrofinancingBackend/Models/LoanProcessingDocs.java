package DXvalley.AutomatedAgrofinancingBackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class LoanProcessingDocs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanProcessingId;
    private  String spouseTinNum;
    private  String investmentLicence;
    private String  applicationLetter;
    private  String tradeCertificate;
    private  String taxClearanceCertificate;
    private String applicanttinNum;
    private  String marriageCertificatee;
    private String modelFarmerCertiricate;
    private  String collateral;
    private String auditReport;
    private  String financeStatement;
    private  String  assetList;
    private String  performaInvoice;
    private String projectTitle;
    private  String investmentAgreement;
    private String  others;
    private  String userName;
    private String landOwerCertificate;
    @OneToOne(cascade = CascadeType.ALL)
    private LoanApplicaton loanApplicaton;

    public LoanProcessingDocs(String spouseTinNum, String investmentLicence, String  applicationLetter, String tradeCertificate, String taxClearanceCertificate,
                              String applicanttinNum, String marriageCertificatee, String modelFarmerCertiricate, String collateral, String auditReport, String financeStatement,
                              String  assetList, String  performaInvoice, String projectTitle, String investmentAgreement, String  others, String userName, String landOwerCertificate){
        this.spouseTinNum=spouseTinNum;
        this.investmentLicence = investmentLicence;
        this.applicationLetter= applicationLetter;
        this.tradeCertificate = tradeCertificate;
        this.taxClearanceCertificate = taxClearanceCertificate;
        this.applicanttinNum = applicanttinNum;
        this.marriageCertificatee = marriageCertificatee;
        this.modelFarmerCertiricate =modelFarmerCertiricate;
        this.collateral= collateral;
        this.auditReport = auditReport;
        this.financeStatement = financeStatement;
        this.assetList = assetList;
        this.performaInvoice = performaInvoice;
        this.projectTitle=projectTitle;
        this.investmentAgreement=investmentAgreement;
        this.others=others;
        this.userName =userName;
        this.landOwerCertificate=landOwerCertificate;

    }

}
