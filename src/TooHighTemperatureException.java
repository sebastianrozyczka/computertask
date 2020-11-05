public class TooHighTemperatureException extends RuntimeException {
    public TooHighTemperatureException(double temperature) {
        super("Za wysoka temperatura: " + temperature + ". Nie zwiększaj taktowania !");
    }
}
