package ecole.gestionecole.tableModel;

public class UserTableModel {
    String username;
    String password;
//    private StringProperty username;
//    private StringProperty password;
//
//    public StringProperty usernameProperty(){
//        return this.username;
//    }
//    public StringProperty passwordProperty(){
//        return this.password;
//    }

    public UserTableModel(String username,String password){
        this.username= username;
        this.password= password;
    }

    public UserTableModel() {

    }
//
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//
//        public String getUsername() {
//        return this.username.get();
//    }
//
//    public void setUsername(String value) {
//        this.username.set(value);
//    }
//
//    public String getPassword() {
//        return password.get();
//    }
//
//    public void setPassword(String value) {
//        password.set(value);
//    }
}
