/*This Program is to build a simple object that contains multiple properties and functions.*/

var restaurantMenu={
    name:"Kavali",
    menuItems:[
        
        {
            itemName :"Idle",
            itemPrice:"40"
        },
        {
            itemName : "Dosa",
            itemPrice:"55"
        },
        {
            itemName : "Pulav",
            itemPrice:"80"
        },
        {
            itemName : "FriedRice",
            itemPrice:"80"
        },
       {
            itemName :"GheeRice",
            itemPrice:"90"
       }
    
    ],
    itemLists:function()
    {   
        var menuLists=""
        for(let i=0;i<=4;i++)
        {
            menuLists+=i+"."+this.menuItems[i].itemName+" "+this.menuItems[i].itemPrice+"rs"+"\n"
        }
        alert("Menu:"+"\n"+menuLists)
       
        var ans=prompt("Please Select the available menu Item")
        this.userInput(ans)
        
    },
    userInput:function(number)
    {
        
        alert("You have Selected:"+this.menuItems[number].itemName)
    }
}

restaurantMenu.itemLists()
