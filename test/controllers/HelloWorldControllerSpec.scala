import org.scalatest.MustMatchers
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.test.FakeRequest
import play.api.test.Helpers._

class HelloWorldControllerSpec extends PlaySpec with OneServerPerSuite with MustMatchers {

  "HelloWorldController" should {
    "respond to '/'" in {
      val Some(result) = route(app, FakeRequest(GET, "/"))
      status(result) mustNot be(NOT_FOUND)
    }
  }

  "index" should {
    "have a status of OK" in {
      val Some(result) = route(app, FakeRequest(GET, "/"))
      status(result) must be(OK)
    }
  }
}
