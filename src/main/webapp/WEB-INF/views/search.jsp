<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
    
 <div class="search_container">

    <div class="search_filter">
      <div class="filter_head">
        <button class="filter_btn">필터
          <div class="arrow-wrap">
            <span class="arrow-top" style="color:rgb(28, 171, 226);">↑</span>
            <span class="arrow-bottom" style="color:rgb(28, 171, 226);">↓</span>
          </div>
        </button>


        <div class="filter_toggle" style="display:none">
          <div class="filter">
            <h3>성별</h3>
            <ul class="fil_gen_ul">
              <li class="gender_form"><input type="radio" id="gen1" name="genSelect" value="전체" checked>
                <label for="gen1" class="fil_label">전체</label>
              </li>
              <li class="gender_form"><input type="radio" id="gen2" name="genSelect" value="전체">
                <label for="gen2" class="fil_label">남자</label>
              </li>
              <li class="gender_form"><input type="radio" id="gen3" name="genSelect" value="전체">
                <label for="gen3" class="fil_label">여자</label>
              </li>
            </ul>
          </div>
          <div class="filter">
            <h3>나이</h3>
            <div class="middle">
              <div class="multi-range-slider">
                <!-- 진짜 슬라이더 -->
                <input type="range" id="input-left" min="0" max="100" value="25" />
                <input type="range" id="input-right" min="0" max="100" value="75" />

                <!-- 커스텀 슬라이더 -->
                <div class="slider">
                  <div class="track"></div>
                  <div class="range"></div>
                  <div class="thumb left"></div>
                  <div class="thumb right"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="filter">
            <h3>지역</h3>
            <div class="fil_select">
              <select class="filt_select">
                <option value="-1" selected>전체</option>
                <option value="SE">서울</option>
                <optino value="GE">경기도</optino>
                <option value="GA">강원도</option>
                <option value="CN">충청남도</option>
                <option value="CB">충청북도</option>
                <option value="GN">경상남도</option>
                <option value="GB">경상북도</option>
                <option value="JN">전라남도</option>
                <option value="JB">전라북도</option>
              </select>
            </div>
          </div>
          <button class="fil_search_btn">찾기</button>
        </div>
      </div>
    </div>
    <div class="search_ul">
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
      <div class="search_li">
        <div class="search_intro">
          <h3>안녕하세요!<br>저는 AAA입니다</h3>
          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill"
            viewBox="0 0 16 16">
            <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
          </svg>
          <div class="li_intro">
            <ul>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_birth.png">
                <br>n살
              </li>
              <li><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_children_family.png">
                <br>남자
              </li>
            </ul>
          </div>
          <div class="support_btn">
            <div class="cart_btn">
              <button><img
                  src="https://www.compassion.or.kr/resources/fo/compassion/assets/images/common/ico_button_cart.png"></button>
            </div>
            <div class="select_btn">
              <button>바로 후원하기</button>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="noti-paging">
      <ul class="noti-paging-li">
        <li><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
              class="bi bi-chevron-double-left" viewBox="0 0 16 16">
              <path fill-rule="evenodd"
                d="M8.354 1.646a.5.5 0 0 1 0 .708L2.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z" />
              <path fill-rule="evenodd"
                d="M12.354 1.646a.5.5 0 0 1 0 .708L6.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z" />
            </svg></a></li>
        <li><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
            class="bi bi-chevron-left" viewBox="0 0 16 16">
            <path fill-rule="evenodd"
              d="M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z" />
          </svg></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
              class="bi bi-chevron-right" viewBox="0 0 16 16">
              <path fill-rule="evenodd"
                d="M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z" />
            </svg></a></li>
        <li><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
              class="bi bi-chevron-double-right" viewBox="0 0 16 16">
              <path fill-rule="evenodd"
                d="M3.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L9.293 8 3.646 2.354a.5.5 0 0 1 0-.708z" />
              <path fill-rule="evenodd"
                d="M7.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L13.293 8 7.646 2.354a.5.5 0 0 1 0-.708z" />
            </svg></a></li>
      </ul>
    </div>
  </div>
    <%@ include file="layout/footer.jsp"%>