public class Processor extends Component implements Overclockable {
    private int clockSpeed;
    private double temperature;
    private static final double MAX_SAFE_TEMPERATURE = 60;

    public Processor(String model, String serialNumber, int clockSpeed, double temperature) throws TooHighTemperatureException {
        super(model, serialNumber);
        checkTemperature(temperature);
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) throws TooHighTemperatureException {
        checkTemperature(temperature);
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
