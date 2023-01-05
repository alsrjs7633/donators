let product={
	init: function(){
		
		$("#payment_button").on("click",()=>{
			//화살표 함수사용 이유:this를 바인딩하기 위해 사용한다.
			this.paymentregister();
		});
		},
	paymentregister: function(){
		//alert('user의 save함수 호출됨');
/*		let id=$(id).val();*/
		
		let data={
			pName:$("#pName").val(),  //상품이름
			pPrice:$("#pPrice").val()  //후원금액
		};
		console.log(data.title)
		console.log(data.content)
		$.ajax({
			type:"POST",
			url:"/product",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("결제가 완료되었습니다~~~~~~~~~~~~~~~~.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	
	
}
}


product.init();