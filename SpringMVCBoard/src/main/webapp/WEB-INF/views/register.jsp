<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>글등록</h2>
  <div class="panel panel-default">
    <div class="panel-heading">Board Register</div>
    <div class="panel-body">
		<form action="<c:url value='/register.do'/>" method="post">
	    <div class="form-group">
	      <label>Title</label>
	      <input type="text" class="form-control" id="title" name="title">
	    </div>
	    <div class="form-group">
	      <label>Text area</label>
	      <textarea rows="3" class="form-control" name="contents"></textarea>
	    </div>
		<div class="form-group">
	      <label>Writer</label>
	      <input type="text" class="form-control" id="writer" name="writer">
	    </div>
	    <button type="submit" class="btn btn-default">글등록</button>
	     <button type="reset" class="btn btn-default">다시입력</button>
	  </form>
	</div>
  </div>
   <div class="panel-footer">인프런화이팅!</div>
</div>

</body>
</html>
