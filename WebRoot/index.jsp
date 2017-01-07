<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>






org.springframework.jdbc.BadSqlGrammarException: 
### Error querying database.  Cause: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'sonne_game.t' doesn't exist
### The error may exist in file [D:\myeclipsespace\Sonne_game\WebRoot\WEB-INF\classes\sonn\web\entity\UserMapper.xml]
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: select ID,USRNAME,PASSWD from T USER
### Cause: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'sonne_game.t' doesn't exist
; bad SQL grammar []; nested exception is com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'sonne_game.t' doesn't exist
	at org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator.doTranslate(SQLErrorCodeSQLExceptionTranslator.java:237)
	at org.springframework.jdbc.support.AbstractFallbackSQLExceptionTranslator.translate(AbstractFallbackSQLExceptionTranslator.java:72)
	at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:73)
	at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:371)
	at com.sun.proxy.$Proxy2.selectList(Unknown Source)
	at org.mybatis.spring.SqlSessionTemplate.selectList(SqlSessionTemplate.java:198)
	at org.apache.ibatis.binding.MapperMethod.executeForMany(MapperMethod.java:122)
	at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:64)
	at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:53)
	at com.sun.proxy.$Proxy3.findAll(Unknown Source)
	at sonn.web.test.TestUserMapper.testFindAll(TestUserMapper.java:18)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:44)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:41)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)
	at org.junit.runners.BlockJUnit4ClassRunner.runNotIgnored(BlockJUnit4ClassRunner.java:79)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:71)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:49)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:193)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:52)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:191)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:42)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:184)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:236)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)
Caused by: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table 'sonne_game.t' doesn't exist
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:526)
	at com.mysql.jdbc.Util.handleNewInstance(Util.java:411)
	at com.mysql.jdbc.Util.getInstance(Util.java:386)
	at com.mysql.jdbc.SQLError.createSQLException(SQLError.java:1054)
	at com.mysql.jdbc.MysqlIO.checkErrorPacket(MysqlIO.java:4187)
	at com.mysql.jdbc.MysqlIO.checkErrorPacket(MysqlIO.java:4119)
	at com.mysql.jdbc.MysqlIO.sendCommand(MysqlIO.java:2570)
	at com.mysql.jdbc.MysqlIO.sqlQueryDirect(MysqlIO.java:2731)
	at com.mysql.jdbc.ConnectionImpl.execSQL(ConnectionImpl.java:2815)
	at com.mysql.jdbc.PreparedStatement.executeInternal(PreparedStatement.java:2155)
	at com.mysql.jdbc.PreparedStatement.execute(PreparedStatement.java:1379)
	at org.apache.commons.dbcp.DelegatingPreparedStatement.execute(DelegatingPreparedStatement.java:172)
	at org.apache.commons.dbcp.DelegatingPreparedStatement.execute(DelegatingPreparedStatement.java:172)
	at org.apache.ibatis.executor.statement.PreparedStatementHandler.query(PreparedStatementHandler.java:62)
	at org.apache.ibatis.executor.statement.RoutingStatementHandler.query(RoutingStatementHandler.java:78)
	at org.apache.ibatis.executor.SimpleExecutor.doQuery(SimpleExecutor.java:62)
	at org.apache.ibatis.executor.BaseExecutor.queryFromDatabase(BaseExecutor.java:303)
	at org.apache.ibatis.executor.BaseExecutor.query(BaseExecutor.java:154)
	at org.apache.ibatis.executor.CachingExecutor.query(CachingExecutor.java:102)
	at org.apache.ibatis.executor.CachingExecutor.query(CachingExecutor.java:82)
	at org.apache.ibatis.session.defaults.DefaultSqlSession.selectList(DefaultSqlSession.java:120)
	at org.apache.ibatis.session.defaults.DefaultSqlSession.selectList(DefaultSqlSession.java:113)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:358)
	... 30 more

