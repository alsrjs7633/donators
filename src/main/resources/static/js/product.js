let product={
	init: function(){
		
		$("#payment_button").on("click",()=>{
			//화살표 함수사용 이유:this를 바인딩하기 위해 사용한다.
			this.save();
		});
	save: function(){
		//alert('user의 save함수 호출됨');
		let data={
			title:$("#pName").val(),
			content:$("#pPrice").val()
		};
		$.ajax({
			type:"POST",
			url:"/api/product",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("결제가 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	
	
}


product.init();