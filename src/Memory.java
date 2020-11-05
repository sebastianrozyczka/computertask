public class Memory extends Component implements Overclockable {
    private int memory;
    private double clockSpeed;
    private double temperature;
    private static final double MAX_SAFE_TEMPERATURE = 60;

    public Memory(String model, String serialNumber, int memory, double clockSpeed, double temperature) throws TooHighTemperatureException {
        super(model, serialNumber);
        checkTemperature(temperature);
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void overclock() throws TooHighTemperatureException {
        checkTemperature(temperature);
        clockSpeed = clockSpeed + 100;
        temperature = temperature + 15;
    }

    private void checkTemperature(double temperature) throws TooHighTemperatureException {
        if(temperature > MAX_SAFE_TEMPERATURE){
            throw new TooHighTemperatureException(temperature);
        }
    }
}
