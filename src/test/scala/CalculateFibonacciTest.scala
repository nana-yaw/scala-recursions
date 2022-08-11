import munit.FunSuite

class CalculateFibonacciTest extends FunSuite {
  test("the Fibonacci number for a value 6 should be 8") {
    assertEquals(CalculateFibonacci.calculateFibonacci(6), 8)
  }
}
