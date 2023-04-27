public class ServerNameGenerator {
    private static String[] adjectives = {"interesting", "decisive", "deadpan", "foreign", "cold", "damp", "finicky", "weary", "nippy", "berserk"};
    private static String[] nouns = {"village", "entry", "device", "committee", "depth", "idea", "outcome", "sir", "girlfriend", "client"};

    private static String randomElement(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }

    public static void main(String[] args) {
        String adj = randomElement(adjectives);
        String noun = randomElement(nouns);
        System.out.println("Here is your server name: " + adj + "-" + noun);
    }
}
