package SOLID_DesignPattern.CreationalDP.BuilderDP.EG2;

public class Car {
    private String modelName;
    private String carVariant;
    private boolean checkAutomatic;
    private int modelNumber;

    private Car(CarBuilder carBuilder) {
        this.modelName = carBuilder.modelName;
        this.carVariant = carBuilder.carVariant;
        this.modelNumber = carBuilder.modelNumber;
        this.checkAutomatic = carBuilder.checkAutomatic;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCarVariant() {
        return carVariant;
    }

    public boolean isCheckAutomatic() {
        return checkAutomatic;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "modelName='" + modelName + '\'' +
                ", carVariant='" + carVariant + '\'' +
                ", checkAutomatic=" + checkAutomatic +
                ", modelNumber=" + modelNumber +
                '}';
    }

    static class CarBuilder{
        private String modelName;
        private String carVariant;
        private boolean checkAutomatic;
        private int modelNumber;

        public CarBuilder() {
        }

        public CarBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public CarBuilder setCarVariant(String carVariant) {
            this.carVariant = carVariant;
            return this;
        }

        public CarBuilder setCheckAutomatic(boolean checkAutomatic) {
            this.checkAutomatic = checkAutomatic;
            return this;
        }

        public CarBuilder setModelNumber(int modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }

        public Car build(){
            return (new Car(this));
        }
    }
}
