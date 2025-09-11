public class PlayList {
    VideoNode head;
    VideoNode tail;
    int size = 0;

    public PlayList(){
        head = new VideoNode(null,null,null);
        tail = new VideoNode(null,head,null);
        head.setNextVideo(tail);
        tail.setNextVideo(head); // i guss this line allow us to make it circularly
    }

    public int size(){
        return size ;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    // first and last : methods to get the first video and the last one in a playList
    public Video first(){
        if (isEmpty() == true) return null;
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


}
