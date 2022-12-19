let index = {
	init: function() {
		$(".submit_button").on("click",() => {
			//화살표 함수를 사용하는 이유는 this를 바인딩하기 위해 사용하기 위함이다.
			this.save();
		});
	},
	
	save:function() {
		let data = {
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		};
		
	  /*ajax 호출시 default가 비동기 호출이다
		ajax통신을 이용해서 3개의 데이터를 json으로 변경하여 insert요청을 한다.
		ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트로 변환해준다.
		*/
		
		$.ajax({
			//회원가입 수행 요청
			type: "POST",
			url: "/payment",
			data: JSON.stringify(data), //http body 데이터
			contentType: "application/json; charset=utf-8",  //body데이더카 어떤타입인지를 나타내준다.
			dataType: "json"  //요청을 서버로해서 응답이 왔을 때,기본적으로 모든 것이 문자열 (생긴게 json이라면 javascript오브젝트로 변경해준다.)
			//응답의 결과가 문자열이 아닌 json으로 변환된다.
		}).done(function(data, status){
			alert("후원이 완료되었습니다.");
			location.href = "/";
			// 회원가입 오류 잡기 (아이디 중복일 경우) - GlobalExceptionHandler
			//응답이 정상
		}).fail(function(error){
			alert(JSON.stringify(error));
			//응답이 비정상
		});
		//ajax 통신을 이용해서 3개의 데이터를 jsons
	},
	}
index.init(); 