<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
 "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>sonne_game</title>  
    </head>  
    <body>  
         <p>Here,log in</p>
         <form id="loginForm" action="/Sonne_game/login/login.form"  method="post">
               usrname:<input name="usrname"/><br>
               passwd:<input name="passwd"/><br>
               <button type="submit" id="submit" style="height:20px;width:55px;">submit</button>
         </form>
             <script type="text/javascript" src="${base}/Jquery/jquery-1.3.1.js"></script>
             <script type="text/javascript" src="${base}/Jquery/jquery.form.js"></script>              
             <script type="text/javascript">
  			  $(document).ready(function() { 
				  $('#loginForm').ajaxForm({ 
			             dataType:      'json',
						 beforeSubmit:  validate,   
						 success:       successFunc
			   	  });
		       });
			   function validate(formData, jqForm, options) {
                    return true; 
				}
				function successFunc(data) {
					if (data.success) {
				        alert("登录成功："+" " + data.msg);
					}
					else {
						alert("登录失败："+" " + data.msg);
					}
				}
               </script>
    </body>  
</html> 