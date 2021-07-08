//Applying unit Testing function on Rock,Paper,Scissors Game
//Function for Rock,Paper,Scissors Game
function rps(player1, player2) {
    if ( player1 == "r") {                                                      //if Player1 selects rock
        if (player2 == "r") {
            return "Tie"
        } else if (player2 == "p") {
            return "Paper beats rock. Player 2 wins."
        } else if (player2 == "s") {
            return "Rock beats scissors. Player 1 wins."
        } else {
            return "Player 2 made an invalid selection."
        }                           
    } else if (player1 == "p") {                                              //if Player1 selects Paper
        if (player2 == "r") {
            return "Paper beats rock. Player 1 wins."
        } else if (player2 == "p") {
            return "Tie"
        } else if (player2 == "s") {
            return "Scissors beat paper. Player 2 wins."
        } else {
            return "Player 2 made an invalid selection."
        }
    } else if ( player1 == "s") {                                           //if Player1 selects scissors
        if (player2 == "r") {
            return "Rock beats scissors. Player 2 wins."
        } else if (player2 == "p") {
            return "Scissors beats paper. Player 1 wins."
        } else if (player2 == "s") {
            return "Tie"
        } else {
            return "Player 2 made an invalid selection."
        }
    } else {
        return "Player 1 made an invalid selection."
    }
}


// unit Testing code 
function test(name, expected, actual) {
    if (expected === actual) {
      console.log(name + "\n- Test passed. Expected: " + expected + "is equal to Actual: "+ actual)
    } else {
      console.log(name + "\n- Test failed. Expected: " + expected + "is not equal to Actual: "+ actual)
    }
  }


//Player 1 selects rock
test("If player 1 chooses rock and player two chooses paper", "Paper beats rock. Player 2 wins.", rps("r","p"))
test("If player 1 chooses rock and player two chooses scissors","Rock beats scissors. Player 1 wins.", rps("r","s"))
test("If player one and player two choose rock", "Tie", rps("r", "r"))

//Invalid for rock
test("If Player 1 made an invalid selection", "Player 1 made an invalid selection.", rps("b","r"))
test("If player 2 made an invalid selection", "Player 2 made an invalid selection.", rps("r","b"))


//Player 1 selects Paper
test("If player 1 chooses paper and player two chooses rock", "Paper beats rock. Player 1 wins.", rps("p", "r"))
test("If player 1 chooses paper and player two chooses paper", "Tie", rps("p","p"))
test("If player 1 chooses paper and player two chooses scissors", "Scissors beat paper. Player 2 wins.", rps("p", "s"))


//Invalid for Paper
test("If player 2 made an invalid selection", "Player 2 made an invalid selection.", rps("p", "b"))
test("If player 2 made an invalid selection", "Player 1 made an invalid selection.", rps("b", "p"))


//Player 1 selects scissors
test("If player 1 chooses scissors and player two choose rock", "Rock beats scissors. Player 2 wins.", rps("s", "r"))
test("If player 1 chooses scissors and player two chooses paper", "Scissors beats paper. Player 1 wins.", rps("s", "p"))
test("If player 1 chooses scissors and player two chooses scissors", "Tie", rps("s", "s"))


//Invalid for scissors
test("If player 2 made an invalid selection", "Player 2 made an invalid selection.", rps("s","b"))
test("If player 2 made an invalid selection", "Player 1 made an invalid selection.", rps("b","s"))






