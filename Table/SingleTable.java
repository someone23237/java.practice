package Table;

class SingleTable {
/**
 * Returns the * number of * seats at this * table.The value * is always * greater than * or equal to 4.
 */ int numberOfSeats = 0;
 int heightOfChairs = 100;
 boolean viewQuality = false;

public int getNumSeats() {
       return numberOfSeats = 4; }

    /**
     * 
     * Returns the     * height of this     * table in centimeters.     */

    public int getHeight() {
           return heightOfChairs;
        }

    /**
     * 
     * Returns the     * quality of     * the view from this table.     */

    public double getViewQuality() {
        /* implementation not shown */ }

    /**
     * 
     * Sets the     * quality of     * the view from this     * table to value.     
     * @return */

    public void setViewQuality(double value) {
       if(value > 8) {
            viewQuality = false;
        }
        else{ 
            viewQuality = true;} 
     }

    //


}
