public class Application {
    public static void main(String[] args) {
        try {
            Processor processor = new Processor("GTX200", "123123", 3000, 20);
            Memory memory = new Memory("AYZ2999", "321321", 4096, 1066, 15);
            HardDrive hardDrive = new HardDrive("ZAQ120", "999111", 256);
            Computer computer = new Computer(processor, memory, hardDrive);
//            memory.overclock();
//            memory.overclock();
//            memory.overclock();
//            memory.overclock();
//            memory.overclock();
            processor.overclock();
            processor.overclock();
            processor.overclock();
            processor.overclock();
            processor.overclock();
        } catch (TooHighTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}
