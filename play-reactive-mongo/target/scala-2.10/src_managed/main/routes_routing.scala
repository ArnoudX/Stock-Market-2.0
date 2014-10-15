// @SOURCE:C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/conf/routes
// @HASH:dc7eadab725b513d784b267f2bce58d84329713d
// @DATE:Wed Oct 15 17:13:56 CEST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("granpa",controllers.GranpaController),("father",controllers.FatherController),("son",controllers.SonController)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_GranpaController_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("granpa"))))
        

// @LINE:10
lazy val controllers_GranpaController2 = Include(controllers.GranpaController)
        

// @LINE:11
private[this] lazy val controllers_GranpaController_table3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("granpa/table"))))
        

// @LINE:14
private[this] lazy val controllers_FatherController_index4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("father"))))
        

// @LINE:15
lazy val controllers_FatherController5 = Include(controllers.FatherController)
        

// @LINE:16
private[this] lazy val controllers_FatherController_table6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("father/table"))))
        

// @LINE:19
private[this] lazy val controllers_SonController_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("son"))))
        

// @LINE:20
lazy val controllers_SonController8 = Include(controllers.SonController)
        

// @LINE:21
private[this] lazy val controllers_SonController_table9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("son/table"))))
        

// @LINE:24
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """granpa""","""controllers.GranpaController.index"""),controllers.GranpaController.documentation,("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """granpa/table""","""controllers.GranpaController.table"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """father""","""controllers.FatherController.index"""),controllers.FatherController.documentation,("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """father/table""","""controllers.FatherController.table"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """son""","""controllers.SonController.index"""),controllers.SonController.documentation,("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """son/table""","""controllers.SonController.table"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_GranpaController_index1(params) => {
   call { 
        invokeHandler(controllers.GranpaController.index, HandlerDef(this, "controllers.GranpaController", "index", Nil,"GET", """GranPa""", Routes.prefix + """granpa"""))
   }
}
        

// @LINE:10
case controllers_GranpaController2(handler) => handler
        

// @LINE:11
case controllers_GranpaController_table3(params) => {
   call { 
        invokeHandler(controllers.GranpaController.table, HandlerDef(this, "controllers.GranpaController", "table", Nil,"GET", """""", Routes.prefix + """granpa/table"""))
   }
}
        

// @LINE:14
case controllers_FatherController_index4(params) => {
   call { 
        invokeHandler(controllers.FatherController.index, HandlerDef(this, "controllers.FatherController", "index", Nil,"GET", """Father""", Routes.prefix + """father"""))
   }
}
        

// @LINE:15
case controllers_FatherController5(handler) => handler
        

// @LINE:16
case controllers_FatherController_table6(params) => {
   call { 
        invokeHandler(controllers.FatherController.table, HandlerDef(this, "controllers.FatherController", "table", Nil,"GET", """""", Routes.prefix + """father/table"""))
   }
}
        

// @LINE:19
case controllers_SonController_index7(params) => {
   call { 
        invokeHandler(controllers.SonController.index, HandlerDef(this, "controllers.SonController", "index", Nil,"GET", """Son""", Routes.prefix + """son"""))
   }
}
        

// @LINE:20
case controllers_SonController8(handler) => handler
        

// @LINE:21
case controllers_SonController_table9(params) => {
   call { 
        invokeHandler(controllers.SonController.table, HandlerDef(this, "controllers.SonController", "table", Nil,"GET", """""", Routes.prefix + """son/table"""))
   }
}
        

// @LINE:24
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     