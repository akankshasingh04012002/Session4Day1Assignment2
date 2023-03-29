import org.scalatest.flatspec.AnyFlatSpec

class SquareRootTest extends AnyFlatSpec {

  val rootFinder = new SquareRoot

  "SquareRoot" should "return the square root of each element in the list as an integer" in {
    val inputList = List(4, 16, 25, 36)
    val expectedOutputList = List(2, 4, 5, 6)
    assert(rootFinder.squareRootList(inputList) === expectedOutputList)
  }

  it should "return 0 for invalid input" in {
    val inputList = List(-4, -16, -25, -36)
    val expectedOutputList = List(0, 0, 0, 0)
    assert(rootFinder.squareRootList(inputList) === expectedOutputList)
  }

  it should "return an empty list when given an empty list" in {
    val inputList = List()
    val expectedOutputList = List()
    assert(rootFinder.squareRootList(inputList) === expectedOutputList)
  }
}