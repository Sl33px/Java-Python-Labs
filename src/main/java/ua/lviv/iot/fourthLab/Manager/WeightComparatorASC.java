package ua.lviv.iot.fourthLab.Manager;

import ua.lviv.iot.fourthLab.BikeDetail;

import java.util.Comparator;

public class WeightComparatorASC implements Comparator<BikeDetail> {
    @Override
    public int compare(BikeDetail o1, BikeDetail o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
