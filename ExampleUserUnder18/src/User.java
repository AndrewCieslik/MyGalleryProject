public class User {
    private int userAge;
    private String userName;

    public User(int userAge, String userName) {
        this.userAge = userAge;
        this.userName = userName;
    }

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

    public boolean checkAge() {
        return userAge>=18;
    }
}
