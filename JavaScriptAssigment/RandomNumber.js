//This Program is used to create a function that takes in 2 numbers,min and max and returns only want only whole numbers. No decimals.

function randomNumber(min,max)
{   min=Math.ceil(min)
    max=Math.floor(max)
    var num=Math.floor(Math.random()*(max-min))+min
    console.log(num)
}