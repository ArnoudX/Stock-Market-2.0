package controllers

import play.api._
import play.api.mvc._
import reactivemongo.bson._
import reactivemongo.api.collections.default._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
}