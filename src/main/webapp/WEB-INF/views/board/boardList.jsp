<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

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

      <div class="boardContainer">
      <h2 class="noTitle">게시판</h2>
      <div class="top_button_box">
      <button type="submit" value="prev" class="viewPost" onclick="location.href='/board/board' "><b>글쓰기</b></button>
    </div>
      <table class="boardt">
        <colgroup>
          <col class="colNum">
          <col class="colTitle">
          <col class="colb">
          <col class="colb">
        </colgroup>
        <thead class="bhead">
          <tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th></tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="${boards.content}">
          <tr class="b_tr">
            <td class="tTitle"><a href="/board/${board.id}" class="btn btn-primary">${board.title}</a></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
      
      
	<!-- search{e} -->
<ul class="pagination justify-content-center">
		<c:choose>
			<c:when test="${boards.first}">
				<li class="page-item disabled"><a class="page-link"
					href="?page=${boards.number-1}">Previous</a></li>
			</c:when>
			<c:otherwise>
				<li class="page-item"><a class="page-link"
					href="?page=${boards.number-1}">Previous</a></li>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${boards.first}">
				<li class="page-item disabled"><a class="page-link"
					href="?page=${boards.number+1}">Next</a></li>
			</c:when>
			<c:otherwise>
				<li class="page-item"><a class="page-link"
					href="?page=${boards.number+1}">Next</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
  
<%@ include file="../layout/footer.jsp"%>  