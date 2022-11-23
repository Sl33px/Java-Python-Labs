package ua.lviv.iot.fourthLab.Manager;

import ua.lviv.iot.fourthLab.BikeDetail;

import java.util.Comparator;

public class ManufactureComparatorDESC implements Comparator<BikeDetail> {
    @Override
    public int compare(BikeDetail o1, BikeDetail o2) {
        return o2.getManufacture().compareTo(o1.getManufacture());
    }
}
