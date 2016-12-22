package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */

    // TODO -- Fill in your code here


    /**
     * This file defines the Gate class.
     */
    public class Gate {
        // TODO -- Fill in your code here
        public static final int IN = 1;
        public static final int OUT = -1;
        public static final int CLOSED = 0;
        public int mSwing;

        public Gate(){

        }
        public int getSwingDirection(){
            return mSwing;
        }
        public boolean setSwing(int direction){
            if(direction==IN||direction==OUT||direction==CLOSED){
                this.mSwing = direction;
                return true;
            }
            else
                return false;

        }
        public boolean open(int direction){
            if(direction==IN){
                this.setSwing(IN);
                return true;
            }
            else if(direction==OUT){
                this.setSwing(OUT);
                return true;
            }
            else
                return false;
        }
        public void close(){
            this.setSwing(CLOSED);
        }
        public int thru(int count){
            int temp = 0;
            if(mSwing == IN){
                temp+=count;
                return temp;
            }
            else if(mSwing==OUT){
                temp-=count;
                return temp;
            }
            else
                return 0;
        }
        public String toString(){
            if(mSwing==CLOSED){
                return "This gate is closed";
            }
            else if(mSwing==IN){
                return "This gate is open and swings to enter the pen only";
            }
            else if(mSwing==OUT){
                return "This gate is open and swings to exit the pen only";
            }
            else
                return "This gate has an invalid swing direction";
        }
    }



