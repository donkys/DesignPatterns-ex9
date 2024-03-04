public class Sprinkler {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doSprinkler() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.mediate("Sprinkler");
    }
}