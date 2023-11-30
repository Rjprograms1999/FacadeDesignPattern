
package FacadeDesignPattern;

public class Rectangle implements Shape {

    @Override
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder("Rectangle::draw(");
        for (String arg : arguments) {
            sb.append(arg).append(", ");
        }
        if (arguments.length > 0) {
            sb.setLength(sb.length() - 2); 
        }
        sb.append(")");
        System.out.println(sb.toString());
    }
}
