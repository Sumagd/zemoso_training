/*This Program is to build a simple app that calculates the amount of change or money back 
due to the user after purchasing an item.*/
var amount=prompt("Hi,Your Purchase cost is 5000rs,Please enter the amount that you are paying")
var purchaseAmount=5000
var balance
function changeCalculator(amount)
{
     balance=purchaseAmount-amount
    return balance
}
changeCalculator(amount)
if(balance==0)
{
    
    console.log("You gave the exact amount")
}
else if(balance<0)
{   
    balance=amount-purchaseAmount
    console.log("You gave too much.Your change due is "+"$"+balance)
}
else if(balance>0)
{
    console.log("You gave too little.Your change due is"+" $"+balance)
}