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