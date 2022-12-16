<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="body">
    <h2 style="margin:30px 0 80px 0;font-size: 3.45vw;text-align: center;"> sign in</h2>
    <form class="login_form">
      <div class="form_gr">
        <input type="text" name="loginId" placeholder="아이디" class="form_con" id="username">
      </div>
      <div class="form_gr">
        <input type="password" name="passwordId" placeholder="비밀번호" class="form_con" id="password">
      </div>
      <div class="form_check">
        <label>
          <input name="remember" class="form-check-input" type="checkbox">아이디 저장
        </label>
        <a href="#" class="find">아이디/비밀번호 찾기</a>
      </div>
      <button type="submit" class="login_btn" id="btn-login">로그인</button>
      <button type="submit" class="login_btn">회원가입</button>
      
    </form>
  </div>

<%@ include file="../layout/footer.jsp"%>