public class Main {
    public static void main(String[] args) {
        User newUser = new User("Robin", "McDonald", "roobin", "strongPW");
        System.out.println(newUser);

        User oldUser = new User("Ben", "James", "benjames", "benjamin");
        System.out.println(oldUser);

        User unknownUser = new User();
        System.out.println(unknownUser);

    }

}
