var Type = {
	'Test' :1,
	'One':2,
}

function new1() {
	var username = "javainuse-client";
var password = "javainuse-secret";

var url = 'http:localhost:9090/test';
$.ajax({
    url: url,
    success: function(json) {
        alert("Success", json);
    },
    error: function(XMLHttpRequest, textStatus, errorThrown) {
       alert(textStatus, errorThrown);
    },

    //headers: {'Authorization': 'Basic bWFkaHNvbWUxMjM='},
    beforeSend: function (xhr) {
      xhr.setRequestHeader ("Authorization", "Basic " + btoa(username + ":" + password));
    },
    type: 'GET',
    contentType: 'json',
});
}
//new1();

function init(){
	alert("hi"+Type.Test);
	
	
	var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
	  if (xhttp.readyState === XMLHttpRequest.DONE) {
    if (this.status == 200) {
		alert(this.responseText);
		//var obj= JSON.parse(this.responseText);
			  // alert(obj.deal_pred[0].Confidence_scr);
      //document.getElementById("demo").innerHTML = this.responseText;
    }
	else if (this.status == 400) {
              alert('There was an error 400'+this.responseText);
           }
           else {
               alert('something else other than 200 was returned'+this.responseText);
           }
	  }
  };
  xhttp.open("POST", "https://13.75.106.59/syntbots-ai/deal_predictor/ai/pred");//https://13.75.106.59/syntbots-ai/deal_predictor/ai/pred
   xhttp.setRequestHeader("Content-Type", "application/json");
  //xhttp.setRequestHeader("Access-Control-Allow-Origin", "*");
  //xhttp.setRequestHeader("Access-Control-Allow-Methods", 'GET,PUT,POST,DELETE');
 // xhttp.setRequestHeader("Access-Control-Allow-Headers", "Content-Type");
  //xhttp.setRequestHeader("Authorization", "Bearer 9d3d7dce-efb9-4858-a338-0017f19ef36d");
  //xhttp.withCredentials = false;
  //xhttp.setRequestHeader('Authorization', 'Bearer ' + window.btoa('sbaiserviceuser:@$yNtBOT$Pwd123$'));
  xhttp.send(formToJSON());
	
	
	
/* $.ajax({
    type: 'POST',
    contentType: 'application/json',
    url: "http://13.75.106.59:8081/ai/pred",
    dataType: "json",
    data: formToJSON(),
    success: function(data, textStatus, jqXHR){
    	
    		 alert('Hotel created successfully::::: '+textStatus);
    	        
    	        alert('Hotel  id ::::::: '+data);
    	
       
       
    },
    error: function(jqXHR, textStatus, errorThrown){
        alert('Hotel error: ' + textStatus);
    }
}); */

}
function formToJSON() {
    return JSON.stringify({
       /*  "city": $('#cityId').val(),
        "description": $('#descriptionId').val(),
        "name": $('#nameId').val(),
        "rating": $('#ratingId').val() */
		
		"deal" : {
            "Vertical": 1.0,
            "ServiceOffering": 1.0,
            "EngagementModel": 2.0,
            "OpportunityType": 3.0,
            "Country": 10.0,
            "ProjectDurationinMonths": 12.0,
            "syntel_EstimatedGM": -1.0,
            "Revenue_USD": 651408.0,
            "Services": 4.0,
            "SubServices": 1.0,
            "ProactiveDeal": 0.0,
            "Syntbots": 0.0,
            "CyberSecurity": 0.0,
            "IndustrySolution": 0.0,
            "Quarter": 3.0
            }
        
        });
}
init();
//new1();