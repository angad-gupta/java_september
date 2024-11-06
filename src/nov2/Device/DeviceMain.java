package nov2.Device;

import nov2.Device.Products.Laptop;
import nov2.Device.Products.SmartPhone;
import nov2.Device.Products.SmartWatch;

public class DeviceMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        laptop.calculate();
        laptop.playVideo();
        smartPhone.playMusic();
        smartPhone.pause();

    }
}
