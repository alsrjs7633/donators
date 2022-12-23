
$(document).ready(function () {
      $('.jcheckAll').click(function () {
        $('.jcheckOne').prop('checked',this.checked);
      });
      
      
    });
    

let index={
	check: function(){//필수 입력사항 체크
	  var ch1=$('#jch2').is(':checked');
      var ch2=$('#jch1').is(':checked');
      return ch1&&ch2;
	},
	pa:function(){//선택사항 체크시 1
		if($('#phoneAgree').is(':checked')){
			return 1;
		}
	},
	ea:function(){//선택사항 체크시 1
		if($('#emailAgree').is(':checked')){
			return 1;
		}
	},
	//아이디 중복체크
	file:function(){
		$("#upload_btn").on("click",()=>{
    
    var formData = new FormData($("#fileForm")[0]);
 
    $.ajax({
        type : 'post',
        url : '/upload',
        data : formData,
        processData : false,
        dataType : "json",
        contentType : false,
        async    : false,
        success : function(data) {
            alert("파일 업로드 성공.");
        },
        error : function(error) {
            alert("파일 업로드에 실패하였습니다.");
           
        }
    });      
 
});   
	} ,
	
	//회원가입
	init: function(){
		$("#join_save").on("click",()=>{
			if(index.check()){
			this.save();
			}else{
				alert("약관에 동의해주세요");
				location.href="/auth/joinForm"
			}
			
		});
		$("#upload_btn").on("click",()=>{
			
			this.upload();
		
		});
		
	},
	upload:function(){
		var formData=new FormData();
		var inputFile=$('input[name="proofFile"]');
		var files=inputFile[0].files;
		formData.append('key1','value1');
		formData.append('key2','value2');
		
		for(var i=0;i<files.length;i++){
			formData.append('uploadFiles',files[i]);
		}
		$.ajax({ 
			//(100초라 가정한다면 도중에 done이나 fail 실행 )
			type:"POST",
			url:"/upload",
			data:formData, //http body 데이터
			contentType:false,
			processData:false,
			//dataType:"json" //자동으로 변환해주기 때문에 생략 가능
			//응답의 결과가 문자열이 아닌 json으로 변환
		}).done(function(resp){
			alert("업로드가 완료되었습니다.");
			location.href="/";
			//응답이 정상
		}).fail(function(error){
			alert(JSON.stringify(error));
			//응답이 비정상
		});
		
	},
	

	save: function(){
		let data={
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val(),
			name: $("#name").val(),
			tel: $("#tel").val(),
			birth: $("#birth").val(),
			phoneagree: index.pa(),
			emailagree: index.ea(),
			gender: $("input[name='genderch']:checked").val()
		}
		$.ajax({ 
			//회원가입 수행 요청 
			//(100초라 가정한다면 도중에 done이나 fail 실행 )
			type:"POST",
			url:"/auth/joinProc",
			data:JSON.stringify(data), //http body 데이터
			contentType:"application/json; charset=utf-8",
			dataType:"json" //자동으로 변환해주기 때문에 생략 가능
			//응답의 결과가 문자열이 아닌 json으로 변환
		}).done(function(resp){
			alert("회원가입이 완료되었습니다.");
			location.href="/";
			//응답이 정상
		}).fail(function(error){
			alert(JSON.stringify(error));
			//응답이 비정상
		});
	},
}
	

index.init();
index.file();

