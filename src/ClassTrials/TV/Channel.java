package ClassTrials.TV;

import java.util.ArrayList;

public class Channel {
    private String name;
    private int no;
    private static ArrayList<Channel> channels;

    public Channel(String name, int no) {
        this.name = name;
        this.no = no;
        //addChannelList(Channel.this.);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    private void addChannelList(Channel channel) {
        getChannels().add(channel);
    }

    public static ArrayList<Channel> getChannels() {
        return channels;
    }


    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }
}
