/**
 * Created by Grand Circus Student on 7/24/2017.
 */
public class Color extends shoes {

    public String colorName;

    public Color(String brand, int shoeSize) {
        super(brand, shoeSize);
    }

    public Color(String brand, int shoeSize, String colorName) {
        super(brand, shoeSize);
        this.colorName = colorName;

    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}