import java.util
import scala.util.Random

@inline
class Match {

  var round: Int = 0;

}

@inline
object Match {
}

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello world!")

    var result: Int = 0;
    GenMatches(16).forEach(a => {
      a.forEach(b => {
        println(s"Match Round : " + b.round)
      })
    })
    println(s"Total amount of Matches = " + result)
  }

  def GenMatches(teams: Int): util.ArrayList[util.ArrayList[Match]] = {
    var tmpTeamsUpper: Int = teams
    var tmpTeamsLower: Int = teams
    var result = util.ArrayList[util.ArrayList[Match]]

    var upper = util.ArrayList[Match]()
    var _round: Int = 1;
    while (tmpTeamsUpper / 2 > 1) {
      for (x <- 1 to (tmpTeamsUpper / 2)) {
        val _match = Match()
        _match.round = _round;
        upper.add(_match)
      }
      _round += 1
      tmpTeamsUpper = tmpTeamsUpper / 2
    }
    val _match = Match()
    _match.round = _round;
    upper.add(_match)


    result.add(upper)


    println("result = " + result.toString);

    result
  }
}