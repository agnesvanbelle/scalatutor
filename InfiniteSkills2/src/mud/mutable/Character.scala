package mud.mutable

trait Character {
  val name: String
  val age: Int
  def items: List[Item]
  def currentRoom: String
}