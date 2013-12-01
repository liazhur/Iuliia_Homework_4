package task4;

public class Flower  {
    private final String flowerName;
    private final String flowerColor;
    private final int flowerSize;
    private final int flowerPrice;

    private Flower(FlowerBuilder builder){
        this.flowerName = builder.flowerName;
        this.flowerColor = builder.flowerColor;
        this.flowerSize = builder.flowerSize;
        this.flowerPrice = builder.flowerPrice;
    }
    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public int getFlowerSize() {
        return flowerSize;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;

        Flower flowers = (Flower) o;

        if (flowerPrice != flowers.flowerPrice) return false;
        if (flowerSize != flowers.flowerSize) return false;
        if (flowerColor != null ? !flowerColor.equals(flowers.flowerColor) : flowers.flowerColor != null) return false;
        if (flowerName != null ? !flowerName.equals(flowers.flowerName) : flowers.flowerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = flowerName != null ? flowerName.hashCode() : 0;
        result = 31 * result + (flowerColor != null ? flowerColor.hashCode() : 0);
        result = 31 * result + flowerSize;
        result = 31 * result + flowerPrice;
        return result;
    }

    @Override
    public String toString() {
//        return "Flower{" +
//                "flowerName='" + flowerName + '\'' +
//                ", flowerColor='" + flowerColor + '\'' +
//                ", flowerSize=" + flowerSize +
//                ", flowerPrice=" + flowerPrice +
//                '}';
        return "Flower - " + flowerName;
    }

   public static class FlowerBuilder{

       private String flowerName;
       private String flowerColor;
       private int flowerSize;
       private int flowerPrice;

       public FlowerBuilder flowerName(String flowerName){
           this.flowerName = flowerName;
           return this;
       }
       public FlowerBuilder flowerColor(String flowerColor){
           this.flowerColor = flowerColor;
           return this;
       }
       public FlowerBuilder flowerSize(int flowerSize){
           this.flowerSize = flowerSize;
           return this;
       }
       public FlowerBuilder flowerPrice(int flowerPrice){
           this.flowerPrice = flowerPrice;
           return this;
       }
       public Flower build(){
           return new Flower(this);
       }
}
}
