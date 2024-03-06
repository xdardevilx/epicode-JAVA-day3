package esercizio2;

public class SingleCall {
    private String name;
    private String numberPhone;
    private String callDuration;

    public SingleCall(String name, String numberPhone, String callDuration) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.callDuration = callDuration;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + this.name + "'" +
                ", numberPhone='" + this.numberPhone + "'" +
                ", callDuration='" + this.callDuration + "'" +
                "}";
    }

}
