package Service;

import Entity.Status;

public interface StatusService {

    Status findById(int statusID);

    int addStatus();

    boolean updateStatus(Status status);
}
