import com.company.Rectangle;
import com.company.Shape;

public class Square extends Rectangle implements Shape {
    public Square(double length){
        this.length=length;
        this.width=length;
    }



    @Override
    public double area(){
        return super.area();
    }
    @Override
    public double surface(){
        return super.surface();
    }
}
