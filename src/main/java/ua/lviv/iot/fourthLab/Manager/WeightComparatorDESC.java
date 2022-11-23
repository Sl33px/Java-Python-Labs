package ua.lviv.iot.fourthLab.Manager;

import ua.lviv.iot.fourthLab.BikeDetail;

import java.util.Comparator;

public class WeightComparatorDESC implements Comparator<BikeDetail> {
    @Override
    public int compare(BikeDetail o1, BikeDetail o2) {
        return Double.compare(o2.getWeight(), o1.getWeight());
    }
}
