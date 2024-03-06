package esercizio2;

import java.util.Arrays;

public class Sim {
    private String numberPhone;
    private int credit;
    private SingleCall[] calls;

    public Sim() {
        this.numberPhone = "3333513622";
        this.credit = 0;
        this.calls = new SingleCall[5];
    }

    public void setCalls (SingleCall[] calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "{" +
            " numberPhone='" + this.numberPhone + "'" +
            ", credit='" + this.credit + "'" +
            ", calls='" + Arrays.toString(calls) + "'" +
            "}";
    }
  
}


