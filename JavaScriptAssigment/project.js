//Events and EventListeners 
function btnPressed()
{
    document.getElementById("p1").innerHTML="Button 1 was clicked"
    alert("Button 1 was clicked");
}

function textTyped(){
    var chars=document.getElementById("i1").value
    document.getElementById("p2").innerText="Characters typed:"+chars.length
}


document.getElementById("b2").addEventListener("click",btnclicked)

function btnclicked()
{
   var removePara=document.getElementById("p3")
   document.getElementById("main").removeChild(removePara)
}

document.getElementById("i2").addEventListener("change",changeSize)

function changeSize()
{
    var size=document.getElementById("i2").value.length
    document.getElementById("p4").style.fontSize=size+"em"
}