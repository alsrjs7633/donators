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
        <H1>게시판</H1>
        <h5>기부자들 게시판</h3>
      </div>
      <div id="myPage-link">
        <a href="">Home</a>&nbsp;&nbsp;>&nbsp;&nbsp;
        <a href="">게시판</a>
      </div>
    </div>
  </div>
</div>


  
    <div class="top_button_box">
      <button type="submit" value="prev" class="prev_button"><b>▲이전글</b></button>
      <button type="submit" value="next" class="next_button"><b>▼다음글</b></button>
      <button type="submit" value="list" class="list_button"><b>목록</b></button>
    </div>


  <div class="boardDeatil_box">  
    <div class="boardDetail_box">

      <div class="article_header">
        <div class="title_box">
          <h2 class="title">[기부자들] 에 관하여</h2>
        </div>

        <div class="writer_top_box">
          <div class="writer_box">
            <div class="user_imoticon"><img src="/images/user_imoticon.png" alt=""></div>
            <p class="writer_id">어이야디어차</p>
            <button type="submit" value="chatting" class="chatting"><b>1:1채팅</b></button>
            <p class="now_time">2022/12/13 07:17 조회수 8000</p>
          </div>
 
         <!-- <div class="reply_copy_box">
            <div class="reply">
              <p>댓글</p>
            </div>
            <div class="copy">
              <p>URL복사</p>
            </div>
          </div> --> 
        </div> 
      </div>

      <hr>

      <div class="post_box">
        <div class="post">
          <p>제가 이번에 사회생활을 시작하면서 조금이나마 정기후원을 할려고 하는데 
            <br>주변에서는 인터넷사이트로 신후원신청을 하는건 별로라는 얘기가 많더라구요. 
            <br>저는 제가 후원하는 돈이 정말 필요한 사람한테 가서 좋은일에 쓰였으면 좋겠습니다. 
            <br>제가 고아원이나 이런데도 생각을 해봤는데 고작 몇만원이라 그러지는 못할거 같습니다. 
            <br>좋은곳이 있으면 추천을좀 해주세요</p>
        </div> 
      </div>

      <div class="post_advertisement_box">
          <div class="post_advertisement"><img src="/images/advertisement_banner.png" class="ad_banner"></div>
      </div>

  

      <div class="writer_post_box">
        <div class="writer_post">
          <div class="writer_imoticon"><img src="/images/user_imoticon.png" class="writer_second_imoticon"></div>
          <div class="wirter_post_button"><button type="submit" value="writer_post_button">조잰님의 게시글 더보기 ></button></div>
        </div>
      </div>

       <hr>

      <div class="registed_reply_box">
        <div class="first_reply">
          <div class="first_reply_imoticon"><img src="/images/user_imoticon.png" class="reply_imoticon"></div>
          
          <div class="reply_main">
            <p><b>아이스바닐라와사비</b>
            <br>제게 쪽지를 보내주시면 친절하게 설명드리겠습니다.</p>
          </div>

          <div class="reply_decoration">
            <p class="reply_time">2022/12/13 07:17</p>
            <p class="lets_reply">답글쓰기</p>
          </div>
        
        </div>
      </div>

      <div class="reply_3dot_button_box">
          <img src="/images/reply_3dot_button.png" class="reply_3dot_button">
      </div>

      <div class="posting_box">
        <div class="posting_title">
          <h4>댓글</h4>
        </div>
        <textarea placeholder="댓글을 남겨보세요." class="textarea"></textarea>
        
        <div class="textarea_imoticon_box">
            <button class="textarea_first_imoticon"><img src="/images/reply_camera_button_imoticon.png" class="reply_camera_button_imoticon_img"></button>
            <button class="textarea_second_imoticon"><img src="/images/reply_smiling_button_imoticon.png" class="reply_smiling_button_imoticon_img"></button>
            <button class="lets_reply_button">등록</button>
        </div>
      
      </div>

    </div>

  </div>  
  
<%@ include file="layout/footer.jsp"%>
