package ConcreteBuilder;

import Builder.StatusBuilder;
import Entity.Status;

public class StatusConcreteBuilder implements StatusBuilder {

    private String statusID;
    private String heartRate;
    private String bloodPressure;

    @Override
    public StatusBuilder setStatusID(String statusID) {
        this.statusID = statusID;
        return this;
    }

    @Override
    public StatusBuilder setHeartRate(String heartRate) {
        this.heartRate = heartRate;
        return this;
    }

    @Override
    public StatusBuilder setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
        return this;
    }

    @Override
    public Status build() {
        return new Status(statusID, heartRate, bloodPressure);
    }

}
