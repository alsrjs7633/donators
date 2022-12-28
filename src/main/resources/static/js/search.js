

//양방향 슬라이더 구현
const inputLeft = document.getElementById("input-left");
const inputRight = document.getElementById("input-right");

const thumbLeft = document.querySelector(".slider > .thumb.left");
const thumbRight = document.querySelector(".slider > .thumb.right");
const range = document.querySelector(".slider > .range");

const setLeftValue = () => {
  const _this = inputLeft;
  const [min, max] = [parseInt(_this.min), parseInt(_this.max)];
  
  // 교차되지 않게, 1을 빼준 건 완전히 겹치기보다는 어느 정도 간격을 남겨두기 위해.
  _this.value = Math.min(parseInt(_this.value), parseInt(inputRight.value) - 1);
  
  // input, thumb 같이 움직이도록
  const percent = ((_this.value - min) / (max - min)) * 100;
  thumbLeft.style.left = percent + "%";
  range.style.left = percent + "%";
  thumbLeft.innerHTML=parseInt(percent);
};

const setRightValue = () => {
  const _this = inputRight;
  const [min, max] = [parseInt(_this.min), parseInt(_this.max)];
  
  // 교차되지 않게, 1을 더해준 건 완전히 겹치기보다는 어느 정도 간격을 남겨두기 위해.
  _this.value = Math.max(parseInt(_this.value), parseInt(inputLeft.value) + 1);
  
  // input, thumb 같이 움직이도록
  const percent = ((_this.value - min) / (max - min)) * 100;
  thumbRight.style.right = 100 - percent + "%";
  range.style.right = 100 - percent + "%";
  thumbRight.innerHTML=parseInt(percent);
};

inputLeft.addEventListener("input", setLeftValue);
inputRight.addEventListener("input", setRightValue);

//필터 검색 구현부분
//조건만 걸어두기
$(".fil_search_btn").on("click",function(e){
	if("${uploadFile.users.area}"=="${.filt_select}"){
		if("${uploadFile.users.birth}">"${#input-left}"){// input left right 두개 비교
			if("${uploadFile.users.birth}"<"${#input-right}"){
				if("${uploadFile.users.gender}"=="input[name='genSelect']"){
					
				}
			}
		}
	}
	//${uploadFile.users.area}지역
	//${uploadFile.users.birth}나이
	//${uploadFile.users.gender}성별
})























//토글하기
$(".filter_btn").click(function() {
  $(this).next(".filter_toggle").stop().slideToggle(300);
  $(this).toggleClass('on').siblings().removeClass('on');
});