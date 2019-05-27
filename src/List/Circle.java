package List;

import java.awt.*;

public class Circle extends Shape
{
    @Override
    public void draw(Canvas canvas) {
        System.out.println("在"+canvas+"画出一个圆");
    }
}
