package controllers

import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def signup = Action {
    Ok(views.html.signup("cybereek"))
  }
}