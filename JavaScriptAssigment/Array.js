/*Program that takes the input from the user and stores 1 t0 5 answers to last index of the array
 and the 6Th input should be stored at the 0th index and to pop the last element from the array*/
var books=[]
var answer
answer=prompt("What is your 1st favorite book")
books.push(answer)
answer=prompt("What is your 2st favorite book")
books.push(answer)
answer=prompt("What is your 3rd favorite book")
books.push(answer)
answer=prompt("What is your 4th favorite book")
books.push(answer)
answer=prompt("What is your 5th favorite book")
books.push(answer)
answer=prompt("What is your 6st favorite book")
books.unshift(answer)
books.pop(answer)
