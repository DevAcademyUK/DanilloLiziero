package animals;

public class cat {

    private String name;
    private String size;
    private int age;
    private String breed;
    private boolean hasTail;

    public cat(String name, String size, int age, String breed, boolean hasTail) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
        this.hasTail = hasTail;
    }

    public String makeNoise(String size) {
        String noise = "";
        if (size.equalsIgnoreCase("small")) {
            noise = "meow meow";
        } else if (size.equalsIgnoreCase("medium")) {
            noise = "meooowww meooowww";
        } else {
            noise = "WOOO WOOO";
        }
        return noise;
    }
    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("Persian")) {
            playing = "Oh Dear, I don't think so, one could not possibly engage in such activities";
        } else if (breed.equalsIgnoreCase("Siamese")) {
            playing = "Yeah, Yeah, Put me in a box! I love hide myself!";
        } else if (breed.equalsIgnoreCase("Tabby")) {
            playing = "I'm out... Don't bother me";
        }
        return playing;
    }
    public String beHuman(String name, int age, String breed){
        return "Hello human. I'm " + name + " and I am a " + age + " year old "
                + breed + ". What breed are you?";
    }
    public String wagTail(boolean hasTail){
        String wagging = "";
        if(hasTail == true) {
            wagging = "Wow! I'm so happy! I'm wagging my tail!!";
        }
        else {
            wagging = "Oh... I would love have a tail...";
        }
        return wagging;
    }
}
