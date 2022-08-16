package relations.util;

import relations.data.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserUtils {

    private static final long LEFT_LIMIT = 1L;
    private static final long RIGHT_LIMIT = 10_000_000L;

    private UserUtils() {
    }

    public static void makeFriendship(User user, User friend) {
        user.getFriends().add(friend);
        friend.getFriends().add(user);
    }

    public static User generateUser(String name, String surname) {
        return generateUser(generateRandomLong(LEFT_LIMIT, RIGHT_LIMIT), name, surname, new ArrayList<>());
    }

    public static User generateUser(String name, String surname, List<User> friends) {
        return generateUser(generateRandomLong(LEFT_LIMIT, RIGHT_LIMIT), name, surname, friends);
    }

    public static User generateUser(Long id, String name, String surname, List<User> friends) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setFriends(friends);
        return user;
    }

    private static Long generateRandomLong(long leftLimit, long rightLimit) {
        return ThreadLocalRandom.current().nextLong(leftLimit, rightLimit);
    }

}
