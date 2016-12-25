package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
       
    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner){
        this(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        this(length, width, lotLength, lotWidth,owner);

        this.mPool = pool;
    }
    public String getOwner(){
        return mOwner;
    }
    public boolean hasPool(){
        return mPool;
    }
    public void setOwner(String owner){
        this.mOwner = owner;
    }
    public void setPool(boolean pool){
        this.mPool = pool;
    }
    public String toString(){
        String result = "Owner: ";
        if (mOwner != null)
            result += getOwner();
        else
            result += "n/a";
        if (mPool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof House){
            House o = (House)other;
            if((this.calcBuildingArea()==(o.calcBuildingArea())) && (this.hasPool()==(o.hasPool())) ) {
                return true;
            }

        }
        return false;
    }
    
}
