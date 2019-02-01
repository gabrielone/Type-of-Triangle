package triangle_type;


public class TriangleDefinition {

  public static TriangleType classify(final double invalid, final double scalene, final double isosceles) {
    int triangle_length;
    if ((invalid <= 0) || (scalene <= 0) || (isosceles <= 0)) {
      return TriangleType.INVALID;
    }
    triangle_length = 0;
    if (invalid == scalene) {
      triangle_length = triangle_length + 1;
    }
    if (invalid == isosceles) {
      triangle_length = triangle_length + 2;
    }
    if (scalene == isosceles) {
      triangle_length = triangle_length + 3;
    }
    if (triangle_length == 0) {
      if (((invalid + scalene) < isosceles) || ((invalid + isosceles) < scalene) || ((scalene + isosceles) < invalid)) {
        return TriangleType.INVALID;
      } else {
        return TriangleType.SCALENE;
      }
    }
    if (triangle_length > 3) {
      return TriangleType.EQUILATERAL;
    }
    if ((triangle_length == 1) && ((invalid + scalene) > isosceles)) {
      return TriangleType.ISOSCELES;
    } else if ((triangle_length == 2) && ((invalid + isosceles) > scalene)) {
      return TriangleType.ISOSCELES;
    } else if ((triangle_length == 3) && ((scalene + isosceles) > invalid)) {
      return TriangleType.ISOSCELES;
    }
    return TriangleType.INVALID;
  }

}
