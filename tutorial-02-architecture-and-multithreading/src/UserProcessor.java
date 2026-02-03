public class UserProcessor implements Runnable {

    private UserValidator validator;
    private UserDataStore dataStore;
    private Object lock;
    private String name;
    private int age;

    public UserProcessor(String name, int age, UserDataStore ds, Object lock) {
        this.name = name;
        this.age = age;
        this.dataStore = ds;
        this.lock = lock;
        this.validator = new UserValidator();
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (validator.isValidAge(age)) {
                System.out.println("Processing user: " + name + ".....");
                User user = new User(name, age);
                dataStore.addUser(user); // ✅ correct method name
                System.out.println("Added: " + user);
            } else {
                System.out.println("ERROR: Invalid age for user " + name + " (age=" + age + ")");
            }
        }
    }
}
