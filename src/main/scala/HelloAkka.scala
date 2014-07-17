import akka.actor.Actor
import akka.actor.Props

/**
 * @author jixu
 */
class HelloAkka extends Actor {
  override def preStart(): Unit = {
    val greeter = context.actorOf(Props[Greeter], "greeter")
    greeter ! Greeter.Greet
  }
  def receive = {
    case msg: String => context.stop(self)
  }
}
