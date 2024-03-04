public class CoffeePot {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doCoffeePot() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.mediate("Coffee Pot");
    }
}