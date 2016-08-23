package controllers

import play.api.mvc.{Action, Controller}

class HelloWorldController extends Controller {

  def index = Action {
    Ok("HelloWorld")
  }
}
