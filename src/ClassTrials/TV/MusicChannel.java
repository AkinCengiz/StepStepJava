package ClassTrials.TV;

import java.util.ArrayList;

public class MusicChannel extends Channel{

        /*static {
            Channel.getChannels().add(new MusicChannel("DreamTurk",90,"Yerli Pop"));
            Channel.getChannels().add(new MusicChannel("NumberOne",91,"Yabancı Pop"));
            Channel.getChannels().add(new MusicChannel("Kral Pop",92,"Yerli Pop"));
            Channel.getChannels().add(new MusicChannel("NumberOne Türk",93,"Yerli Pop"));
            Channel.getChannels().add(new MusicChannel("Power",94,"Yabancı Pop"));
        }*/
    private String musicType;
    public MusicChannel(String name, int no, String musicType) {
        super(name, no);
        this.musicType = musicType;
    }
    public String getMusicType() {
        return musicType;
    }
    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }
}
