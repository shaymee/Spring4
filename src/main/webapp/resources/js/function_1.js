/**
 * 
 */
 
let fn2 = function(){
	alert(' "zzzz!" Electric shock!');
	fn1();
};

let d3 = document.getElementById("d3");
/*d3.onmouseenter=fn2;*/
d3.addEventListener("mouseleave", fn2);

  function fn1(){
 	alert('fn1');
 }