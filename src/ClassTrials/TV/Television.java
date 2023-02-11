package ClassTrials.TV;

import java.util.ArrayList;

public class Television {
    private String brand;
    private String dimension;
    private int volume;
    private boolean open;
    private Channel selectedChannel;
    private static ArrayList<Channel> channels;

    static {
        channels = new ArrayList<>();
        Channel newsChannel = new NationalChannel("TRT1",1,true);
        Television.channels.add(newsChannel);
        newsChannel = new NationalChannel("Star",2,false);
        Television.channels.add(newsChannel);
        newsChannel = new NationalChannel("Kanal D",3,false);
        Television.channels.add(newsChannel);
        newsChannel = new NationalChannel("FOX",4,false);
        Television.channels.add(newsChannel);
        newsChannel = new NationalChannel("Atv",5,false);
        Television.channels.add(newsChannel);
        newsChannel = new NationalChannel("Show Tv",6,false);
        Television.channels.add(newsChannel);
        newsChannel = new NewsChannel("CNN",80,"Dünya Gündem");
        Television.channels.add(newsChannel);
        newsChannel = new NewsChannel("NTV",81,"Dünya Gündemi");
        Television.channels.add(newsChannel);
        newsChannel = new NewsChannel("HaberTürk",82,"Dünya Gündemi");
        Television.channels.add(newsChannel);
        newsChannel = new NewsChannel("NTVSpor",83,"Spor Haberleri");
        Television.channels.add(newsChannel);
        newsChannel = new NewsChannel("TRTSpor",84,"Spor Haberleri");
        Television.channels.add(newsChannel);
        newsChannel = new MusicChannel("DreamTurk",90,"Yerli Pop");
        Television.channels.add(newsChannel);
        newsChannel = new MusicChannel("NumberOne",91,"Yabancı Pop");
        Television.channels.add(newsChannel);
        newsChannel = new MusicChannel("Kral Pop",92,"Yerli Pop");
        Television.channels.add(newsChannel);
        newsChannel = new MusicChannel("NumberOne Türk",93,"Yerli Pop");
        Television.channels.add(newsChannel);
        newsChannel = new MusicChannel("Power",94,"Yabancı Pop");
        Television.channels.add(newsChannel);

    }

    public Television(String make, String dimension) {
        this.brand = make;
        this.dimension = dimension;
        this.volume = 10;
        this.open = true;
        this.setChannels(getChannels());
        setSelectedChannel(channels.get(0));

    }

    private void addChannels(Channel channel) {
        channels.add(channel);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }


    @Override
    public String toString() {
        return "Marka : " + brand + " Boyut : " + dimension + "\"";
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }
    public void getChannelInfo()
    {
        for(int i = 0; i < this.getChannels().size(); i++)
        {
            System.out.printf("%-3d\t%-15s\t%-3d\n", (i + 1),this.getChannels().get(i).getName(),this.getChannels().get(i).getNo());
        }
    }

    public void openTelevision()
    {
        if(this.open)
        {
            System.out.println("Televizyon zaten açık...");
        }else{
            System.out.println("Televizyon açılıyor.");
            this.open = true;
        }
    }
    public void closedTelevision()
    {
        if(this.open)
        {
            System.out.println("Televizyon kapatılıyor...");
            this.open = false;
        }else{
            System.out.println("Televizyon zaten kapalı...");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void upVolume()
    {
        if(getVolume() < 20)
        {
            this.volume++;
            System.out.println("Ses seviyesi : " + getVolume());
        }else {
            System.out.println("Ses seviyesi en yüksek seviyede. " + getVolume());
        }
    }
    public void downVolume()
    {
        if(getVolume() > 0)
        {
            this.volume--;
            System.out.println("Ses seviyesi : " + getVolume());
        }else{
            System.out.println("Ses seviyesi en düşük seviyede. : " + getVolume());
        }
    }

    public Channel getSelectedChannel() {
        return selectedChannel;
    }

    public void setSelectedChannel(Channel selectedChannel) {
        this.selectedChannel = selectedChannel;
    }

    public void selectedChannelInfo()
    {
        System.out.printf("Şuanda izlenilen kanal : %-15s\t%-3d\n", this.getSelectedChannel().getName(),this.getSelectedChannel().getNo());
    }
}
