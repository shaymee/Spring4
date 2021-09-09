/**
 * 
 */
   
 let fn1 = function() {
	alert(title.getAttribute("title"));
};
 
 const d1 = document.getElementById("d1");
 d1.addEventListener("click", function(){
	const title = document.getElementById("title");
	const writer = document.getElementById("writer");
	const frm = document.getElementById("frm");
	const div1 = document.getElementById("div1");
	const div2 = document.getElementById("div2");
	div1.innerHTML="";
	div2.innerHTML="";
	
		
	let t = title.value;
	let w = writer.value;	

	//1
	/*if(t != "" && w != ""){
		alert(true);
	} else {
		alert(false);
	}*/

	//2
	let check = true;
	
	if(t==""){
		check=false;
		div1.innerHTML="필수입력";
	}
	
	if(w==""){
		check=false;
		div2.innerHTML="필수입력";
	}
	
/*	if(check){
		frm.submit();
		alert('작성 완료');
	} else if(!check && t == "" && w != ""){
		div1.innerHTML='제목이 없시유';
		alert(div1.innerHTML);
	} else if(!check && w == "" && t != ""){
		div2.innerHTML='글쓴이명이 없시유';
		alert(div2.innerHTML);
	} else {
		div1.innerHTML='제목이 없시유';
		div2.innerHTML='글쓴이명이 없시유';
		alert('제목, 글쓴이명 둘다 없시유');
	}*/

	
});
 
 
 
 


