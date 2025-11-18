<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- saved from url=(0068)http://127.0.0.1:5500/20.%ED%99%88%ED%8E%98%EC%9D%B4%EC%A7%80/1.html -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        *{margin: 0; box-sizing: border-box;}
        ul,ol,li {list-style: none; margin: 0; padding:0;}

        header {width: 100%; height: 100%;  margin: 0 auto;}
        #slider {width:100%; height: 100%; margin: 0 auto;}
            #slider > img {width:100%; height: 100%;}
         #bset {width:1200px; height: 200px;  margin: 0px  auto;}
             #bset>h3 {margin-top: 70px; text-align: center; font-size: 40px;}
             #bset>h3>p {text-align: center;font-size: 20px; color: black;}
             .col-md-6 {text-align: right;}
             select {padding: 10px; margin-left: 10px; border-radius: 4px; border: 1px solid rgb(204, 204, 204); width: 150px;}
           
        input {padding: 10px; margin-left: 10px; border-radius: 4px; border: 1px solid rgb(204, 204, 204);
                width: 250px; margin-right: 10px;}
        nav {width:100%; height: 100%; padding: 12px; text-align: center; background-color: black; float: left; margin: 0px 0px}
        nav > ul {font-size: 30px; font-weight: bold; float: center}
        nav > ul > li {float: left; margin: 0 40px;}
        nav > ul > li > a {text-decoration: none; color: rgb(233, 225, 225);}
        nav > ul > li > a:hover {color: white;}
        section{width: 1280px; height: 1500px; background-color: wheat; margin: 0 auto; }
        div {margin-bottom: 50px; color: #000;}
        #Fruit {width: 350px; height: 400px; text-align: center; float: left; margin: 20px 38px 50px;}
            #Fruit>a {margin-bottom: 50px; }
            #Fruit>a>img {width: 80%; margin: 0 30px 0; cursor: pointer;}
            #Fruit>a>img:hover {width: 100%; margin: 0 30px 0;}
            #Fruit>a>h5 {margin-top: 10px; font-size: 25px; }
            #Fruit>a>P,span {margin-top: 10px; font-size: 20px;}
            #Fruit>img {width: 80%; margin: 0 30px 0; cursor: pointer;}
            #Fruit>img:hover {width: 100%; margin: 0 30px 0;}
            #Fruit>h5 {margin-top: 10px; font-size: 25px; }
            #Fruit>P,span {margin-top: 10px; font-size: 20px;}
         footer {width: 100%; height: 70px; background-color: rgb(43, 42, 38); margin: 0 auto; text-align: center;}
           footer>p {color: rgb(255, 255, 255);padding: 20px 0px; margin: 80px 0 0 0 ;}
    </style>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="login.do">로그인</a></li>
                <li><a href="#">회원가입</a></li><br>
            </ul>
            <ul>
                <li><a href="#">과일농장</a></li>
                <li><a href="#">홈으로</a></li>
                <li><a href="#">상세페이지</a></li>
                <li><a href="#">장바구니</a></li>
                <li><a href="#">회사소개</a></li>
                <li><a href="#">게시판</a></li>
            </ul>
        </nav>
    
    </header>
    
    <div id="slider">
        <img src="./Document_files/slider.jpg">
    </div>
    <div id="bset">
        <h3>햇과일 BEST
            <p>농부가 추천하는 제철과일을 만나보세요.</p>
        </h3>   
        <div class="row">
        <input type="text" placeholder="상품명을 입력하세요">
        <button type="button" class="btn btn-out line-success">검색</button>
            <div class="col-md-6">
                <select>
                    <option value="">정렬 선택</option>
                    <option value="low">낮은 가격순</option>
                    <option value="high">높은 가격순</option>
                    <option value="name">이름순</option>
                </select>
            </div>
        </div>    
    </div>  
    

    <section>
        <div a="" id="Fruit">
            <a href="http://127.0.0.1:5500/20.%ED%99%88%ED%8E%98%EC%9D%B4%EC%A7%80/%EC%88%98%EB%B0%95.html">
                <img src="./Document_files/fruit1.jpg">
            <h5>수박</h5>
            <p>당도선별 프리미엄 고당도 하우스수박 5~6kg</p>
            <span>2900</span></a>
        </div>
        <div id="Fruit">
             <img src="../Document_files/fruit9.jpg">
            <h5>망고</h5>
            <p>프리미엄 제주애플망고 1박스</p>
            <span>18500</span>
        </div>
        <div id="Fruit">
             <img src="./Document_files/fruit2.jpg">
            <h5>참외</h5>
            <p>산지직송 성주 달콤참외 3kg</p>
            <span>16900</span>
        </div>
        <div id="Fruit">
             <img src="./Document_files/fruit3.jpg">
            <h5>사과</h5>
            <p>고씨네농장 고당도 청송사과, 햇부사</p>
            <span>13000</span>
        </div>
        <div id="Fruit">
             <img src="./Document_files/fruit4.jpg">
            <h5>바나나</h5>
            <p>델몬트 필리핀 바나나 6kg</p>
            <span>15000</span>
        </div>
        <div id="Fruit"> <img src="./Document_files/fruit5.jpg">
            <h5>딸기</h5>
            <p>설향 딸기, 킹스베리 1박스</p>
            <span>14500</span>
        </div>
        <div id="Fruit"> <img src="./Document_files/fruit6.jpg">
            <h5>오렌지</h5>
            <p>캘리포니아 네이블 오렌지 4kg</p>
            <span>17000</span>
        </div>
        <div id="Fruit"> <img src="./Document_files/fruit7.jpg">
            <h5>토마토</h5>
            <p>행복한 농부 완숙찰토마토 5kg</p>
            <span>20000</span>
        </div>
        <div id="Fruit"> <img src="./Document_files/fruit8.jpg">
            <h5>포도</h5>
            <p>팜앤프릇 프리미엄 아삭한 애플청포도</p>
            <span>25000</span>
        </div>
    </section>
    <footer><p>COPYRICHT(C) 2025 과일농장, lnc. All Rights Reserved</p></footer>
<!-- Code injected by live-server -->
<script>
	// <![CDATA[  <-- For SVG support
	if ('WebSocket' in window) {
		(function () {
			function refreshCSS() {
				var sheets = [].slice.call(document.getElementsByTagName("link"));
				var head = document.getElementsByTagName("head")[0];
				for (var i = 0; i < sheets.length; ++i) {
					var elem = sheets[i];
					var parent = elem.parentElement || head;
					parent.removeChild(elem);
					var rel = elem.rel;
					if (elem.href && typeof rel != "string" || rel.length == 0 || rel.toLowerCase() == "stylesheet") {
						var url = elem.href.replace(/(&|\?)_cacheOverride=\d+/, '');
						elem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());
					}
					parent.appendChild(elem);
				}
			}
			var protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
			var address = protocol + window.location.host + window.location.pathname + '/ws';
			var socket = new WebSocket(address);
			socket.onmessage = function (msg) {
				if (msg.data == 'reload') window.location.reload();
				else if (msg.data == 'refreshcss') refreshCSS();
			};
			if (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {
				console.log('Live reload enabled.');
				sessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);
			}
		})();
	}
	else {
		console.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');
	}
	// ]]>
</script>

</body></html>