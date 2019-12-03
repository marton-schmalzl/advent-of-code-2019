package day1

import scala.io.Source

object Fuel extends App {
  println(System.getProperty("user.dir"))
  println("Hello, World!")
  val bufferedSource = Source.fromFile("./assets/day1-1.txt")

  println(bufferedSource.getLines.map(line => line.toInt).fold(0)((acc, it) => acc + math.floor(it / 3) .toInt - 2))
}