package controllers

import org.scalatest.{MustMatchers, WordSpec}
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.test.FakeRequest
import play.api.test.Helpers._


class MainViewControllerSpec extends PlaySpec with OneServerPerSuite with MustMatchers {

  val controller = new MainViewController


  "MainViewController" should {
    "respond with OK and show the main view page with a list of activities" in {

      val Some(result) = route(app, FakeRequest(GET, "/view"))
      status(result) must be(OK)

      contentAsString(result) must include("Cycling")
    }
  }



}
