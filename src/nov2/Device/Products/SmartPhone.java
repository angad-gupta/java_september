package nov2.Device.Products;

import nov2.Device.Features.*;

public class SmartPhone implements MobilePhone, Calculator, WebBrowser, AudioMediaPlayer, VideoPlayer, Camera {
    @Override
    public void play() {
        System.out.println("Smartphone Playing");
    }

    @Override
    public void pause() {
        System.out.println("Smartphone Pause");
    }

    @Override
    public void stop() {
        System.out.println("Smartphone Stop");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone Playing Music");
    }

    @Override
    public void calculate() {
        System.out.println("Smartphone Calculate");
    }

    @Override
    public void takePictures() {
        System.out.println("Smartphone Take Pictures");
    }

    @Override
    public void call() {
        System.out.println("Smartphone Call");
    }

    @Override
    public void text() {
        System.out.println("Smartphone text");
    }

    @Override
    public void playVideo() {
        System.out.println("Smartphone Playing Video");
    }

    @Override
    public void surfInternet() {
        System.out.println("Smartphone Surf Internet");
    }
}
