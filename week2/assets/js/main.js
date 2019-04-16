// JavaScript Document
var hotelInfo;
var details;
var xhr = new XMLHttpRequest();
xhr.open('GET', "assets/data/data.json", true);
xhr.responseType = 'text';
xhr.send();



xhr.onload = function() {
    if(xhr.status === 200) {
        hotelInfo = JSON.parse(xhr.responseText);
        var cardID = localStorage.getItem("cardID");
        display(cardID);
  
    } // end if
} // end function

function display(x) {
	console.log(x);
	document.getElementById('roomName').innerHTML = hotelInfo[x].name;
	document.getElementById('roomLocal').innerHTML = hotelInfo[x].local;
	document.getElementById('desc').innerHTML = hotelInfo[x].description;
	document.getElementById('photo').src = hotelInfo[x].photo[0];
	
	document.getElementById('weekday').innerHTML = hotelInfo[x].cost.weekday;
	document.getElementById('weekend').innerHTML = hotelInfo[x].cost.weekend;

	details = "";
	for(i = 0; i < hotelInfo[x].details.length; i++) {
		details += "<p>" + hotelInfo[x].details[i] + "</p>";
	} // end function

	document.getElementById('details').innerHTML = details;

} // end function