class SumBetweenNumbersTest extends munit.FunSuite {
  val numOne = 2
  val numTwo = 6

  test("when integers parsed have same value should throw exception") {
    intercept[java.lang.IllegalArgumentException]{
      SumBetweenNumbers.sumNumbers(numOne, numOne)
    }

//    interceptMessage[java.lang.IllegalArgumentException]("integers args should not have the same value"){
//      SumBetweenNumbers.sumNumbers(2,2)
//    }
  }

  test("when you add numbers between 2 and 6 should return 12") {
    assertEquals(SumBetweenNumbers.sumNumbers(2, 6), 12)
  }

}
