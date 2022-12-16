<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
    <form class="join_form">
      <div class="form_group">
        <label class="form_name">아이디</label>
        <div class="idForm">
        <!-- 서버전송하는 id추가 -->
          <input name="username" type="text" placeholder="Enter UserId" class="input_id" id="username">
          <button type="submit" class="double_check">중복확인</button>
        </div>
      </div>
      <div class="form_group">
        <label class="form_name">비밀번호</label>
        <input name="password" type="password" placeholder="Enter UserPassword" class="input_text" id=password>
      </div>
      <div class="form_group">
        <label class="form_name">비밀번호 확인</label>
        <input name="userPwdCheck" type="password" placeholder="Enter UserPassword" class="input_text">
      </div>
      <div class="form_group">
        <label class="form_name">성명</label>
        <input name="userName" type="text" placeholder="Enter UserName" class="input_text" id="name">
      </div>
      <div class="form_group">
        <label class="form_name">생년월일</label>
        <input name="userBirth" type="number" placeholder="Enter UserBirth" class="input_text" id="birth">
      </div>
      <!--휴대폰 번호 인증 설정 안함-->
      <div class="form_group">
        <label class="form_name">휴대폰 번호</label>
        <div class="idForm">
          <input name="userPhone" type="number" placeholder="Enter UserId" class="input_id" id="tel">
          <button type="submit" class="double_check">본인인증</button>
        </div>
      </div>
      <div class="form_group">
        <label class="form_name">이메일</label>
        <input name="userEmail" type="email" placeholder="Enter UserEmail" class="input_text" id="email">
      </div>
      <div class="form_group">
        <label class="form_name">정보 수신 동의(선택)</label>
        <div class="agree">
          <label class="inputCheck">
            <input type="checkbox" name="phoneAgree"> 모바일
          </label>
          <label class="inputCheck">
            <input type="checkbox" name="emailAgree"> 이메일
          </label>
        </div>
      </div>
      <div class="form_proof">
        <label class="form_name">취약 계층 등록(선택)<br></label>
        <label class="form_name">증빙 서류 등록</label>
        <input type="file" class="proof_file" name="proofFile">
      </div>
      <div class="joinAgree">
        <h2 style="font-size:32px">약관 및 개인정보 수집,이용 동의</h2>
        <hr>
        <div class="agree_container">
          <label class="allAgree">
            <input type="checkbox" name="policyAgree" class="jcheckAll">
            모두 동의합니다
          </label>
        </div>
        <div class="agree_check">
          <label class="agree_checkbox">
            <input type="checkbox" name="policyAgree1" class="jcheckOne">
            [필수]웹사이트 이용약관 동의
          </label>
          <a href="#" class="anchorText">보기</a>
        </div>
        <div class="agree_check">
          <label class="agree_checkbox">
            <input type="checkbox" name="policyAgree2" class="jcheckOne">
            [필수]개인저보 수집,이용 동의
          </label>
          <a href="#" class="anchorText">보기</a>
        </div>
      </div>
      <!-- join_save 추가 -->
      <button id="join_save" type="submit" class="join_btn">가입하기</button>
    </form>
  </div>


<%@ include file="../layout/footer.jsp"%>