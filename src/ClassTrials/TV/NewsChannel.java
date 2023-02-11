package ClassTrials.TV;

public class NewsChannel extends Channel{
    /*static {
        Channel.getChannels().add(new NewsChannel("CNN",80,"Dünya Gündem"));
        Channel.getChannels().add(new NewsChannel("NTV",81,"Dünya Gündemi"));
        Channel.getChannels().add(new NewsChannel("HaberTürk",82,"Dünya Gündemi"));
        Channel.getChannels().add(new NewsChannel("NTVSpor",83,"Spor Haberleri"));
        Channel.getChannels().add(new NewsChannel("TRTSpor",84,"Spor Haberleri"));
    }*/
    private String newsType;
    public NewsChannel(String name, int no, String newsType) {
        super(name, no);
        this.setNewsType(newsType);
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }
}
