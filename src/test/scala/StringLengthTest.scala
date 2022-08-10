import munit.FunSuite

class StringLengthTest extends FunSuite {
  test("the word 'hello' has length 5") {
    assertEquals(StringLength.getLengthOfString("hello"), 5)
  }
}
