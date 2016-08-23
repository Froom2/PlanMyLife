package controllers

import models.Activity
import play.api.mvc.{Action, Controller}


class MainViewController extends Controller{

  def view = Action {

    val cycling = Activity("Cycling", "turning pedals")
    val walking = Activity("Walking", "moving feet")
    val aerobics = Activity("Aerobics", "flailing around the living room")
    val horseRiding = Activity("Horse Riding", "two hearts six legs")


    val activitiesList = List(cycling, walking, aerobics, horseRiding)
    Ok(views.html.activity(activitiesList))
  }
}
