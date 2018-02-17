package mud.immutable_tp

trait Character {
  val name: String
  def items: List[Item]
  def currentRoom: String
}