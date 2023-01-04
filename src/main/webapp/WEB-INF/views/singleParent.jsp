<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<div id="wrap">
  <div id="top-banner">
    <svg id="fullwave" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320">
      <path fill="#5000ca" fill-opacity="1" d="M0,128L24,112C48,96,96,64,144,48C192,32,240,32,288,26.7C336,21,384,11,432,16C480,21,528,43,576,64C624,85,672,107,720,106.7C768,107,816,85,864,69.3C912,53,960,43,1008,42.7C1056,43,1104,53,1152,69.3C1200,85,1248,107,1296,96C1344,85,1392,43,1416,21.3L1440,0L1440,0L1416,0C1392,0,1344,0,1296,0C1248,0,1200,0,1152,0C1104,0,1056,0,1008,0C960,0,912,0,864,0C816,0,768,0,720,0C672,0,624,0,576,0C528,0,480,0,432,0C384,0,336,0,288,0C240,0,192,0,144,0C96,0,48,0,24,0L0,0Z"></path>
    </svg>
    <div id="myPage-info">
      <div id="info-text">
        <H1>로그인</H1>
        <h5>기부자들 로그인</h3>
      </div>
      <div id="myPage-link">
        <a href="">Home</a>&nbsp;&nbsp;>&nbsp;&nbsp;
        <a href="">로그인</a>
      </div>
    </div>
  </div>
</div>
  <div class="explain">
    <h1>매달 취약계층들을 위한 약속</h1>
    <br>
    <br>
    <p><b>한부모가정에게 꾸준히 후원해 주시면
      <br>
      이 가족에게 더 큰 도움을 줄 수 있습니다.
      <br>
      정기후원은 안정적인 후원금 확보로 한부모가정에게 행복한 삶을
      <br>
      위한 장기적인 지원을 가능하게 해줍니다.</b></p>
  </div>
  <div class="advertisement">
  <ul>
    <li>
      <div class="first_box">
      <div class="a">
        <img src="/images/singleParent1.png" height="180.77px" width="325.28px">
      </div>
      <div class="b">
        <strong class="ad_title">아이들에게 옷을 선물해보세요.</strong>
      </div>
      <div class="c"> 
        <p>아이의 사회성을 길러줍니다.</p>
      </div>
      <div class="d">
        <button type="button" color="yellow" onclick="location.href='/payment' ">후원하기</button>
      </div>
      </div>
    </li>

    <li>
      <div class="second_box">
      <div class="a">
        <img src="/images/singleParent3.png" height="180.77px" width="325.28px">
      </div>
      <div class="b">
        <strong class="ad_title">가족에게 행복을 주세요</strong>
      </div>
      <div class="c"> 
        <p>미래가 밝습니다.</p>
      </div>
      <div class="d">
        <button type="button" color="yellow" onclick="location.href='/payment' ">후원하기</button>
      </div>
      </div>
    </li>

    <li>
      <div class="third_box">
      <div class="a">
        <img src="/images/singleParent4.png" height="180.77px" width="325.28px">
      </div>
      <div class="b">
        <strong class="ad_title">양육비에 도움을 주세요.</strong>
      </div>
      <div class="c"> 
        <p>양육에 큰 힘이 됩니다.</p>
      </div>
      <div class="d">
        <button type="button" color="yellow" onclick="location.href='/payment' ">후원하기</button>
      </div>
      </div>
    </li>
  </ul>
  </div>
<%@ include file="layout/footer.jsp"%>