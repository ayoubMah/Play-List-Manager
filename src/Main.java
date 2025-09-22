import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayList playList = new PlayList();
        boolean running = true;

        System.out.println("▶\uFE0FYouTube\uD83D\uDD34 Welcome to the Playlist CLI ▶\uFE0FYouTube\uD83D\uDD34");
        System.out.println("Type 'help' to see available commands.\n");

        while (running) {
            System.out.print("> ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "help":
                    System.out.println("Available commands:");
                    System.out.println("  addfirst  - Add a new video at the beginning");
                    System.out.println("  addlast   - Add a new video at the end");
                    System.out.println("  removefirst - Remove the first video");
                    System.out.println("  removelast  - Remove the last video");
                    System.out.println("  list      - Show all videos in the playlist");
                    System.out.println("  first     - Show the first video");
                    System.out.println("  last      - Show the last video");
                    System.out.println("  play      - Play the playlist starting by the first video");
                    System.out.println("  next      - Play the next video in the playlist");
                    System.out.println("  play      - Play the prev video in the playlist");
                    System.out.println("  exit      - Quit the program");
                    break;

                case "addfirst":
                case "addlast":
                    System.out.print("Enter video ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter channel: ");
                    String channel = scanner.nextLine();

                    System.out.print("Enter duration (minutes): ");
                    double duration = Double.parseDouble(scanner.nextLine());

                    Video video = new Video(id, title, channel, duration);

                    if (command.equals("addfirst")) {
                        playList.addFirst(video);
                    } else {
                        playList.addLast(video);
                    }
                    System.out.println("✅ Video added.\n");
                    break;

                case "removefirst":
                    Video removedFirst = playList.removeFirst();
                    System.out.println(removedFirst != null ? "Removed: " + removedFirst : "Playlist is empty.");
                    break;

                case "removelast":
                    Video removedLast = playList.removeLast();
                    System.out.println(removedLast != null ? "Removed: " + removedLast : "Playlist is empty.");
                    break;

                case "list":
                    System.out.println(playList);
                    break;

                case "first":
                    System.out.println(playList.first() != null ? playList.first() : "Playlist is empty.");
                    break;

                case "last":
                    System.out.println(playList.last() != null ? playList.last() : "Playlist is empty.");
                    break;

                case "play":
                    playList.play();
                    break;

                case "next":
                    playList.next();
                    break;

                case "prev":
                    playList.prev();
                    break;

                case "exit":
                    running = false;
                    System.out.println("👋 Goodbye!");
                    break;

                default:
                    System.out.println("Unknown command. Type 'help' for a list of commands.");
            }
        }

        scanner.close();
    }
}