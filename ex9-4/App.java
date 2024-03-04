public class App {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Alarm alarm = new Alarm(mediator);
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();

        mediator.setAlarm(alarm);
        sprinkler.setMediator(mediator);
        coffeePot.setMediator(mediator);

        alarm.doAlarm();
        sprinkler.doSprinkler();
        coffeePot.doCoffeePot();
    }
}