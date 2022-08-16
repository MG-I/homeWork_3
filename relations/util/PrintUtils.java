package relations.util;

import relations.data.User;

public class PrintUtils {

    private PrintUtils() {
    }

    public static String getUserRelations(User user, int nestingLevel) {
        StringBuilder buffer = new StringBuilder();
        if (nestingLevel >= 2) {
            generateStringForUser(buffer, user, "", "", 0, nestingLevel);
        } else {
            buffer.append(user);
        }
        return buffer.toString();
    }

    private static void generateStringForUser(StringBuilder buffer, User user,String prefix, String childrenPrefix, int previousNestingLevel, int maxNestingLevel) {

        buffer.append(prefix);
        buffer.append(user);
        buffer.append('\n');

        int currentNestingLevel = previousNestingLevel + 1;
        if (currentNestingLevel <= maxNestingLevel) {
            for (int i = 0; i < user.getFriends().size(); i++) {
                User friend = user.getFriends().get(i);
                if (i != user.getFriends().size() - 1) {
                    generateStringForUser(buffer, friend, childrenPrefix + "├── ", childrenPrefix + "│   ",
                            currentNestingLevel, maxNestingLevel);
                } else {
                    generateStringForUser(buffer, friend, childrenPrefix + "└── ", childrenPrefix + "    ",
                            currentNestingLevel, maxNestingLevel);
                }
            }
        }
    }
}
