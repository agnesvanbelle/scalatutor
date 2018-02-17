package mud.immutable

import io.StdIn._
import scala.annotation.tailrec

object MUDServer extends App {
  private def intro(player: Player, rooms: Map[String, Room]): Unit = {
    println("Welcome to a simple text adventure.")
    rooms(player.currentRoom).print()
    step(player, rooms)
  }
  
  @tailrec
  private def step(player: Player, rooms: Map[String, Room]): Unit = {
    print("> ")
    val input = readLine().trim
    if (input != "quit") {
      val (newPlayer, newRooms) = player.process(input, rooms)
      step(newPlayer, newRooms)
    }
  }
  
  @tailrec
  private def getAge(): Int  = {
    try {
      println("What is your age?")
      readLine().toInt
    }
    catch {
      case e: NumberFormatException => getAge()
    }
  }

  println("What is your name?")
  intro(Player(readLine(), getAge(), "inn"), (xml.XML.loadFile("map.xml") \ "room").map(n => {
    val room = Room(n)
    room.keyword -> room
  }).toMap)
  println("Goodbye!")
}