package triangle_type_test;

import static org.junit.Assert.assertEquals;
import static triangle_type.TriangleType.EQUILATERAL;
import static triangle_type.TriangleType.INVALID;
import static triangle_type.TriangleType.ISOSCELES;
import static triangle_type.TriangleType.SCALENE;

import org.junit.Test;

import triangle_type.TriangleDefinition;
import triangle_type.TriangleType;

public class TriangleDefinitionTest {

  @Test
  public void test1() {
    final TriangleType type = TriangleDefinition.classify(4.5, 7.9, 3.3);
    assertEquals(SCALENE, type);
  }

  @Test
  public void testInvalid1() {
    final TriangleType type = TriangleDefinition.classify(5.6, 8.9, 5.5);
    assertEquals(INVALID, type);
  }

  @Test
  public void testInvalid2() {
    final TriangleType type = TriangleDefinition.classify(3.2, 9.8, 2.4);
    assertEquals(INVALID, type);
  }

  @Test
  public void testInvalid3() {
    final TriangleType type = TriangleDefinition.classify(7.8, 9.4, 2.1);
    assertEquals(INVALID, type);

  }

  @Test
  public void testInvalidNeg1() {
    final TriangleType type = TriangleDefinition.classify(-3,3,3);
    assertEquals(INVALID, type);
  }

  @Test
  public void testInvalidNeg2() {
    final TriangleType type = TriangleDefinition.classify(3, -3, 3);
    assertEquals(INVALID, type);
  }

  @Test
  public void testInvalidNeg3() {
    final TriangleType type = TriangleDefinition.classify(3, 3, -3);
    assertEquals(INVALID, type);
  }

  @Test
  public void testEquiliteral() {
    final TriangleType type = TriangleDefinition.classify(3, 3, 3);
    assertEquals(EQUILATERAL, type);
  }

  @Test
  public void testIsoceles1() {
    final TriangleType type = TriangleDefinition.classify(7, 7, 5);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testIsoceles2() {
    final TriangleType type = TriangleDefinition.classify(7, 5, 7);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testIsoceles3() {
    final TriangleType type = TriangleDefinition.classify(1, 3, 3);
    assertEquals(ISOSCELES, type);
  }

  @Test
  public void testInvalid() {
    final TriangleType type = TriangleDefinition.classify(3, 4, 4);
    assertEquals(INVALID, type);
  }
}
