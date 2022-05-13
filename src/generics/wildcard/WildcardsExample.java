package generics.wildcard;

import java.util.List;

public class WildcardsExample {

    public void printShapes(List<? extends Shape> shapes) {
        System.out.println(shapes);
    }

    public void printTriangleParents(List<? super Triangle> shapes) {
        System.out.println(shapes);
    }

    public void printList(List<?> list) {
        System.out.println(list);
        Object object = list.get(0);
    }

    public static <T extends  Polygon & Shape> long getPerimeter() {
        //Todo implementation;
        return 0;
    }
}
