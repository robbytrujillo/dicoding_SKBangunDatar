package com.dicoding.javafundamental.bangundatar;

public class Lingkaran implements BangunDatar {

    private double pi = 3.1415;

    Lingkaran() {

    }
    @Override
    public double luas(int s1, int s2) {
        return 0;
    }
    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r) {
        // methoe overload
        return (pi * r * r);
    }

    public double keliling(int r) {
        // methoe overload
        return (2 * pi * r);
    }
}
