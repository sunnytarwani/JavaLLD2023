package SOLID_DesignPattern.CreationalDP.BuilderDP;

public class User {

    private final String userName;
    private final int userId;
    private final String userCity;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.userCity = userBuilder.userCity;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserCity() {
        return userCity;
    }

    @Override
    public String toString() {
        return "User { " +
                " userName='" + getUserName() + '\'' +
                ", userId=" + getUserId() +
                ", userCity='" + getUserCity() + '\'' +
                '}';
    }

    static class UserBuilder {
        private String userName;
        private int userId;
        private String userCity;

        public UserBuilder(){}


        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserCity(String userCity) {
            this.userCity = userCity;
            return this;
        }

        public User build(){

            return new User(this);
        }
    }
}
