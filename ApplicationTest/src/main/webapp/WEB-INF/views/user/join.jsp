<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>테스트 수행</title>
  </head>
<body>
	<div>
		<div>
			<p>Sign Up</p>
			<form action="/user/joinPost" method="post">
				<div>
					<input type="text" name="uid" placeholder="USER ID"/>
				</div>
				<div>
					<input type="password" name="upw" placeholder="USER PW"/>
				</div>
				<div>
					<input type="password" name="upw2" placeholder="RE PW"/>
				</div>
				<div>
					<input type="text" name="uname" class="form-control" placeholder="nick name"/>
				</div>
				<div>
					<div>
						<input type="submit" class="btn btn-primary btn-block btn-flat" value="Sign Up" />
					</div>
				</div>
			</form>
		</div>
	</div>
	<script>
		var message = "${message}";
		
		if(message != null && message != ""){
			alert(message);
		}
	</script>
</body>
</html>