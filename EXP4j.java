class rectangle {
    double length, width, area;
    String color;

    void set_length(double l) {
        length = l;
    }

    void set_width(double w) {
        width = w;
    }

    void set_color(String a) {
        color = a;
    }

    String getColor() {
        return color;
    }

    void find_area() {
        area = length * width;
    }

    double getArea() {
        return area;
    }
}

public class EXP4j {
    public static void main(String args[]) {
        rectangle r1 = new rectangle();
        r1.set_length(8);
        r1.set_width(2);
        r1.set_color("RED");
        r1.find_area();

        rectangle r2 = new rectangle();
        r2.set_length(8);
        r2.set_width(2);
        r2.set_color("RED");
        r2.find_area();

        if(r1.getColor().equals(r2.getColor()) && r1.area == r2.area) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non Matching Rectangles");
        }
    }
}

