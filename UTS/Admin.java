public class Admin extends User {
    public Admin(int userId, String username, String password, String name, int age, String emailId, String doc) {
        super(userId, username, password, name, age, emailId, doc);
        
    }

    public String updateVehicleDetails(int vehicleId) {
        switch (vehicleId) {
            case 1:
                System.out.println("Toyota Ayla 2010");
                System.out.println("Mesin Bagus");
                System.out.println("Ban Ori");
                break;
            case 2:
                System.out.println("Supra Gt 2010");
                System.out.println("Mesin Bagus");
                System.out.println("Ban Ori");
            default:
                break;
        }
        return "Vehicle details :  " + vehicleId + " updated";
    }

    public void addVehicle(int vehicle_id) {

        if (vehicle_id <= 2) {
            switch (vehicle_id) {
                case 1:
                    System.out.println("Toyota Ayla 2018");
                    break;
                
                case 2:
                    System.out.println("Supra GT 2019 ");
                    break;

                default:
                    break;
            }
            System.out.println("Vehicle added"); 
        }else{
            System.out.println("Vehicle Id salah coba lagi");
        }
    }

    public String retrieveComplaint() {
        return "Complaint Diterima";
    }

    public String verifyUser(int userId) {
        if (userId == 1) {
            return "Satriya Viar telah terverifikasi.";
        } else if (userId == 2) {
            return "Rizqi Dewanto telah terverifikasi.";
        } else {
            return "User tidak ditemukan.";
        }
    }
}
