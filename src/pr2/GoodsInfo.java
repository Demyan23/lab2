package pr2;

public class GoodsInfo {

    protected String material;
    protected int weight;
    protected String colour;

    private double price;


    public String getMaterialType() {
        return material;
    }

    public void setMaterialType(String materialSet) {
        material = materialSet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weightSet) {
        weight = weightSet;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colourSet) {
        colour = colourSet;
    }

    @Override
    public String toString() {
        return "Material:" + material + "\n" + "Weight:" + weight + "\n" +"Colour:" + colour;
    }
    public GoodsInfo(String materialSet, int weightSet, String colourSet) {
        material = materialSet;
        weight = weightSet;
        colour = colourSet;

    }
}
