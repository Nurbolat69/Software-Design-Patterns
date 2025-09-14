public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .brand("BMW")
                .color("Black")
                .year(2024)
                .doors(4)
                .hasAirConditioning(true)
                .build();

        System.out.println(car);
    }
}