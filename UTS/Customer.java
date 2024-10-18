public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String username, String password, String name, int age, String emailId, String doc, boolean verificationStatus) {
        super(userId, username, password, name, age, emailId, doc);
        this.verificationStatus = verificationStatus;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public String applyVerification(String doc) {
        String[] verification = {".jpg", ".png", ".pdf"};
        int i = 0;
        boolean isValid = false; 
    
        while (i < verification.length) {
            if (doc.endsWith(verification[i])) {
                isValid = true; 
                break; 
            }
            i++;
        }
    
        if (isValid) {
            verificationStatus = true;
            return "Dokumen verifikasi diajukan: " + doc + ". User terverifikasi.";
        } else {
            return "Dokumen tidak valid: " + doc + ". Silakan ajukan document dengan format (.jpg, .pdf, .png).";
        }
    }
}
