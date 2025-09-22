public class PlayList {
    VideoNode head;
    VideoNode tail;
    int size = 0;

    VideoNode current;

    public PlayList(){
        head = new VideoNode(null,null,null);
        tail = new VideoNode(null,head,null);
        head.setNextVideo(tail);
        tail.setPrevVideo(head); // i guss this line allow us to make it circularly
    }

    public int size(){
        return size ;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    // first and last : methods to get the first video and the last one in a playList
    public Video first(){
        if (isEmpty()) return null;
        VideoNode node = head.getNextVideo();
        return node.getVideo();
    }

    public Video last(){
        if (isEmpty() == true) return null;
        VideoNode node = tail.getPrevVideo() ;
        return node.getVideo();
    }

    // add methods between => first and last
    public void addBetween(VideoNode prev, Video elm, VideoNode next){
        VideoNode nodeElm = new VideoNode(elm, prev ,next);
        prev.setNextVideo(nodeElm);
        next.setPrevVideo(nodeElm);
        size ++ ;
    }

    public void addFirst(Video elm){
        addBetween(head, elm, head.getNextVideo());
    }

    public void addLast(Video elm){
        addBetween(tail.getPrevVideo() , elm, tail);
    }

    public Video  remove(VideoNode node){
        VideoNode prev = node.getPrevVideo();
        VideoNode next = node.getNextVideo() ;

        prev.setNextVideo(next) ;
        next.setPrevVideo(prev) ;

        //help GC
        node.setNextVideo(null);
        node.setPrevVideo(null) ;

        size -- ;
        return node.getVideo() ;
    }

    public Video removeFirst(){
        if (isEmpty()) return null;
        Video result = remove(head.getNextVideo());
        return result;
    }

    public Video removeLast(){
        if (isEmpty()) return null;
        Video result = remove(tail.getPrevVideo()) ;
        return result;
    }

    public void play(){
        if (isEmpty()) System.out.println("The Playlist is empty");
        current = head.getNextVideo();
        String title = current.getVideo().getTitle();
        System.out.println("... "+title+" _ is running ...");
    }

    public void next(){
        if (isEmpty()) {
            System.out.println("The Playlist is empty");
            return;
        }

        if (current == null){
            current = head.getNextVideo(); // start from the beginning
        } else if (current == tail.getPrevVideo()) {
            System.out.println("✅ Done! You reached the end of the playlist.");
            return;
        }else {
            current = current.getNextVideo();
        }
        String title = current.getVideo().getTitle();
        System.out.println("▶️ Now playing: " + title);
    }

    public void prev(){
        if (isEmpty()) System.out.println("The Playlist is empty");

        if (current == null){
            current = head.getNextVideo(); // start from the beginning
        } else if (current == head.getNextVideo()) {
            System.out.println("⏮\uFE0F You are already at the first video.");
            return;
        }else {
            current = current.getPrevVideo();
        }
        String title = current.getVideo().getTitle();
        System.out.println("▶️ Now playing: " + title);
    }

    @Override
    public String toString() {
        if (isEmpty()) return "PlayList is empty.";

        StringBuilder sb = new StringBuilder("PlayList: [\n");
        VideoNode current = head.getNextVideo();
        while (current != tail) {
            sb.append("  ").append(current.getVideo()).append("\n");
            current = current.getNextVideo();
        }
        sb.append("]");
        return sb.toString();
    }

}
