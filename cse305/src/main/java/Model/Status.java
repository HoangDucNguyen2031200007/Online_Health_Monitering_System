package Model;

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

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
