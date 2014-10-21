// @SOURCE:C:/Users/Arnoud/Stock-Market-2.0/play-reactive-mongo/conf/routes
// @HASH:1ef086a3e733a97b23a47e8826c66bbb7f1e3f74
// @DATE:Tue Oct 21 12:01:14 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:9
class ReverseGranpaController {
    

// @LINE:11
def table(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "granpa/table")
}
                                                

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "granpa")
}
                                                
    
}
                          

// @LINE:21
// @LINE:19
class ReverseSonController {
    

// @LINE:21
def table(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "son/table")
}
                                                

// @LINE:19
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "son")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:16
// @LINE:14
class ReverseFatherController {
    

// @LINE:16
def table(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "father/table")
}
                                                

// @LINE:14
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "father")
}
                                                
    
}
                          
}
                  


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:9
class ReverseGranpaController {
    

// @LINE:11
def table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GranpaController.table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "granpa/table"})
      }
   """
)
                        

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GranpaController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "granpa"})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:19
class ReverseSonController {
    

// @LINE:21
def table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SonController.table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "son/table"})
      }
   """
)
                        

// @LINE:19
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SonController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "son"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:16
// @LINE:14
class ReverseFatherController {
    

// @LINE:16
def table : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FatherController.table",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "father/table"})
      }
   """
)
                        

// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FatherController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "father"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:24
class ReverseAssets {
    

// @LINE:24
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:9
class ReverseGranpaController {
    

// @LINE:11
def table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GranpaController.table(), HandlerDef(this, "controllers.GranpaController", "table", Seq(), "GET", """""", _prefix + """granpa/table""")
)
                      

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GranpaController.index(), HandlerDef(this, "controllers.GranpaController", "index", Seq(), "GET", """GranPa""", _prefix + """granpa""")
)
                      
    
}
                          

// @LINE:21
// @LINE:19
class ReverseSonController {
    

// @LINE:21
def table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SonController.table(), HandlerDef(this, "controllers.SonController", "table", Seq(), "GET", """""", _prefix + """son/table""")
)
                      

// @LINE:19
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SonController.index(), HandlerDef(this, "controllers.SonController", "index", Seq(), "GET", """Son""", _prefix + """son""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:16
// @LINE:14
class ReverseFatherController {
    

// @LINE:16
def table(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FatherController.table(), HandlerDef(this, "controllers.FatherController", "table", Seq(), "GET", """""", _prefix + """father/table""")
)
                      

// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FatherController.index(), HandlerDef(this, "controllers.FatherController", "index", Seq(), "GET", """Father""", _prefix + """father""")
)
                      
    
}
                          
}
        
    