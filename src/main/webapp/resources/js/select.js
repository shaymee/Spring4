/**
 * select.js
 */
 
 const c1 = document.getElementsByClassName('c1');
 const btn = document.getElementById('btn');
 
 btn.addEventListener("click", function(){
	for(let c of c1){
		c.checked=true;
	};
});

/*for(let ch of c1){};*/
	
/*	if(ch.checked){
		ch.checked = !ch.checked;
	} else {
		ch.checked = !ch.checked;
	} [체크 반대로 하기]*/

 for(let ch of c1){//ch ==> let 등을 안붙이면 전역변수가 돼버림
	ch.addEventListener('click', function(){
		alert(ch.checked);	
	});
};
