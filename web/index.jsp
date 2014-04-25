<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Alex</title>
       
        <link rel="stylesheet" href="css/themes/default/jquery.mobile-1.3.1.css"/>
        <script src="js/jquery.js"></script>
        <script src="js/jquery.mobile-1.3.1.js"></script>
           <script src="actualizar.js"></script>
    </head>
    
        <body>
        <div data-role="page" id="INDEX"> 
            <div data-role="header">
               <center>
                <h1>PROYECTO BD II MARCO ALEJANDRO PACHECO HERNADEZ</h1>
                </center>
              </div>
                 
                <center><img src="BOTONES/email.jpg" ></center>
                  <center><h2>EMAIL</h2></center>
                  <input type="text" name="email" id='textoEmail'>
                 
                   
                  <center><img src="BOTONES/PASSWORD.png"></center>
                  <center><h2>PASSWORD</h2></center>
                  <input type="password" name="email" id='textoPassword'>
                 
            <input type="button" value="ingresar" id="botonIngresar"> 
       
            <div id='resultadoautenticar'></div>
            
    </body>
     <div data-role="footer" data-position="fixed">
         <h2> COPYRINGHT 2014</h1>
         </div>  
</html>


  
      <!--PAGINA INSERTAR --> 
      <div  data-role="page" id="INSERTAR">
          <div data-role="header">
              <h2>INSERTAR<h2/>
              <a href="#menu" data-icon="home">regresar</a>
              </div>
      <div  data-role="content">
          <from action="ServletInsertar" method="GET">  
           <p>Id</p>  
               <input type="text" name="id"/>  
          <p>Nombre</p>
             <input type="text" name="nombre"/>
             
             <p>Email</p>  
               <input type="text" name="email"/>
              
               <p>Password</p>  
               <input type="password" name="password"/>
               
               <input type="submit" value="GUARDAR"/>
               </form>
         </div> <!--CIERRA CONTENT</> -->     
         </div> <!--CIERRA PAGINA INSERTAR </> -->  