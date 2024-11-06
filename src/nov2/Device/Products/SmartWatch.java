package nov2.Device.Products;

import nov2.Device.Features.Calculator;
import nov2.Device.Features.MobilePhone;

public class SmartWatch implements MobilePhone, Calculator {
    @Override
    public void calculate() {
        System.out.println("Smart Watch Calculator");
    }

    @Override
    public void call() {
        System.out.println("Smart Watch call");
    }

    @Override
    public void text() {
        System.out.println("Smart Watch text");
    }
}
