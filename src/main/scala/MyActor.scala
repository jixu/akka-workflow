import akka.actor.Actor
import akka.event.Logging

/**
 * @author jixu
 */
class MyActor extends Actor {
  val log = Logging(context.system, this)
  def receive = {
    case "test" => log.info("receive test")
    case _ => log.info("receive unknown message")
  }
}
