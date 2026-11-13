public class User {
    private String nama; // modifier private
    private String email;  // modifier private

    public User(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void setNama(String nama){
        this.nama = nama;
    } // metode setter

    public String getNama(){
        return nama; 
    } // metode getter

    public void setEmail(String email){
        this.email = email;
    } // metode setter

    public String getEmail(){
        return email;
    }  // metode getter

     public String info() {
        return "Nama: " + nama + " | Email: " + email;
    }
}