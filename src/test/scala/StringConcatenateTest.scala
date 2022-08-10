import munit.FunSuite

class StringConcatenateTest extends FunSuite {
  test("concatenate the word 'hello' three times") {
    assertEquals(StringConcatenate.concatenateString(3, "hello"), "hellohellohello")
  }
}
