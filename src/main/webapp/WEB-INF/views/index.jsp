<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="/css/index.css">
  <link rel="stylesheet" href="/css/header.css">
  <script src="https://kit.fontawesome.com/ecb3ecb40d.js" crossorigin="anonymous"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="/css/footer.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;500;900&display=swap" rel="stylesheet">
</head>
<body>
 <!-- 헤더 컨테이너 --><!-- 헤더 컨테이너 --><!-- 헤더 컨테이너 --><!-- 헤더 컨테이너 --><!-- 헤더 컨테이너 --><!-- 헤더 컨테이너 -->

  <div id="nav-wrap">
    <nav class="navi">
      <div class="navContainer">
          <a class="logo-area" href="#page-top"><h1>기부자들</h1></a>
          <button class="openMenu dnone" type="button" >
              Menu
          </button>
          <div class="nav-menu" >
              <ul class="nav-ul">
                  <li class="nav-item">
                    <a class="nav-link" href="#" onclick="openSup()">
                      <span class="frame-btn__text">후원</span>
                    </a>
                  </li>
                  <li id="fundBtn" class="nav-item">
                    <a class="nav-link" href="#"onclick="openFund()">
                      <span class="frame-btn__text">펀딩</span>
                    </a>
                  </li>
                  <li id="boardBtn" class="nav-item">
                    <a class="nav-link" href="#"onclick="openBoard()">
                      <span class="frame-btn__text">게시판</span>
                    </a>
                  </li>
                  <li id="infoBtn" class="nav-item">
                    <a class="nav-link frame-btn" href="#"onclick="openInfo()">
                      <span class="frame-btn__text">소개</span>
                    </a>
                  </li>
              </ul>
              <button class="fast-sup">
                  <span class="">
                      <span class="sup-color">빠른 후원</span>
                  </span>
              </button>
              <ul class="user-ul">
                <!--로그인-->
                <li>
                  <a href="#"><i class="fa-solid fa-right-to-bracket"></i></a>
                </li> 
                <!--마이페이지-->
                <li class="dnone">
                  <a href="#"><i class="fa-solid fa-user"></i></a>
                </li>
                <li>
                  <a href="#">영수증</a>
                </li>
              </ul>
          </div>
      </div>
    </nav>
    <div class="hov-menu">
      <div id="sup-menu" class="dnone-menu dnone">
        <ul>
          <li>
            <a href="#">소년/소녀가장</a>
          </li>
          <li>
            <a href="#">한부모 가정</a>
          </li>
          <li>
            <a href="#">독거노인 가정</a>
          </li>
        </ul>
      </div>
      <div id="fund-menu" class="dnone-menu dnone">
        <ul>
          <li>
            <a href="#">1:3 같이 양육</a>
          </li>
          <li>
            <a href="#">1:5 같이 양육</a>
          </li>
          <li>
            <a href="#"></a>
          </li>
        </ul>
      </div>
      <div id="board-menu" class="dnone-menu dnone">
        <ul>
          <li>
            <a href="#">공지사항</a>
          </li>
          <li>
            <a href="#">게시글 보기</a>
          </li>
          <li>
            <a href="#">후기</a>
          </li>
        </ul>
      </div>
      <div id="info-menu" class="dnone-menu dnone">
        <ul>
          <li>
            <a href="#">소개글</a>
          </li>
          <li>
            <a href="#">찾아오시는 길</a>
          </li>
          <li>
            <a href="#">FAQ</a>
          </li>
        </ul>
      </div>
    </div>
  </div>

  <script src="js/header.js"></script>

  <!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- -->

 <!-- 슬라이드쇼 컨테이너 -->

<div class="main_box">

  <ul class="slides">
    <input type="radio" name="radio-btn" id="img-1" checked />
    <li class="slide-container">
    <div class="slide">
      <img src="/images/20200106_091012-1024x768.jpg" style="width:100%" height="700px">
        </div>
    <div class="nav">
      <label for="img-6" class="prev">&#x2039;</label>
      <label for="img-2" class="next">&#x203a;</label>
    </div>
    </li>

    <input type="radio" name="radio-btn" id="img-2" />
    <li class="slide-container">
        <div class="slide">
          <img src="/images/aloneBoy.jpg" style="width:100%" height="700px">
        </div>
    <div class="nav">
      <label for="img-1" class="prev">&#x2039;</label>
      <label for="img-3" class="next">&#x203a;</label>
    </div>
    </li>

    <input type="radio" name="radio-btn" id="img-3" />
    <li class="slide-container">
        <div class="slide">
          <img src="/images/brother&sister.png" style="width:100%" height="700px">
        </div>
    <div class="nav">
      <label for="img-2" class="prev">&#x2039;</label>
      <label for="img-4" class="next">&#x203a;</label>
    </div>
    </li>

    <li class="nav-dots">
      <label for="img-1" class="nav-dot" id="img-dot-1"></label>
      <label for="img-2" class="nav-dot" id="img-dot-2"></label>
      <label for="img-3" class="nav-dot" id="img-dot-3"></label>
    </li>
  </ul>
<script>
  var slideIndex =0;
  auto_slide();

  function auto_slide(){
    var radioBtn = document.getElementsByName("radio-btn");
    var slideItem = radioBtn[slideIndex];
    slideItem.checked=true;
    slideIndex++;
    if(slideIndex == 7){
      slideIndex = 0;
    }
    setTimeout(auto_slide, 5000);
  }
</script>

 <!-- ------------------------------------------------------------------------------- -->

 <div class="youtubeBackground">
  <section class="video">
    <iframe width="880" height="450" src="https://www.youtube.com/embed/SGSYiCaUmwg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
  </section>
 </div>  

  <section class="introduce">
    <div class="confidence_logo"><strong>100%</strong></div>
    <p>기부자들은 후원금 <strong>전부를</strong> 취약계층에게 전액 지급합니다.
      기부 대상자는 관할 동사무소에서 지급받은 증빙자료와 
      담당 매니저가 직접 찾아가 상담을 받은 후 
      지급 관리 대상자가 될 수 있습니다.</p>
  </section>

  <section class="support">
    <p><strong>당신의 소중한 관심이 취약계층에겐 따뜻한 밥 한끼가 됩니다.</strong>&nbsp;&nbsp;&nbsp;
      <button type="submit" id="submit"><a href="">후원하기</a></button></p>
  </section>

  <!-- 푸터 컨테이너 --><!-- 푸터 컨테이너 --><!-- 푸터 컨테이너 --><!-- 푸터 컨테이너 --><!-- 푸터 컨테이너 -->
  
  <div class="footer">
    <ul class="footer_link">
      <li><a href="#">이용약관</a></li>
      <li><a href="#">개인정보 처리방침</a></li>
      <li><a href="#">오시는 길</a></li>
      <li><a href="#">FAQ</a></li>
      <li>후원문의 : 031-243-2111</li>
    </ul>
    <ul class="footer_addr">
      <li>사단법인 기부자들</li>
      <li>대표자:차민건, 조재현, 김보성</li>
      <li>경기도 수원시 팔달구 매산로 12-1, 2~4층</li>
    </ul>
  </div>

  <!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- --><!-- -->

</div>


</body>
</html>