public class ServerNameGenerator {

    static String[] adjectivesArray = {"dedicated", "capable", "stable", "systematic", "scientific", "voice-activated", "sophisticated", "powerful", "super", "advanced"};

    static String[] nounsArray = {"photon", "solution", "host", "media", "server", "web", "space", "hub", "digital", "studio"};


    public static String getRandom(String[] arr) {
        int randomName = (int)(Math.random() * arr.length);
        return arr[randomName];

    }

    public static void main(String[] args) {

        String randomAdjective = getRandom(adjectivesArray);
        String randomNoun = getRandom(nounsArray);

        System.out.println("Here is your server name: ");
        System.out.printf("%s-%s", randomAdjective,randomNoun);
    }


}
