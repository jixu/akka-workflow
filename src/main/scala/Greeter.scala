import akka.actor.{Props, Actor}

/**
 * @author jixu
 */

object Greeter {
  case object Greet
  case object Done
  def props(name: String): Props = Props(classOf[Greeter], name)
}

class Greeter extends Actor {
  def receive = {
    case Greeter.Greet =>
      println("Hello Akka!")
      sender ! Greeter.Done
  }
}
