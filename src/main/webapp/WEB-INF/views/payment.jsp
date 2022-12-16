<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="layout/header.jsp"%>
    
<div class="banner">
    <div class="banner_title">
     <h1>후원하기</h1>
    </div>
  </div> 
  
  <div class="donation_box">

    <div class="money_box">
      <div class="money_explain">
        <h3>잔액</h3>
      </div>
      <br>
      <div class="money_img">
        <img src="../images/예치금Imoticon.png" alt="">
      </div>
      <div class="money_now">  
        <p class="now">100,000<b>원</b></p>       
      </div>
    </div>  

    <div class="first">

      <h3>후원방법</h3>
      <br>
      <div class="choice">
        <input type="radio" class="radio" id="lion1" name="chk_use"><label for="lion1">정기</label>
        <input type="radio" class="radio" id="lion2" name="chk_use"><label for="lion2">일시</label>
      </div>    
    </div>
    <hr>

    <div class="second">
      <h3>후원분야</h3>
      <br>
    <select class="category" name="category">
      <option value="">후원분야 선택</option>
      <option value="">소년,소녀가장</option>
      <option value="">병원비 지원하기</option>
      <option value="">보육원 아이들 돕기</option>
    </select>
    
    </div>

    <hr>

    <div class="third">
      <h3>후원금액(원)</h3>
      <br>

      <div class="select">
        <input type="radio" class="radio" id="select1" name="chk_money"><label for="select1">10,000</label>
        <input type="radio" class="radio" id="select2" name="chk_money"><label for="select2">20,000</label>
        <input type="radio" class="radio" id="select3" name="chk_money"><label for="select3">30,000</label> 
        <input type="radio" class="radio" id="select4" name="chk_money"><label for="select4">40,000</label>
        <input type="radio" class="radio" id="select5" name="chk_money"><label for="select5">50,000</label>          
        <input type="text" class="input_text" placeholder="금액을 입력하세요" id="select6" name="chk_money"><label for="select6"></label> 
      </div>

      </div>

    <hr>

    <button type="submit" class="submit_button">후원하기</button>

  </div>  
      <%@ include file="layout/footer.jsp"%>
  