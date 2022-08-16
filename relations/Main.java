package relations;

import relations.data.User;
import relations.util.PrintUtils;
import relations.util.UserUtils;

public class Main {

    public static void main(String[] args) {
        User slava = UserUtils.generateUser("Slava", "Kondratiev");
        User matvey = UserUtils.generateUser("Matvey", "Anisimov");
        User lisa = UserUtils.generateUser("Liza", "Smirnova");
        User vanya = UserUtils.generateUser("Vanya", "Kalinin");
        User artem = UserUtils.generateUser("Artem", "Gusev");

        UserUtils.makeFriendship(slava, matvey);
        UserUtils.makeFriendship(slava, lisa);
        UserUtils.makeFriendship(slava, vanya);
        UserUtils.makeFriendship(slava, artem);

        UserUtils.makeFriendship(lisa, matvey);

        UserUtils.makeFriendship(vanya, matvey);
        UserUtils.makeFriendship(vanya, lisa);

        UserUtils.makeFriendship(artem, lisa);
        UserUtils.makeFriendship(artem, vanya);

        System.out.println(PrintUtils.getUserRelations(slava, 3));
    }
}
