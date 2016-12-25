package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
       
    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length,width,lotLength,lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        this(length,width,lotLength,lotWidth);
        this.mBusinessName = businessName;
        mParkingSpaces = 0;

    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        this(length,width,lotLength,lotWidth,businessName);
        this.mBusinessName = null;
        this.mParkingSpaces = parkingSpaces;

    }
    public String getBusinessName(){
        return mBusinessName;
    }
    public int getParkingSpaces(){
        return mParkingSpaces;
    }
    public void setBusinessName(String business){
        this.mBusinessName=business;
    }
    public void setParkingSpaces(int parking){
        this.mParkingSpaces=parking;
    }
    public String toString(){
        String result = "Business: ";
        if(this.getBusinessName()!= null) {
            result += mBusinessName;
        }else{
            result += "unoccupied";
        }
        if(this.getParkingSpaces()>0){
            result += "; has "+ mParkingSpaces + " parking spaces";
        }
        return result+" (total offices: " + sTotalOffices + ")";
    }
    public boolean equals(Object other){
        if(other instanceof Office){
            Office o = (Office)other;
            if(this.calcBuildingArea()==o.calcBuildingArea() && this.mParkingSpaces == o.mParkingSpaces){
                return true;
            }
        }
        return false;
    }
}
