<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/boardDetail.css">
</head>
<body>

  <div class="banner">
    <div class="banner_title">
     <h1>게시판</h1>
    </div>
    <div class="banner_title_explain">
     <p>기부자들의 목소리</p>
    </div>
  </div>

      <!-- <br> -->

  
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
</body>
</html>