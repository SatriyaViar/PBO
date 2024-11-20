public class Main {
    public static void main(String[] args) {
        
        Player player1 = new Player("Knight", 5, 5, 100, 100, 0, 3);

        Monster goblin = new Monster("Goblin", 5, 5, 50, 3, "Green");
        Monster dragon = new Monster("Dragon", 10, 10, 200, 8, "Red");

        System.out.println(goblin.makeNoise()); 
        System.out.println(dragon.makeNoise()); 
        System.out.println();
        
        System.out.println("=== Player vs Goblin ===");
        goblin.TakeDamage(20); // Output terkait damage dan health Goblin
        goblin.TakeDamage(40); // Output ketika Goblin mati dan OnKilled() dipanggil
        System.out.println();
        
        System.out.println("=== Player vs Dragon ===");
        dragon.TakeDamage(50); // Tidak ada damage karena posisi tidak sesuai
        System.out.println();

        System.out.println("=== Monster vs Player ===");
        player1.TakeDamage(30); // Player menerima damage
        player1.TakeDamage(80); // Player mati dan kehilangan satu nyawa
        player1.TakeDamage(80); // Player kehilangan semua nyawa, dipanggil Despawn()
        System.out.println();

        System.out.println("Pertarungan selesai!");
    }
}
