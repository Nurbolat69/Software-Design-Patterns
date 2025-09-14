public class Car {
    private final String brand;
    private final String color;
    private final int year;
    private final int doors;
    private final boolean hasAirConditioning;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.year = builder.year;
        this.doors = builder.doors;
        this.hasAirConditioning = builder.hasAirConditioning;
    }

    public static class CarBuilder {
        private String brand;
        private String color;
        private int year;
        private int doors;
        private boolean hasAirConditioning;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public CarBuilder hasAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public Car build() {
            if (brand == null || brand.isEmpty()) {
                throw new IllegalStateException("Brand must be provided");
            }
            if (year <= 1885) {
                throw new IllegalStateException("Year seems invalid");
            }
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", hasAirConditioning=" + hasAirConditioning +
                '}';
    }
}

