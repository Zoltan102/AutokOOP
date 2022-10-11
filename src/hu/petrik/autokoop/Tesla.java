package hu.petrik.autokoop;

import java.util.Random;

public class Tesla implements Auto{
    private double sebesseg;

    public Tesla() {
        this.sebesseg = random(0, 60);
    }

    public double random(int min, int max) {
        Random rnd = new Random();
        return min + (max - min) * rnd.nextDouble();
    }

    @Override
    public void gyorsul() {
        this.sebesseg += random(5, 15);
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
