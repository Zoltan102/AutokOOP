package hu.petrik.autokoop;

public class Porsche implements Auto, Comparable<Auto>{
    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
        this.sebesseg += 10;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }

    @Override
    public int compareTo(Auto a) {
        int compare;
        if(this.getSebesseg() - a.getSebesseg() < 0){
            compare = -1;
        }else if (this.getSebesseg() - a.getSebesseg() > 0){
            compare = 1;
        }else{
            compare = 0;
        }
        return compare;
    }
}
