# 🎵 Playlist CLI

A **simple Command Line Interface (CLI) playlist manager** built in **Java**. This project simulates a music or video playlist using a custom **doubly linked list** with sentinel nodes.

It was created as a mini-project to practice and solidify understanding of linked list data structures in an interactive and hands-on way.

---

## Diagram: Doubly Linked List with Sentinels

This project uses a doubly linked list with two **sentinel nodes**, `head` and `tail`, which simplifies the logic for adding and removing nodes. The sentinels do not store actual video data but act as fixed start and end markers.

```
                    Doubly Linked List with Sentinel Nodes
                              
    null                                                            null
     ↑                                                               ↑
┌─────────┐      ┌─────────────┐      ┌─────────────┐      ┌─────────┐
│  HEAD   │◄────►│ VideoNode 1 │◄────►│ VideoNode 2 │◄────►│  TAIL   │
│(sentinel)│     │             │      │             │      │(sentinel)│
│  prev   │      │    prev     │      │    prev     │      │  prev   │
│  next   │      │    data     │      │    data     │      │  next   │
│  data=∅ │      │    next     │      │    next     │      │  data=∅ │
└─────────┘      └─────────────┘      └─────────────┘      └─────────┘

Empty Playlist:
┌─────────┐      ┌─────────┐
│  HEAD   │◄────►│  TAIL   │
│(sentinel)│     │(sentinel)│
│  next   │      │  prev   │
│  data=∅ │      │  data=∅ │
└─────────┘      └─────────┘
```

- **Head Sentinel**: `head.next` points to the first real video in the playlist.
- **Tail Sentinel**: `tail.prev` points to the last real video.
- An empty playlist looks like this: `head <--> tail`.

---
## Demo

---

## 🚀 Features

- **Add Videos**: Add new videos to the **beginning** or **end** of the playlist.
- **Remove Videos**: Remove videos from the **beginning** or **end**.
- **Display Playlist**: Show all videos currently in the list.
- **Playback Simulation**:
  - `play`: Start playback from the first video.
  - `next`: Move to the next video.
  - `prev`: Move to the previous video.
  - `stop`: Stop the current playback.
- **Quick Inspection**: Instantly view the `first` and `last` videos in the list.
- **Interactive CLI**: A user-friendly command-line interface built with `Scanner`.

---

## 🛠️ How to Run

1. **Clone or Download**: Clone the repository or download the source files (`Video.java`, `VideoNode.java`, `PlayList.java`, `MainCLI.java`).

2. **Compile the Java files**: Open a terminal in the project directory and run the compiler.
   ```bash
   javac *.java
   ```

3. **Run the CLI application**:
   ```bash
   java MainCLI
   ```

---

## 📖 Example Usage

Here is a sample session interacting with the Playlist CLI:

```text
🎵 Welcome to the Playlist CLI 🎵
Type 'help' to see available commands.

> addlast
Enter video ID: 1
Enter title: Intro to Java
Enter channel: CodeAcademy
Enter duration (minutes): 10.5
✅ Video added.

> addfirst
Enter video ID: 2
Enter title: Data Structures Explained
Enter channel: CS Dojo
Enter duration (minutes): 15.0
✅ Video added.

> list
--- Playlist ---
1. Data Structures Explained (CS Dojo) - 15.0 min
2. Intro to Java (CodeAcademy) - 10.5 min
----------------

> play
▶️ Now playing: Data Structures Explained

> next
▶️ Now playing: Intro to Java

> next
✅ Done! You reached the end of the playlist.

> prev
▶️ Now playing: Data Structures Explained

> stop
⏹️ Stopped.

> exit
👋 Goodbye!
```

---

## ✅ Available Commands

| Command | Description |
|---------|-------------|
| `help` | Show all available commands. |
| `addfirst` | Add a new video at the beginning. |
| `addlast` | Add a new video at the end. |
| `removefirst` | Remove the first video from the playlist. |
| `removelast` | Remove the last video from the playlist. |
| `list` | Show all videos in the playlist. |
| `first` | Show the first video. |
| `last` | Show the last video. |
| `play` | Start playing from the first video. |
| `next` | Move to the next video during playback. |
| `prev` | Move to the previous video during playback. |
| `stop` | Stop playback. |
| `exit` | Quit the program. |

---

## 📝 To-Do / Future Features

Here are some ideas for future improvements:

### Core Features
- [ ] **Circular Playback**: After the last video, loop back to the first (and vice versa).
- [ ] **Shuffle Mode**: Play videos in a random order.
- [ ] **Search**: Find a video by its title or channel.
- [ ] **Remove by ID/Title**: Delete a specific video from anywhere in the list.
- [ ] **Insert at Position**: Add videos at specific positions in the playlist.
- [ ] **Move Videos**: Reorder videos by moving them to different positions.

### Data & Persistence
- [ ] **Persistence**: Save the current playlist to a file and load it back later.
- [ ] **Import/Export**: Support for M3U, JSON, or CSV playlist formats.
- [ ] **Multiple Playlists**: Create and manage multiple named playlists.

### Advanced Features
- [ ] **Queue System**: Allow temporary queueing of "up next" videos.
- [ ] **History Tracking**: Keep track of recently played videos.
- [ ] **Repeat Modes**: Single repeat, playlist repeat, no repeat.
- [ ] **Bookmarks**: Save playback positions for videos.
- [ ] **Rating System**: Rate videos and sort by rating.

### Technical Improvements
- [ ] **Unit Tests**: Add JUnit tests to validate the PlayList class functionality.
- [ ] **Error Handling**: Improve input validation and error messages.
- [ ] **Performance**: Optimize for large playlists (1000+ videos).
- [ ] **Logging**: Add proper logging for debugging and monitoring.

---

## 🎯 Purpose

This is a practice project and is not intended for production use. Its main goals are to:

- Deepen understanding of doubly linked lists in Java.
- Practice fundamental object-oriented design principles.
- Get comfortable with building interactive CLI applications.
- Serve as a foundation for more complex projects, such as a REST API using Spring Boot.

---

## 🤝 Contributions

Contributions are welcome! If you have ideas for improvements or new features, feel free to fork this repository, make your changes, and open a pull request.

---

## 📜 License

This project is created for learning purposes and is not bound by any specific license. You are free to use, modify, and share the code as you see fit.
