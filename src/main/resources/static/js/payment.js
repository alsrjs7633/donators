
/*    $(document).ready(function() {
		$('#payment_button').click(function() {
			if ($("input[type=radio][name=chk_money]:checked").val()) {
				alert('후원이 완료되었습니다.');
						location.href="/"
				}
				else {
					alert('체크해주세요.');
				}
			})
		});
		*/
$(function(){
		$('#payment_button').click(function(){
			$.ajax({
		    	url:'/cls/payment/kakaopay.cls' ,
				dataType:'json'  ,
				success:function(data){
				    var box = data.next_redirect_pc_url;
				    window.open(box);
				   // console.log(data.tid);
				} ,
				error:function(error){
					alert(error);
				}
			});
		});
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	


// 카카오결제
/*	$(function(){
		$("#payment_button").click(function(){
			
			// 필수입력값을 확인.
			var name = $("#form-payment input[name='pay-name']").val();
			var tel = $("#form-payment input[name='pay-tel']").val();
			var email = $("#form-payment input[name='pay-email']").val();
			
			if(name == ""){
				$("#form-payment input[name='pay-name']").focus()
			}
			if(tel == ""){
				$("#form-payment input[name='pay-tel']").focus()
			}
			if(email == ""){
				$("#form-payment input[name='pay-email']").focus()
			}
			
			// 결제 정보를 form에 저장한다.
			let totalPayPrice = parseInt($("#total-pay-price").text().replace(/,/g,''))
			let totalPrice = parseInt($("#total-price").text().replace(/,/g,''))
			
			// 카카오페이 결제전송
			$.ajax({
				type:'get'
				,url:'/paymentTest'
				,data:{
					total_amount: totalPayPrice
					,payUserName: name
					,sumPrice:totalPrice
					,totalPrice:totalPayPrice
					,tel:tel
					,email:email
					
				},
				success:function(response){
					location.href = response.next_redirect_pc_url			
				}
			})
		})
	})


*/











/*ajax 호출시 default가 비동기 호출이다
  ajax통신을 이용해서 3개의 데이터를 json으로 변경하여 insert요청을 한다.
  ajax가 통신을 성공하고 서버가 json을 리턴해주면 자동으로 자바 오브젝트로 변환해준다.
  */

let payment = {
	init: function() {
		$("#payment_button").on("click",()=>{
			this.payment();
		});
	},

	payment: function() {
		let data = {
			id: $("#userId").val(),
			
		};

		var IMP = window.IMP;
		IMP.init('imp31226588');
		var msg;

		IMP.request_pay({
			pg: 'kakaopay',
			pay_method : 'card',
			merchant_uid : '기부자들' + new Date().getTime(),
			name : "기부자들",
			amount : 1,
		}, function(resp) {

			if (resp.success) {
				$.ajax({
					url: "/",
					type: 'POST',
					dataType: 'json',
					data: {
						imp_uid: resp.imp_uid
					}
				}).done(function (data) {
					if (all_fine) {
						msg = '결제가 완료되었습니다';
						msg += '\n고유ID : ' + resp.imp_uid;
						msg += '\n상점 거래ID : ' + resp.merchant_uid;
						msg += '\n결제 금액 : ' + resp.paid_amount;
						msg += '\n카트 승인번호 : ' + resp.apply_num;

						alert(msg);

					} else {
						alert("결제실패");
					}
				});
			location.href = "/";
			} else {
				msg = '결제에 실패하였습니다'
				msg += '에러내용 : ' + resp.error_msg;
				location.href = "/payment";
				alert(msg);
			}
			alert("결제가 완료되었습니다.")
			$.ajax({
				type: "POST",
				url: "/" + data.id,
				data: JSON.stringify(data),
				contentType: "application/json; charset=utf-8",
				dataType: "json"
			})
		});
	}

}
payment.init();

