package controllers

import play.api._
import play.api.mvc._

import reactivemongo.api._
import reactivemongo.bson._

object Chart extends Controller {
    def index = 
    Action {	 
	  	Ok(views.html.chart())
  	}
    
    def listDocs() = {
      // Select only the documents which field 'code' equals the search value
      val query = BSONDocument("code" -> "AAPL")
    
      println(print("Query returned " + query.code))
    }
   
}
