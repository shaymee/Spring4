/**
 * join.js
 */

 const put = document.getElementsByClassName('put'); // 회원가입 기입항목들
 const btnid = document.getElementById('btnid'); // 버튼ID
 const pws = document.getElementsByClassName('pws'); // pw class
 const frm = document.getElementById('frm');
 const id = document.getElementById('id');
 const idResult = document.getElementById('idResult');
 const pwResult = document.getElementById('pwResult');
 const idCheck = document.getElementById('idCheck');
 const pw2 = document.getElementById('pw2');
 
 
 idCheck.addEventListener('click', function(){
	open("./idCheck?id="+id.value, "", "width=400, height=200, top=200, left=300"); 
	// window는 최상위객체이므로 생략가능
});

 pws[1].addEventListener('blur', function(){
	// 비어있는 것들 검사
	let ce = checkEmpty(pws); // let라고 하면 선언된 지역 내에서만 쓰는 지역변수
	// pw 두개의 값이 같은지 검사
	let ce2 = checkEqual(pws[0].value, pws[1].value);
	// pw 글자수 검사
	let cl = checkLength();
	
	if(ce&&ce2&&cl){
		pwResult.innerHTML='pw 입력성공';
	} else {
		alert('pw 재입력');
		pws[0].focus();
	}
});

 btnid.addEventListener("click", function(){
	// 비어있는 것들 검사
	let ce = checkEmpty(put); // let라고 하면 선언된 지역 내에서만 쓰는 지역변수
	// pw 두개의 값이 같은지 검사
	let ce2 = checkEqual(pws[0].value, pws[1].value);
	// pw 글자수 검사
	let cl = checkLength();
	
	if(ce && ce2 && cl){
		//<form>의 event인 'submit' event를 강제 발생시켜줘야 함(<button>이 아니었음)
		frm.submit(); //submit()이라는 event를 강제발생
	} else {
		alert('필수 입력 제대로X');
	}
});


/** password 길이 검사하는 함수(6글자 이상인지, 미만인지) */
function checkLength(){
	let l = pws[0].value.trim().length; // 이번엔 저 위에 선언된 전역변수를 활용(매개변수 활용x)
	if(l>=6){
		return true; //리턴을 만나면 그 즉시 리턴 후 해당 메서드(함수) 종료
	} else {
		return false;
	}
}


/** 값이 같은지 검사하는 함수 */
function checkEqual(check1, check2){ // 매개변수 2개 준 이유는? --> 이렇게도 쓸 수 있다는 걸 쌤이 보여주려고
	return check1 == check2; // 여기서 value속성값 꺼내줄 수도 있음(but, value속성을 사용치않는 다른데서 또 쓸 수 있으니까)
}


/** 값()들이 비어있는지 검사하는 함수 */
function checkEmpty(puts){
	let result = true;
	for(let r of puts){
		if(r.value.trim() == ""){ //value에는 client가 입력한 입력값이 들어가있음
			result = false;
			break;
		}	
	}	
	
	return result;
}

