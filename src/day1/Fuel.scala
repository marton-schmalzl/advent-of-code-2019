package day1

import scala.io.Source

object Fuel extends App {
  val bufferedSource = Source.fromFile("./assets/day1-1.txt")

  println(bufferedSource.getLines.map(line => line.toInt).fold(0)((acc, it) => acc + math.floor(it / 3) .toInt - 2))

  val fuelCalc =  new ((Int) => Int) {
    def apply(mass: Int):Int = {
      val fuel:Int = math.floor(mass / 3).toInt - 2
      if (fuel > 0) {
        fuel + apply(fuel)
      } else {
        0
      }
    }
  }
  val bufferedSource2 = Source.fromFile("./assets/day1-1.txt")
  println(bufferedSource2.getLines.map(line => line.toInt).fold(0)((acc, it) => acc + fuelCalc(it)))

}