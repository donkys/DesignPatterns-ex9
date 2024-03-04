class MediatorImpl implements Mediator {
    private Alarm alarm;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void mediate(String from) {
        alarm.endAlarm(from);
    }
}