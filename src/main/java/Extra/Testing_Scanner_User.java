package extra;

public class Testing_Scanner_User {

    private int userAge, id, userPhone;
    private String userName;

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public Testing_Scanner_User(int customAge, String customName, int customID, int customUserPhone) {
        userAge = customAge;
        userName = customName;
        id = customID;
        userPhone = customUserPhone;
    }
}
