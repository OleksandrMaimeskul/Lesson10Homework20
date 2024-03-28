public class User {
    private String login;
    Account account;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

    class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.printf("Account Login successful! Login: %s, Password: %s ", login, password);
        }

    }
    public void displayAccount() {
        account.displayAccount();
    }
}


