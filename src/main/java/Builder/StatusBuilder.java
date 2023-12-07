package Builder;

import Entity.Status;

public interface StatusBuilder {

    StatusBuilder setStatusID(String statusID);

    StatusBuilder setHeartRate(String heartRate);

    StatusBuilder setBloodPressure(String bloodPressure);

    Status build();
}
