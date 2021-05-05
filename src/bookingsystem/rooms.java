
package bookingsystem;

public class rooms {
    private int roomNum;
    private int roomCapacity;
    private boolean occupied;
    private boolean needsRefreshments;
    private boolean disabledAccess;
    private String resourcesNeeded;
    private int[] timeslots;
    private int[] occupiedTimeslots;

    public rooms(int roomNum, int roomCapacity, boolean occupied, boolean needsRefreshments, boolean disabledAccess, String resourcesNeeded, int[] timeslots, int[] occupiedTimeslots) {
        this.roomNum = roomNum;
        this.roomCapacity = roomCapacity;
        this.occupied = occupied;
        this.needsRefreshments = needsRefreshments;
        this.disabledAccess = disabledAccess;
        this.resourcesNeeded = resourcesNeeded;
        this.timeslots = timeslots;
        this.occupiedTimeslots = occupiedTimeslots;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isNeedsRefreshments() {
        return needsRefreshments;
    }

    public void setNeedsRefreshments(boolean needsRefreshments) {
        this.needsRefreshments = needsRefreshments;
    }

    public boolean isDisabledAccess() {
        return disabledAccess;
    }

    public void setDisabledAccess(boolean disabledAccess) {
        this.disabledAccess = disabledAccess;
    }

    public String getResourcesNeeded() {
        return resourcesNeeded;
    }

    public void setResourcesNeeded(String resourcesNeeded) {
        this.resourcesNeeded = resourcesNeeded;
    }

    public int[] getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(int[] timeslots) {
        this.timeslots = timeslots;
    }

    public int[] getOccupiedTimeslots() {
        return occupiedTimeslots;
    }

    public void setOccupiedTimeslots(int[] occupiedTimeslots) {
        this.occupiedTimeslots = occupiedTimeslots;
    }
    
    
}



