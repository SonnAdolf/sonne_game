<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"   
 "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <title>sonne_game</title>  
    </head>  
    <body>  
         <p>Hello, here is sonne's game world.
         <#list lst as usr>
                 <p>The usr's usrname is ${usr.usrname}</p>
                 <p>The usr's passwd is ${usr.passwd}</p>
         </#list>
    </body>  
</html>  