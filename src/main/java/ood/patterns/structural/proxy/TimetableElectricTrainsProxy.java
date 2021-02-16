package ood.patterns.structural.proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains {

    private TimetableTrains timetableTrains = new TimetableElectricTrains();

    private String[] timetableCache = null;

    @Override
    public String[] getTimetable() {
        if(timetableCache == null) {
            return timetableTrains.getTimetable();
        }
        return timetableCache;
    }

    public void clearCache() {
        timetableCache = null;
    }

}
