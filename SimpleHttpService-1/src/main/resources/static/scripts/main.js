$(function(){

var $firstname =$('#firstname');
var $lastname =$('#lastname');



$('#addemployee').on('click'), function(){


}

$ajax({
type:'POST',
url: 'addemployee',
data:{
		firstname:$name.val(),
		lastname:$lastname.val(),
},
error: function(){
	alert('error saving Employee')
}


}

})
});

