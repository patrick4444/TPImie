var socket = new WebSocket("ws://localhost:8080/TPWebsocket/tuto");
//var socket = new WebSocket("ws://10.1.103.10:8080/Chat/tuto");

socket.onmessage = function (event){
	//console.dir(event);
	//console.log(event.data);
	var data = JSON.parse(event.data);
	var text = $('#in').text();
	$('#in').text(data.msg + "\n" + text);
//	console.dir(data);
//	console.log(data.c);
//	console.log(data.d);
}

$(document).ready(function() {
	$('body').on('click', '#btn', function (e){
		var data = { msg : $('#out').val() };
		socket.send(JSON.stringify(data));
	}); 
});
