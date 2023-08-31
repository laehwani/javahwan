package project2.Class.ch08interface.book.exercise.exam06;

public class SoundableEx {

    public static void printsound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printsound(new Cat());
        printsound(new Dog());
    }
}
