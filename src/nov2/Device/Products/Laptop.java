package nov2.Device.Products;

import nov2.Device.Features.AudioMediaPlayer;
import nov2.Device.Features.Calculator;
import nov2.Device.Features.VideoPlayer;
import nov2.Device.Features.WebBrowser;

public class Laptop implements Calculator, WebBrowser, AudioMediaPlayer, VideoPlayer {
    @Override
    public void play() {
        System.out.println("Laptop Playing");
    }

    @Override
    public void pause() {
        System.out.println("Laptop Pause");
    }

    @Override
    public void stop() {
        System.out.println("Laptop Stop");
    }

    @Override
    public void playMusic() {
        System.out.println("Laptop Playing Music");
    }

    @Override
    public void calculate() {
        System.out.println("Laptop Calculate");
    }

    @Override
    public void playVideo() {
        System.out.println("Laptop Playing Video");
    }

    @Override
    public void surfInternet() {
        System.out.println("Laptop Surfing Internet");
    }
}
