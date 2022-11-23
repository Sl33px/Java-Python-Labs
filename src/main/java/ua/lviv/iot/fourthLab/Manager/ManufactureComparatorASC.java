package ua.lviv.iot.fourthLab.Manager;

import ua.lviv.iot.fourthLab.BikeDetail;

import java.util.Comparator;

public class ManufactureComparatorASC implements Comparator<BikeDetail> {
    @Override
    public int compare(BikeDetail o1, BikeDetail o2) {
        return o1.getManufacture().compareTo(o2.getManufacture());
    }
}
