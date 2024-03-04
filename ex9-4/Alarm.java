public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        // mediator.mediate("Alarm");
    }

    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }
}