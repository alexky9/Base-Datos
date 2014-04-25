$(document).ready(function(){
    
    // alert("Prueba");
    $("#botonIngresar").click(function(){
        $.ajax({
           type:'post',
           url:'ingresar',
           data:{
               email:$('#textoEmail').val(),
               password:$('#textoPassword').val()
           },
           success:function(respuesta){  
               // alert("Prueba");
          if(respuesta==1){
              window.open('http://localhost:8095/base-datos/MENU.html',"nueva");
              
             //   $("#resultadoautenticar").html("La respuesta es "+respuesta);
             // $('#inicio').hide();
            
            //  $('#menu').show();
          }
          else $("#resultadoautenticar").html('datos incorrectos');
           }
          
        });
    });
    
   //  Colocar el Servlet para cada accion   
  alert("Prueba");
   $("#botonBuscar").click(function(){
        $.ajax({
           type:'get',
           url:'ACTUALIZAR',
           data:{
           emailB:$('#textoEmailB').val(),
           },
           success:function(respuesta){
          if(respuesta=='1'){
          $("#resultadoBuscar").html("La respuesta es "+respuesta);
          }
          else $('#errorsito').html('datos incorrectos');
           }
          
        });
    }); 
    
    
    
    
    
});