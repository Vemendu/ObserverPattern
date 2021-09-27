public class Main {
    public static void main(String[] args) {
        Conference conference = new Conference();
        User user1 = new User("Ivan", conference);
        User user2 = new User("Vova", conference);

        user1.sendMessage("First Message");
        user1.sendMessage("Second");
        user2.sendMessage("third");
        System.out.println();
        for(String str : conference.messageHistory)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user1.list)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user2.list)
        {
            System.out.println(str);
        }

        user1.deleteMessageForYourself(1);
        System.out.println();
        for(String str : conference.messageHistory)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user1.list)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user2.list)
        {
            System.out.println(str);
        }

        user2.deleteMessageForEveryone(1);
        System.out.println();
        for(String str : conference.messageHistory)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user1.list)
        {
            System.out.println(str);
        }
        System.out.println();
        for(String str : user2.list)
        {
            System.out.println(str);
        }
        System.out.println();
        conference.unregisterObserver(user1);
        System.out.println();
        for(IObserver observer : conference.list)
        {
            System.out.println(observer.getName());
        }
    }
}
