package Entity;

public class Status {

    private String statusID;
    private String heartRate;
    private String bloodPressure;

    public Status() {
    }

    public Status(String statusID, String heartRate, String bloodPressure) {
        this.statusID = statusID;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
    }

    public String getStatusID() {
        return statusID;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

}
