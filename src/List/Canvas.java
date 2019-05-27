package List;

import java.util.ArrayList;
import java.util.List;

public class Canvas
{
//    public void drawAll(List<?> shape)
//    {
//        for (Object list :
//                shape)
//        {
//            ((Shape)list).draw(this);
//        }
//    }
    public void drawAll(List<? extends Shape> shapes)
    {
        for (Shape list:
        shapes )
        {
            list.draw(this);
        }
    }
    public static void main(String[] args)
    {
        Canvas canvas=new Canvas();
        List<Circle> circles=new ArrayList<Circle>();
        circles.add(new Circle());
        circles.add(new Circle());
        List<Rectangle> rectangles=new ArrayList<Rectangle>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
//        canvas.drawAll(circles);
        canvas.drawAll(rectangles);
    }
}
