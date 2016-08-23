package controllers

import play.api.mvc.{Action, Controller}


class MainViewController extends Controller{

  def view = Action {
    Ok(views.html.activity("Cycling"))
  }
}
