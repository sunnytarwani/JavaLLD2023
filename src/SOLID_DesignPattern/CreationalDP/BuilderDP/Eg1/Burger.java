package SOLID_DesignPattern.CreationalDP.BuilderDP.Eg1;

public class Burger {

    private String burgerName;
    private boolean addFries;
    private String burgerSize;
    private boolean extraMayo;

    private Burger(BurgerBuilder burgerBuilder){
        this.burgerName = burgerBuilder.burgerName;
        this.burgerSize = burgerBuilder.burgerSize;
        this.addFries = burgerBuilder.addFries;
        this.extraMayo = burgerBuilder.extraMayo;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public boolean isAddFries() {
        return addFries;
    }

    public String getBurgerSize() {
        return burgerSize;
    }

    public boolean isExtraMayo() {
        return extraMayo;
    }

    @Override
    public String toString() {
        return "Burger { " +
                "burgerName='" + burgerName + '\'' +
                ", addFries=" + addFries +
                ", burgerSize='" + burgerSize + '\'' +
                ", extraMayo=" + extraMayo +
                '}';
    }

    static class BurgerBuilder{
        private String burgerName;
        private boolean addFries;
        private String burgerSize;
        private boolean extraMayo;

        public BurgerBuilder(){

        }

        public BurgerBuilder setBurgerName(String burgerName) {
            this.burgerName = burgerName;
            return this;
        }

        public BurgerBuilder setAddFries(boolean addFries) {
            this.addFries = addFries;
            return this;
        }

        public BurgerBuilder setBurgerSize(String burgerSize) {
            this.burgerSize = burgerSize;
            return this;
        }

        public BurgerBuilder setExtraMayo(boolean extraMayo) {
            this.extraMayo = extraMayo;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
