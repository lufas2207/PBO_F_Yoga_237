// ================= Subclass Admin =================
class Admin extends User {  // inheritance
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) { //construktor
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Login Admin Berhasil ===");
        super.displayInfo();
        System.out.println("Username: " + username);
    }
}
