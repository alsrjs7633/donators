package com.cos.pj.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.pj.service.UserService;

@Controller
@RequestMapping("/payment")

//@Slf4j
//@Controller
//세션에 저장된 겂을 사용할때 쓰는 어노테이션, session에서 없으면 model까지 훑어서 찾아냄.
//@SessionAttributes({"tid","order"}) 

public class PaymentController {

	@Autowired
	private UserService userService;

	@RequestMapping("/kakaopay.cls")
	@ResponseBody
	public String kakaopay() {
		try {
			URL 주소 = new URL("https://kapi.kakao.com/v1/payment/ready");
			HttpURLConnection 서버연결 = (HttpURLConnection) 주소.openConnection();
			서버연결.setRequestMethod("POST");
			서버연결.addRequestProperty("Authorization", "KakaoAK 5bad5fbfe423a47edbc7e1cf29963ed3");
			서버연결.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			서버연결.setDoOutput(true);
			String 파라미터 = "cid = TC0ONETIME&partner_order_id&partner_user_id=partner_user_id&item_name=engitem&quantity=1&total_amount=2200&vat_amount=0&tax_free_amount=0&approval_url=http://localhost/cls/jq/pay.cls";
			OutputStream 주는애 = 서버연결.getOutputStream();
			DataOutputStream 데이터주는애 = new DataOutputStream(주는애);
			데이터주는애.writeBytes(파라미터);
			데이터주는애.close();

			int 결과 = 서버연결.getResponseCode();

			InputStream 받는애;
			if (결과 == 200) {
				받는애 = 서버연결.getInputStream();
			} else {
				받는애 = 서버연결.getErrorStream();
			}
			InputStreamReader 읽는애 = new InputStreamReader(받는애);
			BufferedReader 형변환하는애 = new BufferedReader(읽는애);
			return 형변환하는애.readLine();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "{\"result\":\"NO\"}";
	}

}

// 카카오페이결제 요청
/*
 * @GetMapping("/payment") public @ResponseBody PaymentReady
 * payReady(@RequestParam(name = "total_amount") int totalAmount, Order order,
 * Model model) {
 * 
 * log.info("주문정보:"+order); log.info("주문가격:"+totalAmount); // 카카오 결제 준비하기 - 결제요청
 * service 실행. PaymentReady paymentReady = PaymentService.payReady(totalAmount);
 * // 요청처리후 받아온 결재고유 번호(tid)를 모델에 저장 model.addAttribute("tid",
 * paymentReady.getTid()); log.info("결재고유 번호: " + paymentReady.getTid()); //
 * Order정보를 모델에 저장 model.addAttribute("order",order);
 * 
 * return paymentReady; // 클라이언트에 보냄.(tid,next_redirect_pc_url이 담겨있음.) }
 * 
 * // 결제승인요청
 * 
 * @GetMapping("/payment/completed") public String
 * payCompleted(@RequestParam("pg_token") String pgToken, @ModelAttribute("tid")
 * String tid, @ModelAttribute("order") Order order, Model model) {
 * 
 * log.info("결제승인 요청을 인증하는 토큰: " + pgToken); log.info("주문정보: " + order);
 * log.info("결재고유 번호: " + tid);
 * 
 * // 카카오 결재 요청하기 PaymentApproval paymentApproval =
 * PaymentService.payApprove(tid, pgToken);
 * 
 * // 5. payment 저장 // orderNo, payMathod, 주문명. // - 카카오 페이로 넘겨받은 결재정보값을 저장.
 * Payment payment = Payment.builder()
 * .paymentClassName(paymentApproval.getItem_name())
 * .payMathod(paymentApproval.getPayment_method_type()) .payCode(tid) .build();
 * 
 * PaymentService.saveOrder(order,payment);
 * 
 * return "redirect:/orders"; } // 결제 취소시 실행 url
 * 
 * @GetMapping("/payment/cancel") public String payCancel() { return
 * "redirect:/carts"; }
 * 
 * // 결제 실패시 실행 url
 * 
 * @GetMapping("/payment/fail") public String payFail() { return
 * "redirect:/carts"; }
 * 
 * 
 */

/*
 * @Autowired private UserService userService;
 * 
 * @RequestMapping("/payment.payment")
 * 
 * @ResponseBody public String kakaopay() { try { URL 주소 = new
 * URL("https://kapi.kakao.com/v1/payment/ready"); HttpURLConnection 서버연결 =
 * (HttpURLConnection) 주소.openConnection(); 서버연결.setRequestMethod("POST");
 * 서버연결.addRequestProperty("Authorization",
 * "KakaoAK 5bad5fbfe423a47edbc7e1cf29963ed3");
 * 서버연결.setRequestProperty("Content-type",
 * "application/x-www-form-urlencoded;charset=utf-8"); 서버연결.setDoOutput(true);
 * String 파라미터 =
 * "cid = TC0ONETIME&partner_order_id&partner_user_id=partner_user_id&item_name=engitem&quantity=1&total_amount=2200&tax_free_amount=0&approval_url=http://localhost8010/payment&fail_url=http://localhost8010/fail&cancel_url=http://localhost8010/cancel"
 * ; OutputStream 주는애 = 서버연결.getOutputStream(); DataOutputStream 데이터주는애 = new
 * DataOutputStream(주는애); 데이터주는애.writeBytes(파라미터); 데이터주는애.close();
 * 
 * int 결과 = 서버연결.getResponseCode();
 * 
 * InputStream 받는애; if(결과==200) { 받는애 = 서버연결.getInputStream(); }else { 받는애 =
 * 서버연결.getErrorStream(); } InputStreamReader 읽는애 = new InputStreamReader(받는애);
 * BufferedReader 형변환하는애 = new BufferedReader(읽는애); return 형변환하는애.readLine();
 * }catch(MalformedURLException e) { e.printStackTrace(); }catch(IOException e)
 * { e.printStackTrace(); } return "{\"result\":\"NO\"}"; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * &fail_url=http://localhost8010/fail&cancel_url=http://localhost8010/cancel
 */
