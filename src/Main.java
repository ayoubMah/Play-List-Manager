public class Main {
    public static void main(String[] args) {
        PlayList playList = new PlayList();

        Video v1 = new Video(1, "Intro to Java", "CodeAcademy", 10.5);
        Video v2 = new Video(2, "Data Structures", "FreeCodeCamp", 15.2);
        Video v3 = new Video(3, "OOP Concepts", "Programming with Mosh", 12.7);

        playList.addLast(v1);
        playList.addLast(v2);
        playList.addFirst(v3);

        System.out.println(playList);

        System.out.println("First video: " + playList.first());
        System.out.println("Last video: " + playList.last());

        playList.removeFirst();
        System.out.println("\nAfter removing first:");
        System.out.println(playList);

        playList.removeLast();
        System.out.println("\nAfter removing last:");
        System.out.println(playList);
    }
}