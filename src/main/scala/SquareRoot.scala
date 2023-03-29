
import scala.util.Try
import scala.util.{Try, Success, Failure}

class SquareRoot {

  def squareRootList(list: List[Int]): List[Int] = {
    list.map { element =>
      Try(Math.sqrt(element).toInt) match {
        case Success(result) => result
        // If an exception was thrown, return 0 to indicate invalid input
        case Failure(exception) => 0
      }
    }
  }

}
