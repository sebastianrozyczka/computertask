public class TooHighTemperatureException extends Exception {
    public TooHighTemperatureException(double temperature) {
        super("Za wysoka temperatura: " + temperature + ". Nie zwiększaj taktowania !");
    }
}
