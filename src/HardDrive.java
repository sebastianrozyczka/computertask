public class HardDrive extends Component {
    private double capacity;

    public HardDrive(String model, String serialNumber, double capacity) {
        super(model, serialNumber);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
