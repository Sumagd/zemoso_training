//Program that displays a triangle
/*      *
        **
        ***
        ****
        *****
*/
var square=""
for(var rows=0;rows<5;rows++)
{
    for(cols=0;rows>=cols;cols++)
    {
        square=square+"*"
    }
    square=square+"\n"
}
console.log(square)