public class Battery {
    private int capacityMAh;
    private boolean isCharged = false;

    public Battery(int capacityMAh) {
        this.capacityMAh = capacityMAh;
    }

    public void charge() {
        this.isCharged = true;
    }

    public boolean isCharged() {
        return isCharged;
    }
    public int getCapacityMAh() {
        return this.capacityMAh;
    }

    public String toString() {
        return "Battery: " + "[" + capacityMAh + "] " + "mAh, Charged: " + "[" + isCharged + "]";
    }
}
