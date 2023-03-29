object Driver extends App{
  private val squareObject =new SquareRoot
  val inputList = List(2, 4, 9, 16, 25)
  val result = squareObject.squareRootList(inputList)
  println(s"Square root of $inputList: \n$result")

}
