package Problems;

class ParkingSystem {
    int parking[];
    public ParkingSystem(int big, int medium, int small) {
        parking = new int[]{big,medium,small};
    }

    public boolean addCar(int carType) {
        if(parking[carType-1]>0)
        {
            parking[carType-1]--;
        }
        return false;
    }
}

/**
 * Your Problems.ParkingSystem object will be instantiated and called as such:
 * Problems.ParkingSystem obj = new Problems.ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */