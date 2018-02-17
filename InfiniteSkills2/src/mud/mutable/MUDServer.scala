package mud.mutable

import io.StdIn._
import scala.annotation.tailrec

object MUDServer extends App {
  println("What is your name?")
  val name = readLine()
  
  var age = -1
  do {
    try {
      println("What is your age?")
      age = readLine().toInt
    }
    catch {
      case e: NumberFormatException => None
    }
  } while (age == -1)
    
  //val player0 = new Player(name, age, List[Item](), "inn") 
  val player = Player(name, age, "inn")
  val rooms = (xml.XML.loadFile("map.xml") \ "room").map(n => {
    val room = Room(n)
    room.keyword -> room
  }).toMap
  println("Welcome to a simple text adventure.")
  rooms(player.currentRoom).print()
  var input = ""
  while(input != "quit") {
    print("> ")
    input = readLine().trim
    if (input != "quit") {
      player.process(input, rooms)
    }
  }
  println("Goodbye!")
}