/**
 * 
 */
 
const btn = document.getElementById("btn");
// const를 쓰는 이유: 여기에다 한번 넣고 변경하지 않는다는 의지(?) 반영
const c1 = document.getElementsByClassName("c1");
const c2 = document.getElementsByClassName("c2");

let ar = ['a', 'b', 'c'];

for(let s of c1){
	s.addEventListener('click', function(){
		// data-writer-num=??
		let num = s.dataset.writerNum;
		
		num = document.getElementById('w'+num);
		alert(num.innerHTML);
	});
};


/*for(let i in c1){
	let id = document.getElementById('id'+i);
	id.addEventListener('click', function(){
		alert('id'+i);
	});
};*/


//이벤트 거는법: 태그에서 걸든가, 선택자.on이벤트, 선택자.addEventListenter를 쓸거냐(통상적으로는 EventListener 많이 씀)
btn.addEventListener("click", function(){		
	
	for(let i of c1){
		alert(i.innerHTML);
	};
	
/*	ar.forEach(function(v, i, ar){
		console.log(v, i, ar);
	});*/
	
	
/*	for(let i of ar){
		console.log(i);
	}*/
	
	
/*	for(let i in ar){
		console.log(ar[i]);
	}*/
	
/*	for(let i=0;i<ar.length;i++){
		console.log(ar[i]);
	} <-- 옛날 방식의 for문 */
	
});