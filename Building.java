package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
    private int mLength = 0;
    private int mWidth = 0;
    private int mLotLength = 0;
    private int mLotWidth = 0;


    public Building(int length, int width, int lotLength, int lotWidth){
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }
    public int getLength(){
        return mLength;
    }
    public int getWidth(){
        return mWidth;
    }
    public int getLotLength(){
        return mLotLength;
    }
    public int getLotWidth(){
        return mLotWidth;
    }
    public void setLength(int length){
        this.mLength = length;
    }
    public void setWidth(int width){
        this.mWidth = width;
    }
    public void setLotLength(int LotLength){
        this.mLotLength = LotLength;
    }
    public void setLotWidth(int LotWidth){
        this.mLotWidth = LotWidth;
    }
    public int calcBuildingArea(){
        int area;
        area = mLength * mWidth;
        return area;
    }
    public int calcLotArea(){
        int area;
        area = mLotLength * mLotWidth;
        return area;
    }
    public String toString(){
        return "Building";
    }
}
