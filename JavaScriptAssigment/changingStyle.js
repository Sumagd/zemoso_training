//Changing HTML and Styles
document.getElementById("h1").innerHTML="Welcome to my site!"
document.getElementById("p1").innerHTML="My name is Suma GD"

var remove=document.getElementById("h2")
document.getElementById("main").removeChild(remove)

document.getElementById("p2").style.color="blue"
document.getElementById("p2").innerHTML="I love JavaScript"