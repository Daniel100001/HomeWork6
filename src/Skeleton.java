public class Skeleton extends Boss {
    int numberOfArrows;


    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }


    @Override
    public String info() {
        return super.info() + "  "  +"Arrows:  " + numberOfArrows;
    }
}
