$(document).ready(function(){
    /*$("#main").append("<button id=\"readButton\" th:onclick=\"|window.location.href='/book/read'|\"></button>");
    $("#readButton").click();
    $("#readButton").remove();*/
    table = $("#readTable");
    trs = table.find("tr");
    for(var i = 1; i < trs.length; i++){
        tr = trs[i];
        if(i % 2 == 0){
            tr.className = "even";
        }else{
            tr.className = "odd";
        }
    }
});