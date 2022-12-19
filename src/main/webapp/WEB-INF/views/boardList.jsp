<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/boardList.css">
</head>
<body>
<div class="wrapper">
  <div class="box">
    <h1 class="h1">게시판</h1>
    <table border="1" class="sub_news" cellspacing="0" summary="게시판의 글제목 리스트">
      <caption>게시판 리스트</caption>
      <colgroup>
      <col>
      <col width="110">
      <col width="80">
      </colgroup>
      <thead>
      <tr>
          <th scope="col">제목</th>
          <th scope="col">작성자</th>
          <th scope="col">날짜</th>
          <th scope="col">조회수</th>
      </tr> 
      </thead>    
      <tbody>
      <tr>
        <td class="title">
          <a href="#">기부자들</a>
          <img width="13" height="12" class="pic" alt="첨부이미지 ic_pic.gif"><a class="comment" href="#">[5]</a>
          <img width="10" height="9" class="new" src="첨부파일/ic_new.gif">
        </td>
          <td class="name">기부자들</td>
          <td class="date">2022/12/25</td>
          <td class="hit">1234</td>
      </tr>
      <tr>
        <td class="title">
          <a href="#">기부자들</a>
          <img width="13" height="12" class="pic" alt="첨부이미지 ic_pic.gif"><a class="comment" href="#">[5]</a>
          <img width="10" height="9" class="new" src="첨부파일/ic_new.gif">
        </td>
          <td class="name">기부자들</td>
          <td class="date">2022/12/25</td>
          <td class="hit">1234</td>
      </tr>
      <tr>
        <td class="title">
          <a href="#">기부자들</a>
          <img width="13" height="12" class="pic" alt="첨부이미지 ic_pic.gif"><a class="comment" href="#">[5]</a>
          <img width="10" height="9" class="new" src="첨부파일/ic_new.gif">
        </td>
          <td class="name">기부자들</td>
          <td class="date">2022/12/25</td>
          <td class="hit">1234</td>
      </tr>
      </tbody> 
    </table> 
    <button type="submit" class="write"><img src="../image/writeImoticon.jpeg.jpeg" class="writeImoticonPic">글쓰기 </button></p>  
</body>
</html>