import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin
        Admin admin = new Admin(211, "admin", "admin", "Bambang Mulyono", 30, "admin221@gmail.com", "admin.pdf");
        
        // Membuat objek Customer
        Customer customer1 = new Customer(455, "satriya", "satriya123", "Satriya Viar", 20, "satriya@gmail.com", "doc1.jpg", false);
        Customer customer2 = new Customer(456, "rizqi", "rizqi123", "Rizqi Dewanto", 20, "rizqi@gmail.com", "doc2.pdf", false);

        // Menampilkan opsi kepada pengguna
        System.out.println("=== Sistem ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Customer");
        System.out.print("Pilih opsi (1/2): ");
        int option = scanner.nextInt();
        System.out.println();
                                    
        if (option == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username admin: ");
            int user_ID = scanner.nextInt();
            System.out.print("Masukkan password admin: ");
            String password = scanner.next();
            boolean exitAdminMenu = false;

                if (user_ID == admin.getuser_ID() && password.equals(admin.getPassword())) {
                    System.out.println("Login Admin Berhasil!");
                    // Menampilkan profil
                    System.out.println();
                    System.out.println("Nama: " + admin.getName());
                    System.out.println("Usia: " + admin.getAge());
                    System.out.println("Email: " + admin.getEmail());

                    System.out.println();
                    while (!exitAdminMenu) {
                        System.out.println("Apa yang ingin Anda lakukan:");
                        System.out.println("1. Update Vehicle");
                        System.out.println("2. Add Vehicle");
                        System.out.println("3. Take Complain ");
                        System.out.println("4. Verification User");
                        System.out.println("5. Keluar dari menu admin");
                        System.out.print("Pilih opsi (1-5): ");
                        int opsi = scanner.nextInt();
                        System.out.println();
                        switch (opsi) {
                            case 1:
                                System.out.print("Masukkan ID kendaraan untuk update: ");
                                int vehicleId = scanner.nextInt();
                                System.out.println();
                                System.out.println(admin.updateVehicleDetails(vehicleId));
                                
                                break;
                            case 2:
                                // Menambah kendaraan
                                System.out.print("Masukkan ID kendaraan untuk ditambahkan: ");
                                int newVehicleId = scanner.nextInt();
                                System.out.println();
                                admin.addVehicle(newVehicleId);
                            
                                break;                        
                            case 3:
                                // Mengambil keluhan
                                System.out.println(admin.retrieveComplaint());
                            
                                break;
                            case 4: 
                                // Memverifikasi pengguna
                                System.out.print("Masukkan ID pengguna untuk verifikasi: ");
                                int userIdToVerify = scanner.nextInt();
                                System.out.println();
                                System.out.println(admin.verifyUser(userIdToVerify));
                                break;
                            case 5: 
                                exitAdminMenu = true;
                                break;

                            default: 
                                System.out.println("Tidak ada pilihan itu!");
                            }
                    }
                } else {
                    System.out.println("Login Gagal!");
                }
        } else if (option == 2) {
            // Login sebagai Customer
            System.out.print("Masukkan user ID Customer: ");
            int userId = scanner.nextInt();
            System.out.print("Masukkan password Customer: ");
            String password = scanner.next();

            // Simulasi login
            Customer currentCustomer = (userId == customer1.getuser_ID()) ? customer1 : (userId == customer2.getuser_ID()) ? customer2 : null;

            if (currentCustomer != null && currentCustomer.getPassword().equals(password)) {
                System.out.println("Login Customer Berhasil!");
                System.out.println();

                // Menampilkan profil
                System.out.println("Nama: " + currentCustomer.getName());
                System.out.println("Usia: " + currentCustomer.getAge());
                System.out.println("Email: " + currentCustomer.getEmail());
                System.out.println();

                // Mengajukan verifikasi
                System.out.print("Masukkan dokumen untuk verifikasi: ");
                String doc = scanner.next();
                System.out.println(currentCustomer.applyVerification(doc));
                System.out.println("Status Verifikasi: " + currentCustomer.getVerificationStatus());
                System.out.println();

            } else {
                System.out.println("Login Gagal!");
            }
        } else {
            System.out.println("Opsi tidak valid.");
        }
    }
}
