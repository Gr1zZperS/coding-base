package ood.patterns.structural.facade;

public class Main {

    public static void main(String[] args) {

        GPSPower power = new GPSPower();
        GPSNotifier notifier = new GPSNotifier();
        RoadAdvisor advisor = new RoadAdvisor();

        /* Use GPSFacade instead
        power.powerOn();
        notifier.downloadRoadInfo();
        advisor.route();
        */

        GPSFacade facade = new GPSFacade(power, notifier, advisor);
        facade.activate();

        power.powerOff();

    }

}
