/*Code with errors
function btn1Clicked() {
    document.getElementById("p2").innerHTML = "Button 1 was clicked"
    alert("Button 1 was clicked")
}

function charsTyped() {
    var chars = document.getElementById("i1").value

    createString(chars)
}

function createString(someString) {
    document.getElementById("p2").innerText = "Characters typed: " + someString
}

document.getElementById("b2").addEventListener("click", btn2Clicked)

function btn2Clicked() {
    var main = document.getElementById("mains")
    var child = document.getElementById("p5")

    main.removeChild(child)
}

document.getElementById("i2").addEventListener("change", valueEntered)

function valueEntered() {
    var size = document.getElementById("i2").value.length

    document.getElementById("p4").style.fontSize = (size*2) + "em"
}
*/

//Modified Code without errors

function btn1Clicked()
{
    document.getElementById("p1").innerHTML="Button 1 was clicked"
    alert("Button 1 was clicked");
}

function charsTyped(){
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
